package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.Operation;


public interface OperationRepository extends JpaRepository<Operation,Long> {
	@Query("SELECT o FROM Operation e where o.idOperation = ?1")
    List<Operation> findByOperation(long idOperation);
}

