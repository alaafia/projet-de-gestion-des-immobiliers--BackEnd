package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Client;
import com.example.demo.Repository.ClientRepository;

@Service
public class ClientService {
	private final ClientRepository clientRepository;

	@Autowired
	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	public List<Client> getClient(long idClient) {
		return clientRepository.findByContrat(idClient);
	}

	public void inserClient(Client client) {
		clientRepository.save(client);
	}

}
