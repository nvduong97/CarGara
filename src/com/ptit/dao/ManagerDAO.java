/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DUONGNV
 */
public class ManagerDAO {

    public boolean checkLogin(String account, String pass) {
        String sql = "SELECT * FROM Manager WHERE account = ? AND password = ?";
        Connection connect = null;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setString(1,account);
            prepar.setString(2,pass);
            ResultSet rs = prepar.executeQuery();
            if(rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
