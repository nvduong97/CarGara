/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import com.ptit.model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUONGNV
 */
public class CustomerDAO {
    
    public List<Customer> getAllCustomer() {
        List<Customer> customers = null;
        String sql = "SELECT * FROM Car";
        Connection connect = null;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            Statement stmt = connect.createStatement();
            customers = new ArrayList<Customer>();
            ResultSet rs = stmt.executeQuery(sql);
            Customer customer = null;
            while (rs.next()) {
                customer = new Customer();
                customer.setCustomerID(rs.getInt(1));
                customer.setFullName(rs.getString(2));
                customer.setBirthDate(rs.getString(3));
                customer.setAddress(rs.getString(4));
                customer.setPhone(rs.getString(5));
                customer.setNote(rs.getString(6));
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public int insertCustomer(Customer customer) {
        Connection connect = null;
        int row = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            String sql = "INSERT INTO Customer VALUES(?,?,?,?,?)";
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setString(1, customer.getFullName());
            prepar.setString(2, customer.getBirthDate());
            prepar.setString(3, customer.getAddress());
            prepar.setString(4, customer.getPhone());
            prepar.setString(5, customer.getNote());
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

    public List<Customer> selectCustomer(String key) {
        List<Customer> customers = null;
        String sql = "SELECT * FROM Customer WHERE fullName = N'" + key + "'";
        Connection connect = null;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            Statement stmt = connect.createStatement();
            customers = new ArrayList<Customer>();
            ResultSet rs = stmt.executeQuery(sql);
            Customer customer = null;
            while (rs.next()) {
                customer = new Customer();
                customer.setCustomerID(rs.getInt(1));
                customer.setFullName(rs.getString(2));
                customer.setBirthDate(rs.getString(3));
                customer.setAddress(rs.getString(4));
                customer.setPhone(rs.getString(5));
                customer.setNote(rs.getString(6));
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
