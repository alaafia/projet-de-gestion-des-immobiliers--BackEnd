package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client,Long>{
	 @Query("SELECT c FROM Client c where c.idClient like %?1%")
	    List<Client> findByContrat(long idClient);
}
