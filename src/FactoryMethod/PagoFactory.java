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
public class PagoFactory implements PagoFactoryMethod {

    @Override
    public Pago generarPago(int valor, String cliente, String tipo) {

        if ("Tarjeta".equals(tipo)) {

            return new PagoTarjeta(valor, cliente);

        } else if ("Transferencia bancaria".equals(tipo)) {

            return new PagoTransferencia(valor, cliente);

        } else {

            return new PagoPaypal(valor, cliente);

        }

    }

}
