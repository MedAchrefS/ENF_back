package com.projet.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.Collection;
import java.util.Date;
import java.io.Serializable;


@Entity
@Table(name = "Formateur")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( allowGetters = true)
public class Formateur implements Serializable {

    //Constructor


    public Formateur() {
        super();
    }

    public Formateur(Integer idFormateur, Collection<Examen> examens, String nomFormateur, String prenomFormateur, String administration, String lieuTravail, Date dateLimiteEC, String SujetExamen) {
        this.idFormateur = idFormateur;
        this.examens = examens;
        this.nomFormateur = nomFormateur;
        this.prenomFormateur = prenomFormateur;
        this.administration = administration;
        this.lieuTravail = lieuTravail;
        this.dateLimiteEC = dateLimiteEC;
        this.SujetExamen = SujetExamen;
    }



    public Formateur(String nomFormateur, String prenomFormateur) {
       
        this.nomFormateur = nomFormateur;
        this.prenomFormateur = prenomFormateur;
        
    }
 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFormateur;

    @OneToMany(mappedBy="formateur",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Collection<Examen> examens;
    
    @NotBlank
    private String nomFormateur;

    @NotBlank
    private String prenomFormateur;

    @NotBlank
    private String administration;

    @NotBlank
    private String lieuTravail;


    private Date dateLimiteEC;


    private String SujetExamen;

    

    // Getters and Setters ... (Omitted for brevity)

    public Integer getIdFormateur() {
        return this.idFormateur;
    }

    public void setIdFormateur(Integer idFormateur) {
        this.idFormateur = idFormateur;
    }

    public String getNomFormateur() {
        return this.nomFormateur;
    }

    public void setNomFormateur(String nomFormateur) {
        this.nomFormateur = nomFormateur;
    }

    public String getPrenomFormateur() {
        return this.prenomFormateur;
    }

    public void setPrenomFormateur(String prenomFormateur) {
        this.prenomFormateur = prenomFormateur;
    }

    public String getAdministration() {
        return this.administration;
    }

    public void setAdministration(String administration) {
        this.administration = administration;
    }

    public String getLieuTravail() {
        return this.lieuTravail;
    }

    public void setLieuTravail(String lieuTravail) {
        this.lieuTravail = lieuTravail;
    }

    public Date getDateLimiteEC() {
        return this.dateLimiteEC;
    }

    public void setDateLimiteEC(Date dateLimiteEC) {
        this.dateLimiteEC = dateLimiteEC;
    }

    public String getSujetExamen() {
        return this.SujetExamen;
    }

    public void setSujetExamen(String SujetExamen) {
        this.SujetExamen = SujetExamen;
    }
    public Collection<Examen> getExamens() {
        return this.examens;
    }

    public void setExamens(Collection<Examen> examens) {
        this.examens = examens;
    }

}