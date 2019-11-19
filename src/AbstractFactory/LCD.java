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
public class LCD extends Tv{
    
    private double costoFabricacion;
    
    public LCD(){
        setDescripcion("LCD");
        
    }

    public LCD(double costoFabricacion, String marca, int pulgadas, String color, String descripcion, double precio) {
        super(marca, pulgadas, color, descripcion, precio);
        setCostoFabricacion(costoFabricacion);
    }


    
    
    

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }
    
    
    
}
