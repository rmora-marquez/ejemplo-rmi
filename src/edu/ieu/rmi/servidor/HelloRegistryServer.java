package edu.ieu.rmi.servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloRegistryServer {
	
	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.createRegistry(1099); // default port 1099
			registry.rebind("Hello", new HelloImp("Ojala todos pasen el examen de la proxima semana"));
			System.out.println("Servidor esta conectado y listo para operar");
		}catch(Exception ex) {
			System.out.println("Server no conectado: " + ex);
			ex.printStackTrace();
		}
	}
}
