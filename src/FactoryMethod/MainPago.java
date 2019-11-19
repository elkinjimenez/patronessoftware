/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author elomj
 */
public class MainPago {

    private Pago pago;

    public static void main(String[] args) {

        PagoFactoryMethod factory = new PagoFactory();

        Pago pago = factory.generarPago(2, "Elkin Omar", "paypal");

        System.out.println(pago.descripcion());

    }

}
