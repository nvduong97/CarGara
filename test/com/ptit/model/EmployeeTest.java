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
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of getFullName method, of class Employee.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Employee instance = new Employee("fullName", null, null, null);
        String expResult = "fullName";
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFullName method, of class Employee.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = "";
        Employee instance = new Employee();
        instance.setFullName(fullName);
    }

    /**
     * Test of getAddress method, of class Employee.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Employee instance = new Employee(null, "address", null, null);
        String expResult = "address";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Employee.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Employee instance = new Employee();
        instance.setAddress(address);
    }

    /**
     * Test of getPhone method, of class Employee.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Employee instance = new Employee(null, null, "phone", null);
        String expResult = "phone";
        String result = instance.getPhone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhone method, of class Employee.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        Employee instance = new Employee();
        instance.setPhone(phone);
    }

    /**
     * Test of getBirthDate method, of class Employee.
     */
    @Test
    public void testGetBirthDate() {
        System.out.println("getBirthDate");
        Employee instance = new Employee(null, null, null, "birthDate");
        String expResult = "birthDate";
        String result = instance.getBirthDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBirthDate method, of class Employee.
     */
    @Test
    public void testSetBirthDate() {
        System.out.println("setBirthDate");
        String birthDate = "";
        Employee instance = new Employee();
        instance.setBirthDate(birthDate);
    }
    
}
