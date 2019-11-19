/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

public class Dolar {

    private double dolar = 0;

    // -----------------
    public Dolar() {
    }

    // -----------------
    public double getTotalDolar() {
        return this.dolar;
    }

    // -----------------
    public void sacarDolar(double dolar) {
        this.dolar -= dolar;
    }

    // -----------------
    public void ingresarDolar(double dolar) {
        this.dolar += dolar;
    }
}
