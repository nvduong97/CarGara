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
public class CarTest {
    
    public CarTest() {
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
     * Test of getCarID method, of class Car.
     */
    @Test
    public void testGetCarID() {
        System.out.println("getCarID");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getCarID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCarID method, of class Car.
     */
    @Test
    public void testSetCarID() {
        System.out.println("setCarID");
        int carID = 0;
        Car instance = new Car();
        instance.setCarID(carID);
    }

    /**
     * Test of getCustomerID method, of class Car.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getCustomerID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCustomerID method, of class Car.
     */
    @Test
    public void testSetCustomerID() {
        System.out.println("setCustomerID");
        int customerID = 0;
        Car instance = new Car();
        instance.setCustomerID(customerID);
    }

    /**
     * Test of getLicense method, of class Car.
     */
    @Test
    public void testGetLicense() {
        System.out.println("getLicense");
        Car instance = new Car(0, 0, "29M1-12345", null, null, null);
        String expResult = "29M1-12345";
        String result = instance.getLicense();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLicense method, of class Car.
     */
    @Test
    public void testSetLicense() {
        System.out.println("setLicense");
        String license = "";
        Car instance = new Car();
        instance.setLicense(license);
    }

    /**
     * Test of getModel method, of class Car.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        Car instance = new Car(0, 0, null, "model", null, null);
        String expResult = "model";
        String result = instance.getModel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setModel method, of class Car.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        String model = "";
        Car instance = new Car();
        instance.setModel(model);
    }

    /**
     * Test of getMaker method, of class Car.
     */
    @Test
    public void testGetMaker() {
        System.out.println("getMaker");
        Car instance = new Car(0, 0, null, null, "Toyota", null);
        String expResult = "Toyota";
        String result = instance.getMaker();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaker method, of class Car.
     */
    @Test
    public void testSetMaker() {
        System.out.println("setMaker");
        String maker = "Toyota";
        Car instance = new Car();
        instance.setMaker(maker);
    }

    /**
     * Test of getNote method, of class Car.
     */
    @Test
    public void testGetNote() {
        System.out.println("getNote");
        Car instance = new Car(0, 0, null, null, null, "note");
        String expResult = "note";
        String result = instance.getNote();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNote method, of class Car.
     */
    @Test
    public void testSetNote() {
        System.out.println("setNote");
        String note = "note";
        Car instance = new Car();
        instance.setNote(note);
    }
    
}
