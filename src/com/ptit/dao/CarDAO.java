/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import com.ptit.model.Car;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DUONGNV
 */
public class CarDAO {

    public List<Car> getAllCar() {
        List<Car> cars = null;
        String sql = "SELECT * FROM Car";
        Connection connect = null;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            Statement stmt = connect.createStatement();
            cars = new ArrayList<Car>();
            ResultSet rs = stmt.executeQuery(sql);
            Car car = null;
            while (rs.next()) {
                car = new Car();
                car.setCarID(rs.getInt(1));
                car.setLicense(rs.getString(2));
                car.setModel(rs.getString(3));
                car.setMaker(rs.getString(4));
                car.setNote(rs.getString(5));
                car.setCustomerID(rs.getInt(6));
                cars.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }
    
    public int insearCar(Car car) {
        Connection connect = null;
        int row = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            String sql = "INSERT INTO Car VALUES(?,?,?,?,?)";
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setString(1, car.getLicense());
            prepar.setString(2, car.getModel());
            prepar.setString(3, car.getMaker());
            prepar.setString(4, car.getNote());
            prepar.setInt(5, car.getCustomerID());
            row = prepar.executeUpdate();
            if (row == 1) {
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT @@IDENTITY");
                while (rs.next()) {
                    row = rs.getInt(1);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connect != null) {
                try {
                    connect.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return row;
    }

    public List<Car> selectCar(int key) {
        List<Car> cars = null;
        String sql = "SELECT * FROM Car WHERE customerID = '" + key + "'";
        Connection connect = null;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            Statement stmt = connect.createStatement();
            cars = new ArrayList<Car>();
            ResultSet rs = stmt.executeQuery(sql);
            Car car = null;
            while (rs.next()) {
                car = new Car();
                car.setCarID(rs.getInt(1));
                car.setLicense(rs.getString(2));
                car.setModel(rs.getString(3));
                car.setMaker(rs.getString(4));
                car.setNote(rs.getString(5));
                car.setCustomerID(rs.getInt(6));
                cars.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }

}
