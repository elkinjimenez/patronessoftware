/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import form.abstractfactory;

/**
 *
 * @author elomj
 */
public class Blanco extends Color {

    private boolean primario;

    @Override
    public void colorear(Tv tv) {

        int codigo = (int) (Math.random() * 9999);

        String respuesta
                = "Código del Tv: " + codigo
                + "\nCreando el Tv: " + tv.getDescripcion()
                + "\nY asigna al Tv: " + tv.getDescripcion()
                + " el color: BLANCO";

        abstractfactory.setRespu(respuesta);

    }

    public boolean isPrimario() {
        return primario;
    }

    public void setPrimario(boolean primario) {
        this.primario = primario;
    }

}
