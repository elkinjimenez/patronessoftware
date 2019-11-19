/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author elomj
 */
public class FactoryLDCNegro extends TvAbstractFactory {

    public Color CrearColor() {

        return new Negro();

    }

    public Tv CrearTv() {

        return new LCD();

    }

}
