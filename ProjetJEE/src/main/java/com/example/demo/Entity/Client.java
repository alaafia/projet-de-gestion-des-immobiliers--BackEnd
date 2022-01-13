package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table

public class Client extends User{
	
	public Client(long idUser, String nameUser, String emailUser, String passwordUser, String typeUser) {
		super(idUser, nameUser, emailUser, passwordUser, typeUser);
		// TODO Auto-generated constructor stub
	}
	

    private long idClient;

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	

}
