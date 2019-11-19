/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import java.util.ArrayList;

/**
 *
 * @author elomj
 */
public class Vigilante {

    private ArrayList<Memento> estados = new ArrayList<Memento>();

    public void agregarMemento(Memento m) {
        estados.add(m);
    }

    public Memento getMemento(int index) {
        return estados.get(index);
    }

    public ArrayList<Memento> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<Memento> estados) {
        this.estados = estados;
    }
    
    

}
