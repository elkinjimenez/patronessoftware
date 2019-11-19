/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author aula2
 */
public abstract class ElaborarAlimento {
    // Referencia al Implementador

    IElaborar implementador;
    String nombre;

    // --------------------------
    public IElaborar getImplementador() {
        return this.implementador;
    }

    // --------------------------
    public void setImplementador(IElaborar implementador) {
        this.implementador = implementador;
    }
    // --------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

// Método a implementar por las clases que hereden
    public abstract void obtener();

}
