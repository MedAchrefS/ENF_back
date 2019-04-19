package com.projet.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.io.Serializable;


@Entity
@Table(name = "Candidat")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( allowGetters = true)
public class Candidat implements Serializable {
    

    public Candidat() {
        super();
    }

    public Candidat(Integer idCandidat, Integer cin, String nom, String prenom, String adresse, Integer telephone_personnel, String nomAdministration, String lieuTravail, String adresseTravail, String niveauAcademique, String gradeActuel, String descriptionTaches, Date dateLimiteinscription, String categorie) {
        this.idCandidat = idCandidat;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone_personnel = telephone_personnel;
        this.nomAdministration = nomAdministration;
        this.lieuTravail = lieuTravail;
        this.adresseTravail = adresseTravail;
        this.niveauAcademique = niveauAcademique;
        this.gradeActuel = gradeActuel;
        this.descriptionTaches = descriptionTaches;
        this.dateLimiteinscription = dateLimiteinscription;
        this.categorie = categorie;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCandidat;
    @NotNull
    private Integer cin;
    
    @NotBlank
    private String nom;
    @NotBlank
    private String prenom;

    @NotBlank
    private String adresse;

    @NotNull
    private Integer telephone_personnel;

    @NotBlank
    private String nomAdministration;

    @NotBlank
    private String lieuTravail;

    @NotBlank
    private String adresseTravail;

    @NotBlank
    private String niveauAcademique;

    @NotBlank
    private String gradeActuel;

    @NotBlank
    private String descriptionTaches;

    private Date dateLimiteinscription;

    @NotBlank
    private String categorie;

    @OneToMany(mappedBy="candidat",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Dossier> dossiers;
    
    // getters and setters


    public Integer getIdCandidat() {
        return this.idCandidat;
    }

    public void setIdCandidat(Integer idCandidat) {
        this.idCandidat = idCandidat;
    }

    public Integer getCin() {
        return this.cin;
    }

    public void setCin(Integer cin) {
        this.cin = cin;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getTelephone_personnel() {
        return this.telephone_personnel;
    }

    public void setTelephone_personnel(Integer telephone_personnel) {
        this.telephone_personnel = telephone_personnel;
    }

    public String getNomAdministration() {
        return this.nomAdministration;
    }

    public void setNomAdministration(String nomAdministration) {
        this.nomAdministration = nomAdministration;
    }

    public String getLieuTravail() {
        return this.lieuTravail;
    }

    public void setLieuTravail(String lieuTravail) {
        this.lieuTravail = lieuTravail;
    }

    public String getAdresseTravail() {
        return this.adresseTravail;
    }

    public void setAdresseTravail(String adresseTravail) {
        this.adresseTravail = adresseTravail;
    }

    public String getNiveauAcademique() {
        return this.niveauAcademique;
    }

    public void setNiveauAcademique(String niveauAcademique) {
        this.niveauAcademique = niveauAcademique;
    }

    public String getGradeActuel() {
        return this.gradeActuel;
    }

    public void setGradeActuel(String gradeActuel) {
        this.gradeActuel = gradeActuel;
    }

    public String getDescriptionTaches() {
        return this.descriptionTaches;
    }

    public void setDescriptionTaches(String descriptionTaches) {
        this.descriptionTaches = descriptionTaches;
    }

    public Date getDateLimiteinscription() {
        return this.dateLimiteinscription;
    }

    public void setDateLimiteinscription(Date dateLimiteinscription) {
        this.dateLimiteinscription = dateLimiteinscription;
    }

    public String getCategorie() {
        return this.categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }


    public Set<Dossier> getDossiers() {
        return this.dossiers;
    }

    public void setDossiers(Set<Dossier> dossiers) {
        this.dossiers = dossiers;
    }


}