/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instachatrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Saurin
 * all the calls that server makes to clients.
 */
public interface CallBack extends Remote{
    public String sendMsg(String to, String from, String message) throws RemoteException;
}
