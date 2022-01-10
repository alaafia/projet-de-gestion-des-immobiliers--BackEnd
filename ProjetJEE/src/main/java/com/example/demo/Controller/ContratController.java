package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Contrat;
import com.example.demo.Service.ContratService;

@RestController
@RequestMapping(path = "home")
public class ContratController {
	private final ContratService contratService;
	 @Autowired
	    public ContratController(ContratService contratService) {
	        this.contratService = contratService;
	    }
	 
	    @GetMapping(path = "getContrat/{idContrat}")
	    @ResponseBody
	    public List <Contrat> getContrat(@PathVariable("idContrat") long idContrat){
	        return contratService.getContrat(idContrat);
	    }

	    
	    @PostMapping(path = "inserContrat")
	    public void inserContrat(@RequestBody Contrat contrat){
	    	contratService.inserContrat(contrat);
	    }

	
}
