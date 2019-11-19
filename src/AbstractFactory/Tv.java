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
public abstract class Tv implements Cloneable {

    private String marca;
    private int pulgadas;
    private String color;
    private String descripcion;
    private double precio;

    public Tv() {
    }

    public Tv(String marca, int pulgadas, String color, String descripcion, double precio) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.color = color;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Object Clone() throws CloneNotSupportedException {

        return super.clone();

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
