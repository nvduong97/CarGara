/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.model.Service;
import java.util.ArrayList;
import java.util.List;
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
public class ServiceDAOTest {
    
    public ServiceDAOTest() {
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
     * Test of selectService method, of class ServiceDAO.
     */
    @Test
    public void testSelectService() {
        System.out.println("selectService");
        String key = "";
        ServiceDAO instance = new ServiceDAO();
        List<Service> expResult = new ArrayList<>();
        List<Service> result = instance.selectService(key);
        assertEquals(expResult, result);
    }
    
}
