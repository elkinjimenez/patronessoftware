/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.Iterator;

/**
 *
 * @author elomj
 */
public class EmpresaIterator implements Iterator<Empleado> {

    private Empleado[] empleado;

    private int location = 0;

    public EmpresaIterator(Empleado[] e) {
        empleado = e;
    }

    public Empleado next() {
        return empleado[location++];
    }

    public boolean hasNext() {
        if (location < empleado.length && empleado[location] != null) {
            return true;
        } else {
            return false;
        }
    }

    public void remove() {

    }

}
