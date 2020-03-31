/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import com.ptit.model.DetailBill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DUONGNV
 */
public class DetailBillDAO {

    public int insertDetailBill(String sql, DetailBill detailBill) {
        Connection connect = null;
        int row = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();

            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setInt(1, detailBill.getBillID());
            prepar.setString(2, detailBill.getDetailBill());
            prepar.setInt(3, detailBill.getAmount());
            row = prepar.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }

    public int updateDetailBill(String sql, DetailBill detailBill) {
        Connection connect = null;
        int row = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setInt(1, detailBill.getAmount());
            prepar.setString(2, detailBill.getDetailBill());
            prepar.setInt(3, detailBill.getBillID());
            row = prepar.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }

    public int deleteDetailBill(String sql, DetailBill detailBill) {
        Connection connect = null;
        int row = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setString(1, detailBill.getDetailBill());
            prepar.setInt(2, detailBill.getBillID());
            row = prepar.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }
}
