/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.services.implementation;

import java.util.List;
import tn.esprit.dao.exceptions.DataBaseException;
import tn.esprit.dao.implementation.NotificationDaoImpl;
import tn.esprit.dao.interfaces.INotificationDao;
import tn.esprit.entities.Comment;
import tn.esprit.entities.Company;
import tn.esprit.entities.Notification;
import tn.esprit.services.interfaces.IServiceNotification;

/**
 *
 * @author Mehdi Sarray
 */
public class ServiceNotificationImpl implements IServiceNotification{

    INotificationDao in ;

    public ServiceNotificationImpl() {
       in = new NotificationDaoImpl() ; }

    @Override
    public List<Notification> findAll() throws DataBaseException {
       return in.findAll();
    }

    @Override
    public Integer create(Notification entity) throws DataBaseException {
      return in.create(entity) ;
    }

    @Override
    public Integer edit(Notification entity) throws DataBaseException {
       return in.edit(entity) ;
    }

    @Override
    public Integer delete(Notification entity) throws DataBaseException {
       return in.delete(entity);
    }

    @Override
    public void craftNotification(Company entity, Comment comEntity) {
         in.craftNotification(entity, comEntity);
    }

    @Override
    public List<Notification> getNotificationByUser(Company entity) {
        return in.getNotificationByUser(entity) ;
    }
  
        
       
 }
    
    
    
   
    

