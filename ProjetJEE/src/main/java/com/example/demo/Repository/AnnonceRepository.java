package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Annonce;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce,Long>{
	 @Query("SELECT a FROM Annonce a where a.idUser= ?1")
	    List<Annonce> findByAnnonceUser(long idUser);

	    @Query("SELECT u.nameUser,a.idAnnonce,a.nomAnnonce,a.typeAnnonce,a.villeAnnonce FROM Annonce a, User u where a.idUser= u.idUser")
	    List<Object> findByallAnnonces();
}
