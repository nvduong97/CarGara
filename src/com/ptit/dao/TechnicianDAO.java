/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import com.ptit.model.Technician;
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
public class TechnicianDAO {

    public List<Technician> selectTechnician() {
        List<Technician> list = null;
        String sql = "SELECT technicianID,fullName,status,phone FROM Technician WHERE status = N'Rảnh'";
        Connection connect = null;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            Statement stmt = connect.createStatement();
            list = new ArrayList<Technician>();
            ResultSet rs = stmt.executeQuery(sql);
            Technician technician = null;
            while (rs.next()) {
                technician = new Technician();
                technician.setID(rs.getString(1));
                technician.setFullName(rs.getString(2));
                technician.setStatus(rs.getString(3));
                technician.setPhone(rs.getString(4));
                list.add(technician);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public int updateTechnician(Technician technician) {
        String sql = "UPDATE Technician SET status = N'Bận' WHERE technicianID = ?";
        Connection connect = null;
        int row = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setString(1, technician.getID());
            row = prepar.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }
}
