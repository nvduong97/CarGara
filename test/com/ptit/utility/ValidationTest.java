/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.utility;

import com.ptit.model.Car;
import com.ptit.model.Customer;
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
public class ValidationTest {
    
    public ValidationTest() {
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
     * Test of isCustomerValid method, of class Validation.
     */
    @Test
    public void testIsCustomerValid() {
        System.out.println("isCustomerValid");
        Customer cus = new Customer(0, "Duong", "Ha Noi", "092324433", "12", "");
        boolean expResult = false;
        boolean result = Validation.isCustomerValid(cus);
        assertEquals(expResult, result);
    }

    /**
     * Test of isCarValid method, of class Validation.
     */
    @Test
    public void testIsCarValid() {
        System.out.println("isCarValid");
        Car c = new Car(0, 0, "", "", "", "");
        boolean expResult = false;
        boolean result = Validation.isCarValid(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of isDupCar method, of class Validation.
     */
    @Test
    public void testIsDupCar() {
        System.out.println("isDupCar");
        String str = "38M1-88888";
        boolean expResult = false;
        boolean result = Validation.isDupCar(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isDupCustomer method, of class Validation.
     */
//    @Test
//    public void testIsDupCustomer() {
//        System.out.println("isDupCustomer");
//        Customer cus = new Customer(0, "Le Minh Anh", "Ha Dong", "0977665332", "12/02/1997", "");
//        boolean expResult = true;
//        boolean result = Validation.isDupCustomer(cus);
//        assertEquals(expResult, result);
//    }

    /**
     * Test of isNameValid method, of class Validation.
     */
    @Test
    public void testIsNameValid() {
        System.out.println("isNameValid");
        String str = "";
        boolean expResult = false;
        boolean result = Validation.isNameValid(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isAddressValid method, of class Validation.
     */
    @Test
    public void testIsAddressValid() {
        System.out.println("isAddressValid");
        String str = "";
        boolean expResult = false;
        boolean result = Validation.isAddressValid(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isDateValid method, of class Validation.
     */
    @Test
    public void testIsDateValid() {
        System.out.println("isDateValid");
        String str = "";
        boolean expResult = false;
        boolean result = Validation.isDateValid(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPhoneValid method, of class Validation.
     */
    @Test
    public void testIsPhoneValid() {
        System.out.println("isPhoneValid");
        String str = "";
        boolean expResult = false;
        boolean result = Validation.isPhoneValid(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isLicenseValid method, of class Validation.
     */
    @Test
    public void testIsLicenseValid() {
        System.out.println("isLicenseValid");
        String str = "";
        boolean expResult = false;
        boolean result = Validation.isLicenseValid(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isModelValid method, of class Validation.
     */
    @Test
    public void testIsModelValid() {
        System.out.println("isModelValid");
        String str = "";
        boolean expResult = false;
        boolean result = Validation.isModelValid(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isMakerValid method, of class Validation.
     */
    @Test
    public void testIsMakerValid() {
        System.out.println("isMakerValid");
        String str = "";
        boolean expResult = false;
        boolean result = Validation.isMakerValid(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isNoteValid method, of class Validation.
     */
    @Test
    public void testIsNoteValid() {
        System.out.println("isNoteValid");
        String str = "note";
        boolean expResult = true;
        boolean result = Validation.isNoteValid(str);
        assertEquals(expResult, result);
    }
    
}
