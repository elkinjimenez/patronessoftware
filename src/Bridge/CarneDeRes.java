/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

import javax.swing.JOptionPane;
import form.bridge;

/**
 *
 * @author aula2
 */
public class CarneDeRes implements IElaborar {

    public CarneDeRes() {
    }

    // --------------------------
    @Override
    public void procesar() {
        // Operaciones necesarias
        // ...
        
        int codigo = (int) (Math.random() * 9999);

        bridge.setRespu(bridge.getRespu() + "\nHamburguesa con Carne de res \n...LISTA\nPedido N: "+codigo);

    }
}
