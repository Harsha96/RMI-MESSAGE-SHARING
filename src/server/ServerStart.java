/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import controller.MessageControllerImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author niroth
 */
public class ServerStart {
    public static void main(String[] args) {
        try {
            Registry noteRegistry=LocateRegistry.createRegistry(5051);
            noteRegistry.rebind("NoteServer", new MessageControllerImpl());
            System.out.println("Starting server");
        } catch (RemoteException ex) {
            Logger.getLogger(ServerStart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
