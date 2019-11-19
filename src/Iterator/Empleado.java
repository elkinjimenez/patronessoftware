/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.text.DecimalFormat;

/**
 *
 * @author elomj
 */
public class Empleado {
    
    private String nombre;
    private String empresa;
    private int salario;
    private String descripcion;
    
    DecimalFormat formateador = new DecimalFormat("###,###.##");
    
    public Empleado(String n, String d, int s, String des) {
        
        nombre = n;
        empresa = d;
        salario = s;
        descripcion = des;
        
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String print() {
        
        descripcion = "Nombre: " + nombre + ",\n\tDivisión: " + empresa + ",\n\tSalario: $" + formateador.format(salario) + "\n";
        return descripcion;
        
    }
    
}
