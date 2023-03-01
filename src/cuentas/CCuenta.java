/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/**
 * Esta clase va a incluir todos los métodos usados en la clase main para el uso de
 * los distintos atributos del objeto Cuenta.
 * 
 * @author Amanda Saiz Allende <asaiza05@educantabria.es>
 */
public class CCuenta {

    /**
     * Declaración de los atributos del objeto Cuenta.
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Declaración de variables, asignandole los valores obtenidos del main.
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método set en el atributo nom (nombre). Cambia el parámetro nom.
     * @param nom 
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }
    /**
     * Método get en el atributo nom (nombre). Llama al método getNombre() para 
     * obtener el atributo nombre, que en realidad es el mismo que le atributo nom.
     * @return getNombre()
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Método ingresar. Cuenta con una excepción en caso de que el valor a ingresar sea negativo
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método retirar. Cuenta con excepciones en caso de que la cantidad a retirar sea menor que cero
     *  y en caso de el saldo sea menor que la cantidad a retirar, no puedes retirar más de lo que tienes.
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Método get del atributo Nombre. Devuelve el valor de nombre.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método set del atributo Nombre. Cambia el valor de nombre.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * Método get del atributo Cuenta. Devuelve el valor de cuenta.
     * @return cuenta
     */
    public String obtenerCuenta() {
        return cuenta;
    }
    /**
     * Método set del atributo Cuenta. Cambia el valor de cuenta.
     * @param cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    
    /**
     * Método get del atributo Saldo. Devuelve el valor de saldo.
     * @return saldo
     */
    public double estado() {
        return saldo;
    }
    /**
     * Método set del atributo Saldo. Cambia el valor de saldo.
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    /**
     * Método get del atributo tipoInterés. Devuelve el valor de tipoInterés.
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     * Método set del atributo tipoInterés. Cambia el valor de tipoInterés.
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
