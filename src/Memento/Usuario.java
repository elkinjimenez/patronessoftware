/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import form.memento;

/**
 *
 * @author elomj
 */
public class Usuario {

    private String nombre;

    public Memento GuardarAMenento() {

        memento.setRespu("Guardando a memento...\n______________________________");
        return new Memento(nombre);

    }

    public void restaurarMemento(Memento m) {

        nombre = m.getGuardarEstado();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
