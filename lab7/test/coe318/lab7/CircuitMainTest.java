/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class CircuitMainTest {
    
    public CircuitMainTest() {
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
     * Test of ressitortt method, of class Resistor.
     */
    @Test
    public void testSpice() {
        System.out.println("resistortt");
        Resistor instance = new Resistor(0, 0, 0);
        instance.Resistortt();
       
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Resistor.
     */
    @Test
    public void testtoString() {
        System.out.println("cRun");
        Resistor instance = new Resistor(0, 0, 0);
        instance.toString();
        
        fail("The test case is a prototype.");
    }
    
}
