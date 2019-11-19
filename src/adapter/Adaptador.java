/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

public class Adaptador implements IAdaptador {

    Dolar dolar = new Dolar();

    // ------------------
    public Adaptador() {
    }

    // ------------------
    public double getSaldo() {
        return this.dolar.getTotalDolar();
    }

    // ------------------
    @Override
    public void sacarPesos(double pesos) {
        double dolar = pesos / 3456;
        this.dolar.sacarDolar(dolar);
    }

    // ------------------
    @Override
    public void ingresarPesos(double pesos) {
        double dolar = pesos / 3456;
        this.dolar.ingresarDolar(dolar);
    }
}
