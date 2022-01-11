package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation,Long> {
	@Query("SELECT o FROM Operation o where o.idOperation = ?1")
    List<Operation> findByOperation(long idOperation);
}

