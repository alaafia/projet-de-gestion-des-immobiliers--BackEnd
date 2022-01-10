package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Annonce;
import com.example.demo.Repository.AnnonceRepository;

@Service
public class AnnonceService {
	private final AnnonceRepository annonceRepository;

	@Autowired
	public AnnonceService(AnnonceRepository annonceRepository) {
		this.annonceRepository = annonceRepository;
	}

	public List<Annonce> getAnnonces() {
		return annonceRepository.findAll();
	}

	public List<Annonce> getAnnoncesWithidUser(long idUser) {
		return annonceRepository.findByAnnonceUser(idUser);
	}

	public void addAnnonce(Annonce annonce) {
		annonceRepository.save(annonce);
	}

}
