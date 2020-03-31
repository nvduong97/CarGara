/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.model;

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
public class BillTest {
    
    public BillTest() {
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
     * Test of getBillID method, of class Bill.
     */
    @Test
    public void testGetBillID() {
        System.out.println("getBillID");
        Bill instance = new Bill();
        int expResult = 0;
        int result = instance.getBillID();
        assertEquals(expResult, result);
        return;
    }

    /**
     * Test of setBillID method, of class Bill.
     */
    @Test
    public void testSetBillID() {
        System.out.println("setBillID");
        int billID = 0;
        Bill instance = new Bill();
        instance.setBillID(billID);
        // TODO review the generated test code and remove the default call to fail.
        return;
    }

    /**
     * Test of getCustomerID method, of class Bill.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        Bill instance = new Bill();
        int expResult = 0;
        int result = instance.getCustomerID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCustomerID method, of class Bill.
     */
    @Test
    public void testSetCustomerID() {
        System.out.println("setCustomerID");
        int customerID = 0;
        Bill instance = new Bill();
        instance.setCustomerID(customerID);
    }

    /**
     * Test of getCarID method, of class Bill.
     */
    @Test
    public void testGetCarID() {
        System.out.println("getCarID");
        Bill instance = new Bill();
        int expResult = 0;
        int result = instance.getCarID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCarID method, of class Bill.
     */
    @Test
    public void testSetCarID() {
        System.out.println("setCarID");
        int carID = 0;
        Bill instance = new Bill();
        instance.setCarID(carID);
    }

    /**
     * Test of getTotalMoney method, of class Bill.
     */
    @Test
    public void testGetTotalMoney() {
        System.out.println("getTotalMoney");
        Bill instance = new Bill();
        int expResult = 0;
        int result = instance.getTotalMoney();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTotalMoney method, of class Bill.
     */
    @Test
    public void testSetTotalMoney() {
        System.out.println("setTotalMoney");
        int totalMoney = 0;
        Bill instance = new Bill();
        instance.setTotalMoney(totalMoney);
    }
    
}
