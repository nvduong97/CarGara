/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import com.ptit.model.Bill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DUONGNV
 */
public class BillDAO {

    public int insertBill(Bill bill){
        Connection connect = null;
        int row = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            String sql = "INSERT INTO Bill VALUES(?,?,?)";
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setInt(1, bill.getCustomerID());
            prepar.setInt(2, bill.getCarID());
            prepar.setInt(3, bill.getTotalMoney());
            row = prepar.executeUpdate();
            if (row == 1) {
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT @@IDENTITY");
                while (rs.next()) {
                    row = rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }

    public int updateBill(Bill bill){
        Connection connect = null;
        int row = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            String sql = "UPDATE Bill SET totalMoney = ? WHERE billID = ?";
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setInt(1, bill.getTotalMoney());
            prepar.setInt(2, bill.getBillID());
            row = prepar.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }

}
