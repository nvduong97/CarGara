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
public class DetailBillTest {
    
    public DetailBillTest() {
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
     * Test of getBillID method, of class DetailBill.
     */
    @Test
    public void testGetBillID() {
        System.out.println("getBillID");
        DetailBill instance = new DetailBill();
        int expResult = 0;
        int result = instance.getBillID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBillID method, of class DetailBill.
     */
    @Test
    public void testSetBillID() {
        System.out.println("setBillID");
        int billID = 0;
        DetailBill instance = new DetailBill();
        instance.setBillID(billID);
    }

    /**
     * Test of getDetailBill method, of class DetailBill.
     */
    @Test
    public void testGetDetailBill() {
        System.out.println("getDetailBill");
        DetailBill instance = new DetailBill(0, "DetailBill", 0);
        String expResult = "DetailBill";
        String result = instance.getDetailBill();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDetailBill method, of class DetailBill.
     */
    @Test
    public void testSetDetailBill() {
        System.out.println("setDetailBill");
        String DetailBill = "";
        DetailBill instance = new DetailBill();
        instance.setDetailBill(DetailBill);
    }

    /**
     * Test of getAmount method, of class DetailBill.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        DetailBill instance = new DetailBill();
        int expResult = 0;
        int result = instance.getAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAmount method, of class DetailBill.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        int amount = 0;
        DetailBill instance = new DetailBill();
        instance.setAmount(amount);
    }
    
}
