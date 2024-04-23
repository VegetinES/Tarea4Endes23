/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        try {
            probarIngresar(objetoCuenta, 1000, 3500);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            probarRetirar(objetoCuenta, 100, 3400);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void probarIngresar(CCuenta c, int cantidad, double cantidadEsperada) throws Exception{
        c.ingresar(cantidad);
        
        if (c.estado() != cantidadEsperada) {
            throw new Exception("No se ha ingresado correctamente");
        }
    }
    
    public static void probarRetirar(CCuenta c, int cantidad, double cantidadEsperada) throws Exception{
        c.retirar(cantidad);
        
        if (c.estado() != cantidadEsperada) {
            throw new Exception("No se ha retirado correctamente");
        }
    }
}
