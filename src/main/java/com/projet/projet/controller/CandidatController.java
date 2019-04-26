package com.projet.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import com.projet.projet.dao.FormateurDao;
import com.projet.projet.entities.Candidat;
import com.projet.projet.entities.Formateur;
import com.projet.projet.exception.ResourceNotFoundException;
import com.projet.projet.metier.FormateurMetierImpl;
import com.projet.projet.metier.Interface.ICandidatMetier;
import com.projet.projet.metier.Interface.IFormateurMetier;

import java.text.Normalizer.Form;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class CandidatController {
    @Autowired
    ICandidatMetier candidatMetier;
    // Get All Formateurs
    @GetMapping("/candidat")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Candidat> getAllCandidats() {
        return candidatMetier.getAllCandidats();
    }

    // Create a new Note
    @PostMapping("/candidat")
    @CrossOrigin(origins = "http://localhost:4200")
    public Candidat createCandidat(@RequestBody Candidat candidat) {
        return candidatMetier.createCandidat(candidat);
      
    }

    @GetMapping("/candidat/{cin}")
    @CrossOrigin(origins = "http://localhost:4200")
     public Candidat findBycin(@PathVariable Integer cin) {
         if(candidatMetier.findBycin(cin)!=null){
            return candidatMetier.findBycin(cin);
         }else
         return null;
            
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