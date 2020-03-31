/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.model.Slot;
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
public class SlotDAOTest {

    public SlotDAOTest() {
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
     * Test of selectSlot method, of class SlotDAO.
     */
    @Test
    public void testSelectSlot() {
        System.out.println("selectSlot");
        SlotDAO instance = new SlotDAO();
        boolean expResult = true;
        List<Slot> list = instance.selectSlot();
        boolean result = false;
        if (!list.isEmpty()) {
            result = true;
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of updateSlot method, of class SlotDAO.
     */
    @Test
    public void testUpdateSlot() {
        System.out.println("updateSlot");
        Slot slot = new Slot();
        SlotDAO instance = new SlotDAO();
        int expResult = 0;
        int result = instance.updateSlot(slot);
        assertEquals(expResult, result);
    }

}
