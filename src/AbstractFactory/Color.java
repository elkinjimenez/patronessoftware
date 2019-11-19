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
public abstract class Color {

    private String descripcion;

    public abstract void colorear(Tv tv);

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
