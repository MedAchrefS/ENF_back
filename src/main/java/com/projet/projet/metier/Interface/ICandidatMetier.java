package com.projet.projet.metier.Interface;

import java.util.List;

import javax.validation.Valid;

import com.projet.projet.entities.Candidat;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface ICandidatMetier {
    public List<Candidat> getAllCandidats() ;
    public Candidat createCandidat(Candidat candidat);
   // public Formateur getFormateurbyId(Integer formateurId);
   // public Formateur updateFormateur(Integer formateurId);
     //@Valid @RequestBody Formateur formateurDetails);
    //public ResponseEntity<?> deleteFormateur(@PathVariable(value = "id") Integer formateurId) ;
	  public Candidat userType(Integer cin);
    public Candidat findBycin(Integer cin);
}