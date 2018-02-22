/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaed;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juanra
 */
public class TablaEnterosTest {
    
    private Integer[] array;
    
    public TablaEnterosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Integer[] array=new Integer[3];
        /*for(int i=0; i<array.length; i++){
            array[i]=i+1;
        }*/
        //TablaEnteros prueba=new TablaEnteros(array);
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
     * Test of sumaTabla method, of class TablaEnteros.
     */
    @Test
    public void testSumaTabla() {
        System.out.println("sumaTabla");
        array=new Integer[3];
        for(int i=0; i<array.length; i++){
            array[i]=i+1;
        }
        TablaEnteros instance = new TablaEnteros(array);
        int expResult = 6;
        int result;
        result = instance.sumaTabla();
        assertEquals(expResult, result);
    }

    /**
     * Test of mayorTabla method, of class TablaEnteros.
     */
    @Test
    public void testMayorTabla() {
        System.out.println("mayorTabla");
        array=new Integer[3];
        for(int i=0; i<array.length; i++){
            array[i]=i+1;
        }
        TablaEnteros instance = new TablaEnteros(array);
        int expResult = 3;
        int result = instance.mayorTabla();
        assertEquals(expResult, result);
    }

    /**
     * Test of posicionTabla method, of class TablaEnteros.
     */
    @Test
    public void testPosicionTabla() {
        System.out.println("posicionTabla");
        array=new Integer[3];
        for(int i=0; i<array.length; i++){
            array[i]=i+1;
        }
        int n = 1;
        TablaEnteros instance = new TablaEnteros(array);
        int expResult = 0;
        int result = instance.posicionTabla(n);
        assertEquals(expResult, result);
    }
    
}
