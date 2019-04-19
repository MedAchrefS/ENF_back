package com.projet.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;


import java.util.Date;
import java.util.Set;
import java.io.Serializable;


@Entity
@Table(name = "Matiere")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( allowGetters = true)
public class Matiere implements Serializable {
    

    public Matiere(Integer reference, String nom, String description) {
        this.reference = reference;
        this.nom = nom;
        this.description = description;
    }




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reference;

    @NotBlank
    private String nom;

    @NotBlank
    private String description;

    @OneToMany(mappedBy="matiere",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<UnitedeValeur> unitedevaleur;
    

    // getters and setters


    public Integer getReference() {
        return this.reference;
    }

    public void setReference(Integer reference) {
        this.reference = reference;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Set<UnitedeValeur> getUnitedevaleur() {
        return this.unitedevaleur;
    }

    public void setUnitedevaleur(Set<UnitedeValeur> unitedevaleur) {
        this.unitedevaleur = unitedevaleur;
    }
 

}