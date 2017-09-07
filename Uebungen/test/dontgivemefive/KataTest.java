/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dontgivemefive;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hendrik.Albers
 */
public class KataTest {
    
    public KataTest() {
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
     * Test of dontGiveMeFive method, of class Kata.
     */
    @Test
    public void testDontGiveMeFive() {
        assertEquals(8, Kata.dontGiveMeFive(1, 9));
        assertEquals(12, Kata.dontGiveMeFive(4, 17));
    }
    
}
