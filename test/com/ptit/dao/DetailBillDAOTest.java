/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.model.DetailBill;
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
public class DetailBillDAOTest {
    
    public DetailBillDAOTest() {
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
     * Test of insertDetailBill method, of class DetailBillDAO.
     */
    @Test
    public void testInsertDetailBill() {
        System.out.println("insertDetailBill");
        String sql = "";
        DetailBill detailBill = new DetailBill();
        DetailBillDAO instance = new DetailBillDAO();
        int expResult = 0;
        int result = instance.insertDetailBill(sql, detailBill);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateDetailBill method, of class DetailBillDAO.
     */
    @Test
    public void testUpdateDetailBill() {
        System.out.println("updateDetailBill");
        String sql = "";
        DetailBill detailBill = new DetailBill();
        DetailBillDAO instance = new DetailBillDAO();
        int expResult = 0;
        int result = instance.updateDetailBill(sql, detailBill);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteDetailBill method, of class DetailBillDAO.
     */
    @Test
    public void testDeleteDetailBill() {
        System.out.println("deleteDetailBill");
        String sql = "";
        DetailBill detailBill = new DetailBill();
        DetailBillDAO instance = new DetailBillDAO();
        int expResult = 0;
        int result = instance.deleteDetailBill(sql, detailBill);
        assertEquals(expResult, result);
    }
}
