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
public class PagoPaypal extends Pago {

    public PagoPaypal(int valor, String cliente) {
        super(valor, cliente);
    }

    @Override
    public String descripcion() {

        int codigo = (int) (Math.random() * 9999);

        String respuesta
                = "Código: " + codigo
                + "\nCliente: " + PagoPaypal.super.getCliente()
                + "\nValor: $" + PagoPaypal.super.getValor()
                + "\nPagado con: Cuenta de Paypal";

        return respuesta;

    }

}
