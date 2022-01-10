package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Entity.Client;
import com.example.demo.Service.ClientService;


public class ClientController {
	 private final ClientService clientService;
	 
	 @Autowired
	    public ClientController(ClientService clientService) {
	        this.clientService = clientService;
	    }
	 
	    @GetMapping(path = "getClient/{idClient}")
	    @ResponseBody
	    public List <Client> getClient(@PathVariable("idClient") long idClient){
	        return clientService.getClient(idClient);
	    }

	    @PostMapping(path = "inserClient")
	    public void inserClient(@RequestBody Client client){
	    	clientService.inserClient(client);
	    }



}
