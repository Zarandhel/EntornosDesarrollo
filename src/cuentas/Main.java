/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

public class Main {
    /**
     * Método Main del programa. En el se llama al método operativa_cuenta() 
     * que mostrará en pantalla el saldo del usuario.
     * @param args 
     */
    public static void main(String[] args) {
        operativa_cuenta ();
    }

    /**
     * Método operativa_cuenta.
     * Introduce los datos de una nueva cuenta, los guarda y muestra el saldo actual
     * de dicha cuenta. Además, realiza una operación de retiro de dinero y una operación
     * de ingreso; ambas operaciones cuentan con excepciones en caso de que no funcionen.
     */
    public static void operativa_cuenta () {
        CCuenta cuenta1;
        double saldoActual;
        float cantidad;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
