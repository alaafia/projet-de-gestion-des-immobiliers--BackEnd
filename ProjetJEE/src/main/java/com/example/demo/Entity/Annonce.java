package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table

public class Annonce {

	@Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
	
	private long idAnnonce;
	private String nomAnnonce;
	private String typeAnnonce;
	private String villeAnnonce;
    private long idUser;

	private int prix;
	
	public Annonce(long idAnnonce, String nomAnnonce, String typeAnnonce, String villeAnnonce, int prix) {
		super();
		this.idAnnonce = idAnnonce;
		this.nomAnnonce = nomAnnonce;
		this.typeAnnonce = typeAnnonce;
		this.villeAnnonce = villeAnnonce;
		this.prix = prix;
	}

	public long getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(long idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	public String getNomAnnonce() {
		return nomAnnonce;
	}

	public void setNomAnnonce(String nomAnnonce) {
		this.nomAnnonce = nomAnnonce;
	}

	public String getTypeAnnonce() {
		return typeAnnonce;
	}

	public void setTypeAnnonce(String typeAnnonce) {
		this.typeAnnonce = typeAnnonce;
	}

	public String getVilleAnnonce() {
		return villeAnnonce;
	}

	public void setVilleAnnonce(String villeAnnonce) {
		this.villeAnnonce = villeAnnonce;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}


	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	
	
	

}
