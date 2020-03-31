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
public class SlotTest {
    
    public SlotTest() {
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
     * Test of getSlotID method, of class Slot.
     */
    @Test
    public void testGetSlotID() {
        System.out.println("getSlotID");
        Slot instance = new Slot();
        int expResult = 0;
        int result = instance.getSlotID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSlotID method, of class Slot.
     */
    @Test
    public void testSetSlotID() {
        System.out.println("setSlotID");
        int slotID = 0;
        Slot instance = new Slot();
        instance.setSlotID(slotID);
    }

    /**
     * Test of getSlotName method, of class Slot.
     */
    @Test
    public void testGetSlotName() {
        System.out.println("getSlotName");
        Slot instance = new Slot();
        instance.setSlotName("SlotName");
        String expResult = "SlotName";
        String result = instance.getSlotName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSlotName method, of class Slot.
     */
    @Test
    public void testSetSlotName() {
        System.out.println("setSlotName");
        String slotName = "";
        Slot instance = new Slot();
        instance.setSlotName(slotName);
    }

    /**
     * Test of getStatus method, of class Slot.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Slot instance = new Slot();
        instance.setStatus("Status");
        String expResult = "Status";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class Slot.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Slot instance = new Slot();
        instance.setStatus(status);
    }
    
}
