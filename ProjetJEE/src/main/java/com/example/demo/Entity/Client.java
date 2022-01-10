package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Client extends User{
	
	public Client(long idUser, String nameUser, String emailUser, String passwordUser, String typeUser) {
		super(idUser, nameUser, emailUser, passwordUser, typeUser);
		// TODO Auto-generated constructor stub
	}

	@Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
	
    private long idClient;

}
