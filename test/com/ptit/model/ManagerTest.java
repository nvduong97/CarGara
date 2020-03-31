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
public class ManagerTest {
    
    public ManagerTest() {
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
     * Test of getManagerID method, of class Manager.
     */
    @Test
    public void testGetManagerID() {
        System.out.println("getManagerID");
        Manager instance = new Manager("managerID", null, null);
        String expResult = "managerID";
        String result = instance.getManagerID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManagerID method, of class Manager.
     */
    @Test
    public void testSetManagerID() {
        System.out.println("setManagerID");
        String managerID = "";
        Manager instance = new Manager();
        instance.setManagerID(managerID);
    }

    /**
     * Test of getAccount method, of class Manager.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        Manager instance = new Manager(null, "account", null);
        String expResult = "account";
        String result = instance.getAccount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAccount method, of class Manager.
     */
    @Test
    public void testSetAccount() {
        System.out.println("setAccount");
        String account = "";
        Manager instance = new Manager();
        instance.setAccount(account);
    }

    /**
     * Test of getPassword method, of class Manager.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Manager instance = new Manager(null, null, "password");
        String expResult = "password";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class Manager.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Manager instance = new Manager();
        instance.setPassword(password);
    }
    
}
