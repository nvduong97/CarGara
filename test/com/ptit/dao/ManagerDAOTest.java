/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

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
public class ManagerDAOTest {
    
    public ManagerDAOTest() {
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


    @Test
    public void testCheckLogin_false() {
        System.out.println("checkLogin");
        String account = "";
        String pass = "";
        ManagerDAO instance = new ManagerDAO();
        boolean expResult = false;
        boolean result = instance.checkLogin(account, pass);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckLogin_true() {
        System.out.println("checkLogin");
        String account = "duongnv";
        String pass = "duong1234";
        ManagerDAO instance = new ManagerDAO();
        boolean expResult = true;
        boolean result = instance.checkLogin(account, pass);
        assertEquals(expResult, result);
    }
    
}
