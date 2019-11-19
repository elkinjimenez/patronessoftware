/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

import form.bridge;
import javax.swing.JOptionPane;

/**
 *
 * @author aula2
 */
public class ElaborarHamburguesa extends ElaborarAlimento {

    public ElaborarHamburguesa(IElaborar implementador) {
        this.setImplementador(implementador);
    }

    // ------------------------
    @Override
    public void obtener() {

        bridge.setRespu("Preparando...");
        this.getImplementador().procesar();
    }
}
