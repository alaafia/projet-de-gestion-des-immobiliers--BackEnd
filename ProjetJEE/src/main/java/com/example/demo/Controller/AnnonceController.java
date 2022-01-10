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

import com.example.demo.Entity.Annonce;
import com.example.demo.Service.AnnonceService;

@RestController
@RequestMapping(path = "home")
public class AnnonceController {
	 private final AnnonceService annonceService;
	 
	 @Autowired
	    public AnnonceController(AnnonceService annonceService) {
	        this.annonceService = annonceService;
	    }
	 
	    @GetMapping(path = "getAnnoncesWithidUser/{idUser}")
	    @ResponseBody
	    public List <Annonce> getAnnoncesWithidUser(@PathVariable("idUser") long idUser){
	        return annonceService.getAnnoncesWithidUser(idUser);
	    }

	    @GetMapping(path = "getAnnonces")
	    public List<Annonce> getAnnonces(){
	    return annonceService.getAnnonces();
	    }
	    
	    @PostMapping(path = "addAnnonce")
	    public void addAnnonce(@RequestBody Annonce annonce){
	    	annonceService.addAnnonce(annonce);
	    }

}
