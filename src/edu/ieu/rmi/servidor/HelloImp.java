package edu.ieu.rmi.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImp extends UnicastRemoteObject implements HelloInterface{
	private String message;
	
	protected HelloImp() throws RemoteException {
		super();
	}
	
	public HelloImp(String msg) throws RemoteException {
		super();
		this.message = msg;
	}

	@Override
	public String say() throws RemoteException {
		return this.message;
	}
	
}
