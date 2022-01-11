package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table

public class Contrat {
	@Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
	
    private long idContrat;
    private long idClient;
    
    
    
	public Contrat() {
		super();
	}

	public Contrat(long idContrat, long idClient) {
		super();
		this.idContrat = idContrat;
		this.idClient = idClient;
	}
	
	public long getIdContrat() {
		return idContrat;
	}
	public void setIdContrat(long idContrat) {
		this.idContrat = idContrat;
	}
	public long getIdClient() {
		return idClient;
	}
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
    
    
	

}
