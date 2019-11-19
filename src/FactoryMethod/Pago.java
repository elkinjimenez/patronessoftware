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
public abstract class Pago {

    private int valor;
    private String cliente;

    public Pago(int valor, String cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }

    public abstract String descripcion();

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

}
