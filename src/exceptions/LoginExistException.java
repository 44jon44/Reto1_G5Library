/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *Excepcion que se señala que el usuario ya existe en la base de datos
* @author Ibai,jon,markel,alex
 */
public class LoginExistException extends Exception {


    public LoginExistException() {
        super("El usuario ya existe");
    }
}
