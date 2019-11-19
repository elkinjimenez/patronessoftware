/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author elomj
 */
public class ServidorArgentina implements IServidor {

    public void apagate() {

        System.out.println("Servidor Argentina: Apagando servidor.");

    }

    public void cerrarConexion() {

        System.out.println("Servidor Argentina: Cerrando conexión.");

    }

    public void conectate() {

        System.out.println("Servidor Argentina: Conectando servidor.");

    }

    public void guardarLog() {

        System.out.println("Servidor Argentina: Guardar Log del servidor.");

    }

    public void prendete() {

        System.out.println("Servidor Argentina: Prendiendo servidor.");

    }

    public void verificarConexion() {

        System.out.println("Servidor Argentina: Verificando conexión del servidor.");
    }

}
