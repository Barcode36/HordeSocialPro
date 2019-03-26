/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.services.interfaces;

import tn.esprit.entities.User;
import tn.esprit.entities.UserRole;
import tn.esprit.services.exceptions.ConstraintViolationException;
import tn.esprit.services.exceptions.ObjectNotFoundException;

/**
 *
 * @author Dhia
 */
public interface IServiceUser extends IGenericService<User>{
    
    /**
     *
     * @param identifier username or password
     * @param password
     * @return
     * @throws ObjectNotFoundException
     */
    User authentication(String identifier,String password)throws ObjectNotFoundException;

    /**
     *
     * @param id
     * @return
     * @throws ObjectNotFoundException
     */
    User findByID(Integer id) throws ObjectNotFoundException;
    
    Boolean SignUp(User user) throws ConstraintViolationException;
    
    Boolean banUser(User user) throws ConstraintViolationException;
    
    Boolean changeRole(User user, UserRole to) throws ConstraintViolationException;
    
    Boolean accountActivation(User user,String code) throws ConstraintViolationException;

}
