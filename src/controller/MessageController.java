/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author kichc
 */
public interface MessageController  extends Remote {
      public void setNote(String note)throws RemoteException;
       public String getNote()throws RemoteException;
}
