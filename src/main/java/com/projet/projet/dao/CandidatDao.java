
package com.projet.projet.dao;

import com.projet.projet.entities.Candidat;
import com.projet.projet.entities.Formateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface CandidatDao extends JpaRepository<Candidat, Integer> {

}