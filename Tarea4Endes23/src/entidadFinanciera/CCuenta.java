/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

/**
 *
 * @author Enrique
 */
public class CCuenta {

    /**
     * @return el nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre a poner
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta el número de cuenta a poner
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo el saldo que se retira o se ingresa
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés se establece el tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Nombre de la persona titular, cuenta, saldo y tipo de interés
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto del objeto CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros
     * 
     * @param nom nombre de la persona titular
     * @param cue numero de cuenta de la persona
     * @param sal saldo de la persona
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     *
     * @return el estado de la cuenta
     */
    public double estado(){
        return this.getSaldo();
    }

    /**
     *
     * @param cantidad valor que se inserta para ingresar salgo
     * @throws Exception en caso de que se intente ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Constante para excepción de error en caso de una cantidad negativa
     */
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

    /**
     *
     * @param cantidad valor que se inserta para retirar saldo
     * @throws Exception en caso de que se intente ingresar una cantidad negativa
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}


    
   