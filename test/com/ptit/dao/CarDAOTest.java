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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DUONGNV
 */
public class CarDAOTest {

    public CarDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllCar method, of class CarDAO.
     */
    @Test
    public void testGetAllCar() {
        System.out.println("getAllCar");
        CarDAO instance = new CarDAO();
        List<Car> list = instance.getAllCar();
        boolean expResult = true;
        boolean result = false;
        if (!list.isEmpty()) {
            result = true;
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of insearCar method, of class CarDAO.
     */
      @Test
    public void testInsearCar() {
        System.out.println("insearCar");
        Car car = new Car(0, 1, "38M1-12387", "model", "maker", "note");
        int expResult = 1;             
        
        Connection connect = null;
        int result = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            connect.setAutoCommit(false); 
            String sql = "INSERT INTO Car VALUES(?,?,?,?,?)";
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setString(1, car.getLicense());
            prepar.setString(2, car.getModel());
            prepar.setString(3, car.getMaker());
            prepar.setString(4, car.getNote());
            prepar.setInt(5, car.getCustomerID());
            result = prepar.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connect != null) {
                try {                   
                    connect.rollback();
                    connect.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        assertEquals(expResult, result);
    }
    /**
     * Test of selectCar method, of class CarDAO.
     */
    @Test
    public void testSelectCar() {
        System.out.println("selectCar");
        int key = 0;
        CarDAO instance = new CarDAO();
        List<Car> expResult = new ArrayList<>();
        List<Car> result = instance.selectCar(key);
        assertEquals(expResult, result);
    }

}
