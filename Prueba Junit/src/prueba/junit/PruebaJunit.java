/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.junit;

/**
 *
 * @author Juanra
 */
public class PruebaJunit {
    public static int division(int numerador, int denominador){
        int resultado=0;
        try{
            resultado=(numerador/denominador);
        } catch (Exception e) {
            System.out.println("Se ha producido un error: "+e.getMessage());
        }
        return (numerador/denominador);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Resultado de la division: "+division(2,3));
        //A ver que hace
    }
    
}
