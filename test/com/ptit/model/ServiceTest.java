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
public class ServiceTest {
    
    public ServiceTest() {
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
     * Test of getServiceID method, of class Service.
     */
    @Test
    public void testGetServiceID() {
        System.out.println("getServiceID");
        Service instance = new Service("serviceID", null, 0);
        String expResult = "serviceID";
        String result = instance.getServiceID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setServiceID method, of class Service.
     */
    @Test
    public void testSetServiceID() {
        System.out.println("setServiceID");
        String serviceID = "";
        Service instance = new Service();
        instance.setServiceID(serviceID);
    }

    /**
     * Test of getServiceName method, of class Service.
     */
    @Test
    public void testGetServiceName() {
        System.out.println("getServiceName");
        Service instance = new Service(null, "serviceName", 0);
        String expResult = "serviceName";
        String result = instance.getServiceName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setServiceName method, of class Service.
     */
    @Test
    public void testSetServiceName() {
        System.out.println("setServiceName");
        String serviceName = "";
        Service instance = new Service();
        instance.setServiceName(serviceName);
    }

    /**
     * Test of getServicePrice method, of class Service.
     */
    @Test
    public void testGetServicePrice() {
        System.out.println("getServicePrice");
        Service instance = new Service();
        int expResult = 0;
        int result = instance.getServicePrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of setServicePrice method, of class Service.
     */
    @Test
    public void testSetServicePrice() {
        System.out.println("setServicePrice");
        int servicePrice = 0;
        Service instance = new Service();
        instance.setServicePrice(servicePrice);
    }
    
}
