package com.projet.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.Collection;
import java.util.Date;
import java.io.Serializable;


@Entity
@Table(name = "UnitedeValeur")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( allowGetters = true)
public class UnitedeValeur implements Serializable {


    public UnitedeValeur(Integer reference, String nom, Integer credit, String theme, Integer nombreJour, Date dateDebut, String salle) {
        this.reference = reference;
        this.nom = nom;
        this.credit = credit;
        this.theme = theme;
        this.nombreJour = nombreJour;
        this.dateDebut = dateDebut;
        this.salle = salle;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reference;

    @NotBlank
    private String nom;
    
    @NotBlank
    private Integer credit;

    @NotBlank
    private String theme;

    @NotBlank
    private Integer nombreJour;

    @NotBlank
    private Date dateDebut;

    @NotBlank
    private String salle;

   

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
    private Matiere matiere;

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

    public Integer getCredit() {
        return this.credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getTheme() {
        return this.theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Integer getNombreJour() {
        return this.nombreJour;
    }

    public void setNombreJour(Integer nombreJour) {
        this.nombreJour = nombreJour;
    }

    public Date getDateDebut() {
        return this.dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getSalle() {
        return this.salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public Matiere getMatiere() {
        return this.matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

}