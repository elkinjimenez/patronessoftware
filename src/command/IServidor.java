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
public interface IServidor {

    public void apagate();

    public void prendete();

    public void conectate();

    public void verificarConexion();

    public void guardarLog();

    public void cerrarConexion();

}
