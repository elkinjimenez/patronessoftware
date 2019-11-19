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
public class Plasma extends Tv {

    private double anguloVision;

    private double tiempoRespuesta;

    public Plasma(double anguloVision, double tiempoRespuesta, String marca, int pulgadas, String color, String descripcion, double precio) {
        super(marca, pulgadas, color, descripcion, precio);
        setAnguloVision(anguloVision);
        setTiempoRespuesta(tiempoRespuesta);
    }

    public double getAnguloVision() {
        return anguloVision;
    }

    public void setAnguloVision(double anguloVision) {
        this.anguloVision = anguloVision;
    }

    public double getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(double tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }
    
    public Plasma(){
        setDescripcion("Plasma");
    }

}
