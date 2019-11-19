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
public class Main {

    public static void main(String[] args)
    {
        // Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
        ElaborarAlimento hamburguesa = new ElaborarHamburguesa( new CarneDePollo());
        hamburguesa.obtener();
        // Ahora le indicamos que use otra implementación para obtener la de verduras
        hamburguesa.setImplementador( new CarneDeRes() );
        hamburguesa.obtener();
    }
    
}
