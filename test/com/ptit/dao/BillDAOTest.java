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
public class BillDAOTest {

    public BillDAOTest() {
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
     * Test of insertBill method, of class BillDAO.
     */
    @Test
    public void testInsertBill() {
        System.out.println("insertBill");
        Bill bill = new Bill(1, 1, 1000000);
        int expResult = 1;
        Connection connect = null;
        int result = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            connect.setAutoCommit(false);
            String sql = "INSERT INTO Bill VALUES(?,?,?)";
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setInt(1, bill.getCustomerID());
            prepar.setInt(2, bill.getCarID());
            prepar.setInt(3, bill.getTotalMoney());
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
     * Test of updateBill method, of class BillDAO.
     */
    @Test
    public void testUpdateBill() {
        System.out.println("updateBill");
        Bill bill = new Bill(1, 4, 0);
        bill.setBillID(4);
        int expResult = 1;
        Connection connect = null;
        int result = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            connect.setAutoCommit(false);
            String sql = "UPDATE Bill SET totalMoney = ? WHERE billID = ?";
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setInt(1, bill.getTotalMoney());
            prepar.setInt(2, bill.getBillID());
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

}
