/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monnaie;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fc891127
 */
public class MonnaieTest {
    
    public MonnaieTest() {
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
     * Test of plus method, of class Monnaie.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        Monnaie pMontant2 = null;
        Monnaie instance = null;
        Monnaie expResult = null;
        Monnaie result = instance.plus(pMontant2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pourcentage method, of class Monnaie.
     */
    @Test
    public void testPourcentage() {
        System.out.println("pourcentage");
        double pPourcentage = 0.0;
        Monnaie instance = null;
        Monnaie expResult = null;
        Monnaie result = instance.pourcentage(pPourcentage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Monnaie.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Monnaie pMonnaie = null;
        Monnaie instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moins method, of class Monnaie.
     */
    @Test
    public void testMoins() {
        System.out.println("moins");
        Monnaie pMontant2 = null;
        Monnaie instance = null;
        Monnaie expResult = null;
        Monnaie result = instance.moins(pMontant2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
