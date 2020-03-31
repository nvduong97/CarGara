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
public class AccessoriesTest {
    
    public AccessoriesTest() {
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
     * Test of getAccessoriesID method, of class Accessories.
     */
    @Test
    public void testGetAccessoriesID() {
        System.out.println("getAccessoriesID");
        Accessories instance = new Accessories("LK00000",null,0);
        String expResult = "LK00000";
        String result = instance.getAccessoriesID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAccessoriesID method, of class Accessories.
     */
    @Test
    public void testSetAccessoriesID() {
        System.out.println("setAccessoriesID");
        String accessoriesID = "LK00000";
        Accessories instance = new Accessories();
        instance.setAccessoriesID(accessoriesID);
    }

    /**
     * Test of getAccessoriesName method, of class Accessories.
     */
    @Test
    public void testGetAccessoriesName() {
        System.out.println("getAccessoriesName");
        Accessories instance = new Accessories(null,"Duong",0);
        String expResult = "Duong";
        String result = instance.getAccessoriesName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAccessoriesName method, of class Accessories.
     */
    @Test
    public void testSetAccessoriesName() {
        System.out.println("setAccessoriesName");
        String accessoriesName = "Duong";
        Accessories instance = new Accessories();
        instance.setAccessoriesName(accessoriesName);
    }

    /**
     * Test of getAccessoriesPrice method, of class Accessories.
     */
    @Test
    public void testGetAccessoriesPrice() {
        System.out.println("getAccessoriesPrice");
        Accessories instance = new Accessories(null,null,1000);
        int expResult = 1000;
        int result = instance.getAccessoriesPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAccessoriesPrice method, of class Accessories.
     */
    @Test
    public void testSetAccessoriesPrice() {
        System.out.println("setAccessoriesPrice");
        int accessoriesPrice = 1000;
        Accessories instance = new Accessories();
        instance.setAccessoriesPrice(accessoriesPrice);
    }
    
}
