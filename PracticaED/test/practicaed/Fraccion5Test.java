/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaed;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Juanra
 */
@RunWith(Parameterized.class)
public class Fraccion5Test {
    private Fraccion frac1;
    private Fraccion frac2;
    private Fraccion resul;

    public Fraccion5Test(int num1, int den1, int num2, int den2, int resulNum, int resulDen) {
        this.frac1 = new Fraccion(num1, den1); 
        this.frac2 = new Fraccion(num2, den2); 
        this.resul = new Fraccion(resulNum, resulDen); // Resultado de la operación
    }

        /**
         *
         * @return
         */
        @Parameterized.Parameters
    public static Collection<Object[]> fracciones() {
        return Arrays.asList(new Object[][] {
            {8, 3, 4, 6, 48, 12},
            {4, 6, 1, 1, 4, 6}, 
            {5, 2, 3, 4, 20, 6}
        });
    }

    @Test
    public void testDividir() {
        System.out.println("dividir");
        Fraccion result = Fraccion.dividir(frac1, frac2);
        assertEquals(result.aString(), resul.aString());
    }
    }
    
    /*public Fraccion3Test() {
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
     * Test of datos method, of class Fraccion.
     */
    /*@Test
    public void testDatos() {
        System.out.println("datos");
        Fraccion expResult = null;
        Fraccion result = Fraccion.datos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of sumar method, of class Fraccion.
     */
    /*@Test
    public void testSumar() {
        System.out.println("sumar");
        Fraccion a = null;
        Fraccion b = null;
        Fraccion expResult = null;
        Fraccion result = Fraccion.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of restar method, of class Fraccion.
     */
    /*@Test
    public void testRestar() {
        System.out.println("restar");
        Fraccion a = null;
        Fraccion b = null;
        Fraccion expResult = null;
        Fraccion result = Fraccion.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of multiplicar method, of class Fraccion.
     */
    /*@Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Fraccion a = null;
        Fraccion b = null;
        Fraccion expResult = null;
        Fraccion result = Fraccion.multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of inversa method, of class Fraccion.
     */
    /*@Test
    public void testInversa() {
        System.out.println("inversa");
        Fraccion a = null;
        Fraccion expResult = null;
        Fraccion result = Fraccion.inversa(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of dividir method, of class Fraccion.
     */
    /*@Test
    public void testDividir() {
        System.out.println("dividir");
        Fraccion a = null;
        Fraccion b = null;
        Fraccion expResult = null;
        Fraccion result = Fraccion.dividir(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of potencia method, of class Fraccion.
     */
    /*@Test
    public void testPotencia() {
        System.out.println("potencia");
        Fraccion a = null;
        Fraccion expResult = null;
        Fraccion result = Fraccion.potencia(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of aString method, of class Fraccion.
     */
    /*@Test
    public void testAString() {
        System.out.println("aString");
        Fraccion instance = new Fraccion();
        String expResult = "";
        String result = instance.aString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of simplificar method, of class Fraccion.
     */
    /*@Test
    public void testSimplificar() {
        System.out.println("simplificar");
        Fraccion instance = new Fraccion();
        Fraccion expResult = null;
        Fraccion result = instance.simplificar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
//}
