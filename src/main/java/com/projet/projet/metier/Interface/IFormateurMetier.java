package com.projet.projet.metier.Interface;

import java.util.List;

import javax.validation.Valid;

import com.projet.projet.entities.Formateur;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface IFormateurMetier {
    public List<Formateur> getAllFormateurs() ;
    public Formateur createFormateur(Formateur formateur);
   // public Formateur getFormateurbyId(Integer formateurId);
   // public Formateur updateFormateur(Integer formateurId);
     //@Valid @RequestBody Formateur formateurDetails);
    //public ResponseEntity<?> deleteFormateur(@PathVariable(value = "id") Integer formateurId) ;
    
}