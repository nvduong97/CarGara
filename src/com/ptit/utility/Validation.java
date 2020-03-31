/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.utility;

import com.ptit.dao.CarDAO;
import com.ptit.dao.CustomerDAO;
import com.ptit.model.Car;
import com.ptit.model.Customer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author DUONGNV
 */
public class Validation {

    public static boolean isCustomerValid(Customer cus) {
        if (isNameValid(cus.getFullName()) && isDateValid(cus.getBirthDate()) && isAddressValid(cus.getAddress()) && isPhoneValid(cus.getPhone()) && isNoteValid(cus.getNote())) {
            return true;
        }
        return false;
    }

    public static boolean isCarValid(Car c) {
        if (isLicenseValid(c.getLicense()) && isModelValid(c.getModel()) && isMakerValid(c.getMaker()) && isNoteValid(c.getNote()) && isDupCar(c.getLicense())) {
            return true;
        }
        return false;
    }

    public static boolean isDupCar(String str) {
        CarDAO carDAO = new CarDAO();
        for (Car car : carDAO.getAllCar()) {
            if (car.getLicense().equals(str)) {
                JOptionPane.showMessageDialog(null, "Xe đã tồn tại!", "Xe đã tồn tại!", 1);
                return false;
            }
        }
        return true;
    }

//    public static boolean isDupCustomer(Customer cus) {
//        CustomerDAO customerDAO = new CustomerDAO();
//        for (Customer customer : customerDAO.getAllCustomer()) {
//            if (customer.getFullName().equals(cus.getFullName()) && customer.getPhone().equals(cus.getPhone())) {
//                JOptionPane.showMessageDialog(null, "Khách hàng đã tồn tại!", "Khách hàng đã tồn tại!", 1);
//                return false;
//            }
//        }
//        return true;
//    }
    public static boolean isNameValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Không được để trống thông tin!", 1);
            return false;
        }
        if (str.length() > 40) {
            JOptionPane.showMessageDialog(null, "Họ tên không được quá 40 kí tự!", "Họ tên không được quá 40 kí tự!", 1);
            return false;
        }
        return true;
    }

    public static boolean isAddressValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Không được để trống thông tin!", 1);
            return false;
        }
        if (str.length() > 50) {
            JOptionPane.showMessageDialog(null, "Địa chỉ không được quá 50 kí tự!", "Địa chỉ không được quá 50 kí tự!", 1);
            return false;
        }
        return true;
    }

    public static boolean isDateValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Không được để trống thông tin!", 1);
            return false;
        }
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        try {
            Date date = formatter.parse(str);
            return true;
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Không đúng định dạng MM/dd/yyyy", "Không đúng định dạng MM/dd/yyyy", 1);
            return false;
        }
    }

    public static boolean isPhoneValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Không được để trống thông tin!", 1);
            return false;
        }
        if (str.length() > 20) {
            JOptionPane.showMessageDialog(null, "Số điện thoại không được quá 20 kí tự!", "Số điện thoại không không được quá 20 kí tự!", 1);
            return false;
        }
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Không đúng định dạng!", "Không đúng định dạng!", 1);
            return false;
        }
        return true;
    }

    public static boolean isLicenseValid(String str) {
        String regex = "^\\d{2}[A-Z]\\d{1}[-]\\d{4,5}$";
        if (!str.matches(regex)) {
            JOptionPane.showMessageDialog(null, "Biển số không đúng định dạng!", "Biển số không đúng định dạng!", 1);
            return false;
        }
        return true;
    }

    public static boolean isModelValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Không được để trống thông tin!", 1);
            return false;
        }
        if (str.length() > 40) {
            JOptionPane.showMessageDialog(null, "Loại xe không được quá 40 kí tự!", "Loại xe không được quá 40 kí tự!", 1);
            return false;
        }
        return true;
    }

    public static boolean isMakerValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Không được để trống thông tin!", 1);
            return false;
        }
        if (str.length() > 40) {
            JOptionPane.showMessageDialog(null, "Nhà sản xuất không được quá 40 kí tự!", "Nhà sản xuất không được quá 40 kí tự!", 1);
            return false;
        }
        return true;
    }

    public static boolean isNoteValid(String str) {
        if (str.length() > 200) {
            JOptionPane.showMessageDialog(null, "Ghi chú không được quá 200 kí tự!", "Ghi chú không được quá 200 kí tự!", 1);
            return false;
        }
        return true;
    }

    public static boolean isAmountValid(String m) {
        int n = 0;
        if (m.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống", "Không được để trống", 1);
            return false;
        }
        try {
            n = Integer.parseInt(m);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Bạn phải nhập số", "Bạn phải nhập số", 1);
            return false;
        }
        if (n < 1) {
            JOptionPane.showMessageDialog(null, "Số lượng phải lớn hơn 0", "Số lượng phải lớn hơn 0", 1);
            return false;
        }
        return true;
    }
}
