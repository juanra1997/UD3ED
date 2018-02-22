/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaed;

//import java.util.Arrays;
//import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Juanra
 */
public class FraccionTest {
    private static Fraccion frac1;
    private static Fraccion frac2;
    private static Fraccion frac3;
    
    public FraccionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    frac1=new Fraccion(3,4);
    frac2=new Fraccion(1);
    frac3=new Fraccion(5,6);
    }
    
    @AfterClass
    public static void tearDownClass() {
    frac1=new Fraccion();
    frac2=new Fraccion();
    frac3=new Fraccion();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Fraccion.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Fraccion expResult = new Fraccion(7, 4);
        Fraccion result = Fraccion.sumar(frac1, frac2);
        assertEquals(expResult.aString(), result.aString());
        
        System.out.println("sumar");
        Fraccion expResult1 = new Fraccion(38, 24);
        Fraccion result1 = Fraccion.sumar(frac1, frac3);
        assertEquals(expResult1.aString(), result1.aString());
        
        System.out.println("sumar");
        Fraccion expResult2 = new Fraccion(11, 6);
        Fraccion result2 = Fraccion.sumar(frac2, frac3);
        assertEquals(expResult2.aString(), result2.aString());
    }

    /**
     * Test of restar method, of class Fraccion.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        Fraccion expResult = new Fraccion(-1, 4);
        Fraccion result = Fraccion.restar(frac1, frac2);
        assertEquals(expResult.aString(), result.aString());
        
        System.out.println("restar");
        Fraccion expResult1 = new Fraccion(-2, 24);
        Fraccion result1 = Fraccion.restar(frac1, frac3);
        assertEquals(expResult1.aString(), result1.aString());
        
        System.out.println("restar");
        Fraccion expResult2 = new Fraccion(1, 6);
        Fraccion result2 = Fraccion.restar(frac2, frac3);
        assertEquals(expResult2.aString(), result2.aString());
    }

    /**
     * Test of multiplicar method, of class Fraccion.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Fraccion expResult = new Fraccion(3,4);
        Fraccion result = Fraccion.multiplicar(frac1, frac2);
        assertEquals(expResult.aString(), result.aString());
        
        System.out.println("multiplicar");
        Fraccion expResult1 = new Fraccion(15, 24);
        Fraccion result1 = Fraccion.multiplicar(frac1, frac3);
        assertEquals(expResult1.aString(), result1.aString());
        
        System.out.println("multiplicar");
        Fraccion expResult2 = new Fraccion(5, 6);
        Fraccion result2 = Fraccion.multiplicar(frac2, frac3);
        assertEquals(expResult2.aString(), result2.aString());
    }

    /**
     * Test of inversa method, of class Fraccion.
     */
    @Test
    public void testInversa() {
        System.out.println("inversa");
        Fraccion expResult = new Fraccion(4, 3);
        Fraccion result = Fraccion.inversa(frac1);
        assertEquals(expResult.aString(), result.aString());
        
        System.out.println("inversa");
        Fraccion expResult1 = new Fraccion(1, 1);
        Fraccion result1 = Fraccion.inversa(frac2);
        assertEquals(expResult1.aString(), result1.aString());
        
        System.out.println("inversa");
        Fraccion expResult2 = new Fraccion(6, 5);
        Fraccion result2 = Fraccion.inversa(frac3);
        assertEquals(expResult2.aString(), result2.aString());
    }

    /**
     * Test of dividir method, of class Fraccion.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Fraccion expResult = new Fraccion(3, 4);
        Fraccion result = Fraccion.dividir(frac1, frac2);
        assertEquals(expResult.aString(), result.aString());
        
        System.out.println("dividir");
        Fraccion expResult1 = new Fraccion(18, 20);
        Fraccion result1 = Fraccion.dividir(frac1, frac3);
        assertEquals(expResult1.aString(), result1.aString());
        
        System.out.println("dividir");
        Fraccion expResult2 = new Fraccion(6, 5);
        Fraccion result2 = Fraccion.dividir(frac2, frac3);
        assertEquals(expResult2.aString(), result2.aString());
    }

    /**
     * Test of aString method, of class Fraccion.
     */
    @Test
    public void testAString() {
        System.out.println("aString");
        String expResult = "3/4";
        String result = frac1.aString();
        assertEquals(expResult, result);
        
        System.out.println("aString");
        String expResult1 = " 1";
        String result1 = frac2.aString();
        assertEquals(expResult1, result1);
        
        System.out.println("aString");
        String expResult2 = "5/6";
        String result2 = frac3.aString();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of simplificar method, of class Fraccion.
     */
    @Test
    public void testSimplificar() {
        System.out.println("simplificar");
        Fraccion instance = new Fraccion(4, 4);
        Fraccion expResult = new Fraccion(1,1);
        Fraccion result = instance.simplificar();
        assertEquals(expResult.aString(), result.aString());
    }
    
    /**
     *Test of simplificar exception, of class Fraccion.
     */
    @Test(expected=java.lang.ArithmeticException.class)
    public void testSimplificar0() {
        System.out.println("simplificar excepcion");
        Fraccion simp = new Fraccion(0,0);
        simp.simplificar();
    }
}
 