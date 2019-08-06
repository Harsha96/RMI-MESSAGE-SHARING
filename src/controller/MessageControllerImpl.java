/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author kichc
 */
public class MessageControllerImpl extends UnicastRemoteObject implements MessageController{
      private String note="Nothing to show";

    public MessageControllerImpl() throws RemoteException {
    }
      
    @Override
    public void setNote(String note) throws RemoteException {
       this.note=note;
    }

    @Override
    public String getNote() throws RemoteException {
       return note;
    }
    
}
