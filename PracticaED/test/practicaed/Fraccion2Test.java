/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaed;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Juanra
 */
@RunWith(Parameterized.class)
public class Fraccion2Test {
    private Fraccion frac1;
    private Fraccion frac2;
    private Fraccion resul;

    public Fraccion2Test(int num1, int den1, int num2, int den2, int resulNum, int resulDen) {
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
            {8, 3, 4, 6, 60, 18},
            {4, 6, 1, 1, 10, 6}, 
            {5, 2, 3, 4, 26, 8}
        });
    }
    
         @Test
    public void testSumar() {
        /*System.out.println("divide");
        AppCalculadora calcu =  new AppCalculadora(nume1, nume2);
        int resultado = calcu.divide();
        assertEquals(resul, resultado);*/
        System.out.println("sumar");
        //Fraccion expResult = new Fraccion(1, 1);
        Fraccion result=Fraccion.sumar(frac1, frac2);
        //assertEquals(expResult.aString(), result.aString());
        /*Fraccion expResult=new Fraccion(1,1);
        Fraccion result=new Fraccion.sumar(frac1, frac2);
        assertEquals(expResult.aString(), result.aString());*/
        assertEquals(result.aString(), resul.aString());
    }
    
    }
   
    /*public Fraccion2Test() {
    }*/
    
    /*@BeforeClass
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
    }*/

    /**
     * Test of datos method, of class Fraccion.
     */
   /* @Test
    public void testDatos() {
        System.out.println("datos");
        Fraccion expResult = null;
        Fraccion result = Fraccion.datos();
        assertEquals(expResult, result);
    }

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
    }*/

    /**
     * Test of restar method, of class Fraccion.
     */
   /* @Test
    public void testRestar() {
        System.out.println("restar");
        Fraccion a = null;
        Fraccion b = null;
        Fraccion expResult = null;
        Fraccion result = Fraccion.restar(a, b);
        assertEquals(expResult, result);
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
    }*/
//}