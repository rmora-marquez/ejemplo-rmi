package edu.ieu.rmi.cliente;

import java.rmi.Naming;

import edu.ieu.rmi.servidor.HelloInterface;

public class HelloClientRMI {
	
	public static void main(String[] args) {
		try {
			HelloInterface hello = (HelloInterface) Naming.lookup("//localhost/Hello");
			System.out.println("Mensaje del RMI hello.say = " + hello.say());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
