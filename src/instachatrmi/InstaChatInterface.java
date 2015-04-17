/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instachatrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Saurin
 * All the calls that client makes
 */
public interface InstaChatInterface extends Remote{
    
    public void connect (CallBack client, String name) throws RemoteException;
    public boolean login(String user, String pass) throws RemoteException;
    public boolean add(String user,String friend) throws RemoteException;
    public boolean delete(String user, String enemy) throws RemoteException;
    public boolean register(String user, String pass)throws RemoteException;
    public String sendChat(String to, String from, String message) throws RemoteException;
    public Vector<String> friends(String user) throws RemoteException;
}
