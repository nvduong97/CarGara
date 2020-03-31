/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import com.ptit.model.Technician;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class TechnicianDAOTest {

    public TechnicianDAOTest() {
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
     * Test of selectTechnician method, of class TechnicianDAO.
     */
    @Test
    public void testSelectTechnician() {
        System.out.println("selectTechnician");
        TechnicianDAO instance = new TechnicianDAO();
        boolean expResult = true;
        List<Technician> list = instance.selectTechnician();
        boolean result = false;
        if (!list.isEmpty()) {
            result = true;
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of updateTechnician method, of class TechnicianDAO.
     */
    @Test
    public void testUpdateTechnician() {
        System.out.println("updateTechnician");
        Technician technician = new Technician();
        TechnicianDAO instance = new TechnicianDAO();
        int expResult = 0;
        int result = instance.updateTechnician(technician);
        assertEquals(expResult, result);
    }

}
