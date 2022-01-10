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

import com.example.demo.Entity.Operation;
import com.example.demo.Service.OperationService;

@RestController
@RequestMapping(path = "home")
public class OperationController {
	
	private final OperationService operationService;
	
	@Autowired
    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }
 
    @GetMapping(path = "getOperation/{idOperation}")
    @ResponseBody
    public List <Operation> getOperation(@PathVariable("idOperation") long idOperation){
        return operationService.getOperation(idOperation);
    }

    
    @PostMapping(path = "inserOperation")
    public void inserOperation(@RequestBody Operation operation){
    	operationService.inserOperation(operation);
    }
}
