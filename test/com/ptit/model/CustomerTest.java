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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getCustomerID method, of class Customer.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        Customer instance = new Customer();
        int expResult = 0;
        int result = instance.getCustomerID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCustomerID method, of class Customer.
     */
    @Test
    public void testSetCustomerID() {
        System.out.println("setCustomerID");
        int customerID = 0;
        Customer instance = new Customer();
        instance.setCustomerID(customerID);
    }

    /**
     * Test of getFullName method, of class Customer.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Customer instance = new Customer(0, "fullName", null, null, null, null);
        String expResult = "fullName";
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFullName method, of class Customer.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = "";
        Customer instance = new Customer();
        instance.setFullName(fullName);
    }

    /**
     * Test of getAddress method, of class Customer.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Customer instance = new Customer(0, null, "address", null, null, null);
        String expResult = "address";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Customer.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Customer instance = new Customer();
        instance.setAddress(address);
    }

    /**
     * Test of getPhone method, of class Customer.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Customer instance = new Customer(0, null, null, "phone", null, null);
        String expResult = "phone";
        String result = instance.getPhone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhone method, of class Customer.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        Customer instance = new Customer();
        instance.setPhone(phone);
    }

    /**
     * Test of getBirthDate method, of class Customer.
     */
    @Test
    public void testGetBirthDate() {
        System.out.println("getBirthDate");
        Customer instance = new Customer(0, null, null, null, "birthDate", null);
        String expResult = "birthDate";
        String result = instance.getBirthDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBirthDate method, of class Customer.
     */
    @Test
    public void testSetBirthDate() {
        System.out.println("setBirthDate");
        String birthDate = "";
        Customer instance = new Customer();
        instance.setBirthDate(birthDate);
    }

    /**
     * Test of getNote method, of class Customer.
     */
    @Test
    public void testGetNote() {
        System.out.println("getNote");
        Customer instance = new Customer(0, null, null, null, null, "note");
        String expResult = "note";
        String result = instance.getNote();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNote method, of class Customer.
     */
    @Test
    public void testSetNote() {
        System.out.println("setNote");
        String note = "";
        Customer instance = new Customer();
        instance.setNote(note);
    }
    
}
