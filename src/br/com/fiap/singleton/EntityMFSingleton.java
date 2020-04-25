package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityMFSingleton {

	public static EntityManagerFactory fabrica = null;
	
	private EntityMFSingleton(){
		
	}
	
	public static EntityManagerFactory getInstance() {
		if(fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("oracle");
		}
		return fabrica;
	}
	
}
