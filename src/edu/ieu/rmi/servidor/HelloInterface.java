package edu.ieu.rmi.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote{
	
	String say() throws RemoteException;
}
