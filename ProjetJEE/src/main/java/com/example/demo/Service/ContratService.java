package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Contrat;
import com.example.demo.Repository.ContratRepository;

@Service
public class ContratService {
	private final ContratRepository contratRepository;

	@Autowired
	public ContratService(ContratRepository contratRepository) {
		this.contratRepository = contratRepository;
	}

	public List<Contrat> getContrat(long idContrat) {
		return contratRepository.findByContrat(idContrat);
	}

	public void inserContrat(Contrat contrat) {
		contratRepository.save(contrat);
	}

}
