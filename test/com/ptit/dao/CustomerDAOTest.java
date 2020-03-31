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
public class CustomerDAOTest {

    public CustomerDAOTest() {
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
     * Test of getAllCustomer method, of class CustomerDAO.
     */
    @Test
    public void testGetAllCustomer() {
        System.out.println("getAllCustomer");
        CustomerDAO instance = new CustomerDAO();
        boolean expResult = true;
        List<Customer> list = instance.getAllCustomer();
        boolean result = true;
        if (list.isEmpty()) {
            result = false;
        }
        assertEquals(expResult, result);

    }

    /**
     * Test of insertCustomer method, of class CustomerDAO.
     */
    @Test
    public void testInsertCustomer() {
        System.out.println("insertCustomer");
        Customer customer = new Customer(0, "Nguyen Van Duong", "address", "phone", "11/11/1997", "note");
        int expResult = 1;
        
        Connection connect = null;
        int result = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            connect.setAutoCommit(false);
            String sql = "INSERT INTO Customer VALUES(?,?,?,?,?)";
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setString(1, customer.getFullName());
            prepar.setString(2, customer.getBirthDate());
            prepar.setString(3, customer.getAddress());
            prepar.setString(4, customer.getPhone());
            prepar.setString(5, customer.getNote());
            result = prepar.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOTest.class.getName()).log(Level.SEVERE, null, ex);
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
     * Test of selectCustomer method, of class CustomerDAO.
     */
    @Test
    public void testSelectCustomer() {
        System.out.println("selectCustomer");
        String key = "";
        CustomerDAO instance = new CustomerDAO();
        boolean expResult = false;
        List<Customer> list = instance.selectCustomer(key);
        boolean result = true;
        if (list.isEmpty()) {
            result = false;
        }
        assertEquals(expResult, result);
    }

}
