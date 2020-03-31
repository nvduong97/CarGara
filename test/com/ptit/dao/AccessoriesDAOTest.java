/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.model.Accessories;
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
public class AccessoriesDAOTest {
    
    public AccessoriesDAOTest() {
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
     * Test of selectAccessories method, of class AccessoriesDAO.
     */
    @Test
    public void testSelectAccessories() {
        System.out.println("selectAccessories");
        String key = "key";
        AccessoriesDAO instance = new AccessoriesDAO();
        List<Accessories> expResult = new ArrayList<>();
        List<Accessories> result = instance.selectAccessories(key);
        assertEquals(expResult, result);
    }
    
}
