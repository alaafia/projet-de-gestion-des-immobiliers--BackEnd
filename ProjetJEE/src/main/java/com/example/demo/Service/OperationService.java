package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Operation;
import com.example.demo.Repository.OperationRepository;

@Service
public class OperationService {
	private final OperationRepository operationRepository;

	@Autowired
	public OperationService(OperationRepository operationRepository) {
		this.operationRepository = operationRepository;
	}

	public List<Operation> getOperation(long idOperation) {
		return operationRepository.findByOperation(idOperation);
	}

	public void inserOperation(Operation operation) {
		operationRepository.save(operation);
	}

}
