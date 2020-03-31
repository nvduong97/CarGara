/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import com.ptit.model.Accessories;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUONGNV
 */
public class AccessoriesDAO {

    public List<Accessories> selectAccessories(String key) {
        List<Accessories> list = null;
        String sql = "SELECT * FROM Accessories WHERE accessoriesName = N'" + key + "'";
        Connection connect = null;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            Statement stmt = connect.createStatement();
            list = new ArrayList<Accessories>();
            ResultSet rs = stmt.executeQuery(sql);
            Accessories accessories = null;
            while (rs.next()) {
                accessories = new Accessories();
                accessories.setAccessoriesID(rs.getString(1));
                accessories.setAccessoriesName(rs.getString(2));
                accessories.setAccessoriesPrice(rs.getInt(3));
                list.add(accessories);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
