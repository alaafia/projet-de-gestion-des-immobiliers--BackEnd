package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Operation {
	
	@Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
	
    private long idOperation;
	private long idAnnonce;
	
	public Operation() {
		super();
	}

	public Operation(long idOperation, long idAnnonce) {
		super();
		this.idOperation = idOperation;
		this.idAnnonce = idAnnonce;
	}

	public long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(long idOperation) {
		this.idOperation = idOperation;
	}

	public long getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(long idAnnonce) {
		this.idAnnonce = idAnnonce;
	}
	
	
	
}
