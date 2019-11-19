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
public interface PagoFactoryMethod {

    public Pago generarPago(int valor, String cliente, String tipo);

}
