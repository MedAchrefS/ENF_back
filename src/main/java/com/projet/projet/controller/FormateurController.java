package com.projet.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import com.projet.projet.dao.FormateurDao;
import com.projet.projet.entities.Formateur;
import com.projet.projet.exception.ResourceNotFoundException;
import com.projet.projet.metier.FormateurMetierImpl;
import com.projet.projet.metier.Interface.IFormateurMetier;

import java.text.Normalizer.Form;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class FormateurController {
    @Autowired
    IFormateurMetier formateurMetier;
    // Get All Formateurs
    @GetMapping("/formateur")
    public List<Formateur> getAllFormateurs() {
        return formateurMetier.getAllFormateurs();
    }
    // Create a new Note



    
    @PostMapping("/formateur")
    public Formateur createFormateur(@RequestBody Formateur formateur) {
        return formateurMetier.createFormateur(formateur);
      
    }

    // Get a Single Note

   /*  @GetMapping("/formateur/{id}")
    public Formateur getFormateurbyId(@PathVariable(value = "id") Integer formateurId) {
        return formateurMetier.getFormateurbyId(formateurId);
              
    }

    // Update a Note
        
        @PutMapping("/formateur/{id}")
        public Formateur updateFormateur(@PathVariable(value = "id") Integer formateurId,  
        @Valid @RequestBody Formateur formateurDetails) 
        {
            Formateur formateur = formateurMetier.getFormateurbyId(formateurId);
        
                    formateur.setLieuTravail(formateurDetails.getLieuTravail());
                    formateur.setNomFormateur(formateurDetails.getNomFormateur());
        
            Formateur updatedformateur = formateurMetier.createFormateur(formateur);
            return updatedformateur;
        }

    // Delete a Note
     
        @DeleteMapping("/formateur/{id}")
        public ResponseEntity<?> deleteFormateur(@PathVariable(value = "id") Integer formateurId) {
            //Formateur formateur = formateurMetier.getFormateurbyId(formateurId);

            formateurMetier.deleteFormateur(formateurId);
            return ResponseEntity.ok().build();
        } */
    

}