/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exceptions.ConnectionNotAvaiableException;
import exceptions.DatabaseNotAvaiableException;
import exceptions.EmailFormatException;
import exceptions.FullNameFormatExeception;
import exceptions.LoginExistException;
import exceptions.LoginNotFoundException;
import exceptions.PasswordFormatException;
import exceptions.PasswordNotFoundException;
import exceptions.RepeatPasswordException;
import exceptions.UserFormatException;

/**
 * Interfaz que contine la firma de los metodos necesarios.
 *
 * @author ibai , jon , alex , markel
 */
public interface Signable {

    /**
     * Metodo para que un usuario inicie sesion.
     *
     * @param user un objeto User que consta de los campos "login" y "password" que se envía desde el cliente
     * @return Un objeto User que consta de los campos "id", "login", "fullname", "email" y "password"
     * @throws LoginNotFoundException
     * @throws ConnectionNotAvaiableException
     * @throws PasswordNotFoundException
     * @throws Exception
     */
    public User signIn(User user) throws LoginNotFoundException,
            ConnectionNotAvaiableException, PasswordNotFoundException, Exception;

    /**
     * Metodo para que se de alta un Usuario
     *
     * @param user un usuario que se envía desde la aplicación cliente que consta de los campos "id", "login", "fullname", "email" y "password"
     * @return Un booleano que indica si se ha realizado bien el alta del usuario
     * @throws LoginExistException
     * @throws ConnectionNotAvaiableException
     * @throws exceptions.DatabaseNotAvaiableException
     * @throws exceptions.EmailFormatException
     * @throws exceptions.FullNameFormatExeception
     * @throws exceptions.PasswordFormatException
     * @throws exceptions.RepeatPasswordException
     * @throws exceptions.UserFormatException
     * @throws Exception
     */
    public boolean signUp(User user) throws LoginExistException,
            ConnectionNotAvaiableException, DatabaseNotAvaiableException,
            EmailFormatException, FullNameFormatExeception, PasswordFormatException,
             RepeatPasswordException, UserFormatException, Exception;
}
