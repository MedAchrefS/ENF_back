package com.projet.projet.metier;

import com.projet.projet.dao.FormateurDao;
import com.projet.projet.entities.Formateur;
import com.projet.projet.exception.ResourceNotFoundException;
import com.projet.projet.metier.Interface.IFormateurMetier;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
@Repository
public class FormateurMetierImpl implements IFormateurMetier {

    @Autowired
    FormateurDao formateurdao;

    // Get All Formateurs
    @GetMapping("/formateur")
    public List<Formateur> getAllFormateurs() {
        return formateurdao.findAll();
    }
    // Create a new Note


    public Formateur createFormateur(Formateur formateur) {
        return formateurdao.save(formateur);
      
    }

   /*  // Get a Single Note

    @GetMapping("/formateur/{id}")
    public Formateur getFormateurbyId(@PathVariable(value = "id") Integer formateurId) {
        return formateurdao.findById(formateurId)
        .orElseThrow(() -> new ResourceNotFoundException("Note", "id", formateurId));
              
    }

    // Update a Note
        
        @PutMapping("/formateur/{id}")
        public Formateur updateFormateur(@PathVariable(value = "id") Integer formateurId,  
        @Valid @RequestBody Formateur formateurDetails) 
        {
            Formateur formateur = formateurdao.findById(formateurId)
                    .orElseThrow(() -> new ResourceNotFoundException("Note", "id", formateurId));
        
                    formateur.setLieuTravail(formateurDetails.getLieuTravail());
                    formateur.setNomFormateur(formateurDetails.getNomFormateur());
        
            Formateur updatedformateur = formateurdao.save(formateur);
            return updatedformateur;
        }

    // Delete a Note
     
        @DeleteMapping("/formateur/{id}")
        public ResponseEntity<?> deleteFormateur(@PathVariable(value = "id") Integer formateurId) {
            Formateur formateur = formateurdao.findById(formateurId)
                    .orElseThrow(() -> new ResourceNotFoundException("Note", "id", formateurId));

            formateurdao.delete(formateur);
            return ResponseEntity.ok().build();
        } */
    
}