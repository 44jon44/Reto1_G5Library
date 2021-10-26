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
 * interfaz que contine los metodos firmados necesarios.
 * @author ibai , jon , alex , markel
 */
public interface Signable {
/** 
 * metodo para que un usuario inicie sesion.
 * @param user
 * @return  Un objeto User
 * @throws LoginNotFoundException
 * @throws ConnectionNotAvaiableException
 * @throws PasswordNotFoundException
 * @throws Exception 
 */
    public User signIn(User user) throws LoginNotFoundException,
            ConnectionNotAvaiableException, PasswordNotFoundException,Exception;
/**
 * Metodo para que se de alta un Usuario
 * @param user
 * @return Un objeto User
 * @throws LoginExistException
 * @throws ConnectionNotAvaiableException
 * @throws Exception 
 */
    public User signUp(User user) throws LoginExistException,
            ConnectionNotAvaiableException,DatabaseNotAvaiableException,
            EmailFormatException,FullNameFormatExeception,PasswordFormatException
            ,RepeatPasswordException,UserFormatException,Exception;
}
