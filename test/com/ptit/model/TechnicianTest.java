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
public class TechnicianTest {
    
    public TechnicianTest() {
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
     * Test of getID method, of class Technician.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Technician instance = new Technician();
        instance.setID("ID");
        String expResult = "ID";
        String result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setID method, of class Technician.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        String ID = "";
        Technician instance = new Technician();
        instance.setID(ID);
    }

    /**
     * Test of getStatus method, of class Technician.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Technician instance = new Technician();
        instance.setStatus("status");
        String expResult = "status";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class Technician.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Technician instance = new Technician();
        instance.setStatus(status);
    }

    /**
     * Test of getFullName method, of class Technician.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Technician instance = new Technician();
        instance.setFullName("fullName");
        String expResult = "fullName";
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFullName method, of class Technician.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = "";
        Technician instance = new Technician();
        instance.setFullName(fullName);
    }

    /**
     * Test of getPhone method, of class Technician.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Technician instance = new Technician();
        instance.setPhone("phone");
        String expResult = "phone";
        String result = instance.getPhone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhone method, of class Technician.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        Technician instance = new Technician();
        instance.setPhone(phone);
    }
    
}
