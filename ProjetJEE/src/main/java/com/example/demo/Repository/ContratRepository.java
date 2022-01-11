package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Contrat;


@Repository
public interface ContratRepository extends JpaRepository<Contrat,Long> {
    @Query("SELECT c FROM Contrat c where c.idContrat like %?1%")
    List<Contrat> findByContrat(long idContrat);

}
