/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import com.ptit.model.Slot;
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
public class SlotDAO {

    public List<Slot> selectSlot() {
        List<Slot> list = null;
        String sql = "SELECT slotID,slotName,status FROM Slot WHERE status = N'Rảnh'";
        Connection connect = null;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            Statement stmt = connect.createStatement();
            list = new ArrayList<Slot>();
            ResultSet rs = stmt.executeQuery(sql);
            Slot slot = null;
            while (rs.next()) {
                slot = new Slot();
                slot.setSlotID(rs.getInt(1));
                slot.setSlotName(rs.getString(2));
                slot.setStatus(rs.getString(3));
                list.add(slot);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public int updateSlot(Slot slot) {
        String sql = "UPDATE Slot SET status = N'Bận' WHERE slotID = ?";
        Connection connect = null;
        int row = 0;
        try {
             connect = DatabaseConnect.getInstance().getConnection();
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setInt(1, slot.getSlotID());
            row = prepar.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }
}
