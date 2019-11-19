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
public class PagoTransferencia extends Pago {

    public PagoTransferencia(int valor, String cliente) {
        super(valor, cliente);
    }

    @Override
    public String descripcion() {

        int codigo = (int) (Math.random() * 9999);

        String respuesta
                = "Código: " + codigo
                + "\nCliente: " + PagoTransferencia.super.getCliente()
                + "\nValor: $" + PagoTransferencia.super.getValor()
                + "\nPagado con: Transferencia bancaria";

        return respuesta;

    }

}
