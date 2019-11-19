/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author elomj
 */
public class Empresa {

    private Empleado[] empleados = new Empleado[100];
    private int numero = 0;
    private String nombreEmpresa;
    private String descripcion;

    public Empresa(String n) {
        nombreEmpresa = n;
    }

    public String getNombre() {
        return nombreEmpresa;
    }

    public void add(String nombre, int salario) {
        Empleado e = new Empleado(nombre, nombreEmpresa, salario, descripcion);
        empleados[numero++] = e;
    }

    public EmpresaIterator iterator() {
        return new EmpresaIterator(empleados);
    }

}
