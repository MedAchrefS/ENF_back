package com.projet.projet.metier;

import com.projet.projet.dao.CandidatDao;
import com.projet.projet.dao.FormateurDao;
import com.projet.projet.entities.Candidat;
import com.projet.projet.entities.Formateur;
import com.projet.projet.exception.ResourceNotFoundException;
import com.projet.projet.metier.Interface.ICandidatMetier;
import com.projet.projet.metier.Interface.IFormateurMetier;

import java.io.Console;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
@Repository
public class CandidatMetierImpl implements ICandidatMetier {

    @Autowired
    CandidatDao candidatDao;

    // Get All Formateurs
    @GetMapping("/candidat")
    public List<Candidat> getAllCandidats() {
        return candidatDao.findAll();
    }
    // Create a new Note


    public Candidat createCandidat(Candidat candidat) {
        return candidatDao.save(candidat);
      
    }

  
    public Candidat userType(Integer cin) {
        System.out.println("user type  ");
         System.out.println(cin);
        Candidat c = new Candidat();
 /*        c.setCin(cin);
        Example<Personne> exemple = Example.of(p);
        Personne personne = iPersonneRepository.findOne(exemple); */
        
        
//@Query(value = "SELECT DISTINCT * FROM candidat WHERE cin=?cin",nativeQuery = true)
        return  null;
    }


    public Candidat findBycin(Integer cin) {
       return candidatDao.findBycin(cin)  ;
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