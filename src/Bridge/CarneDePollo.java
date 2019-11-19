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
public class CarneDePollo implements IElaborar {

    public CarneDePollo() {
    }

    // --------------------------
    @Override
    public void procesar() {
        // Operaciones necesarias
        // ...

        int codigo = (int) (Math.random() * 9999);

        bridge.setRespu(bridge.getRespu() + "\nHamburguesa con Carne de pollo \n...LISTA\nPedido N: "+codigo);

    }
}
