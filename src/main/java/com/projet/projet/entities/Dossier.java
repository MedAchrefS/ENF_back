package com.projet.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.Collection;
import java.util.Date;
import java.io.Serializable;


@Entity
@Table(name = "Dossier")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( allowGetters = true)
public class Dossier implements Serializable {
    

    public Dossier(Integer idDossier, Date dateLimite, Boolean existanceFormulaire, Boolean existanceADSA, Boolean existanceATGC, Boolean existanceCD, Boolean existanceRDEC, Boolean existancePhoto, Boolean existanceCIN, Boolean existanceEnveloppe) {
        this.idDossier = idDossier;
        this.dateLimite = dateLimite;
        this.existanceFormulaire = existanceFormulaire;
        this.existanceADSA = existanceADSA;
        this.existanceATGC = existanceATGC;
        this.existanceCD = existanceCD;
        this.existanceRDEC = existanceRDEC;
        this.existancePhoto = existancePhoto;
        this.existanceCIN = existanceCIN;
        this.existanceEnveloppe = existanceEnveloppe;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDossier;

  

    @NotBlank
    private Date dateLimite;
    
    @NotBlank
    private Boolean existanceFormulaire;

    @NotBlank
    private Boolean existanceADSA;

    @NotBlank
    private Boolean existanceATGC;

    @NotBlank
    private Boolean existanceCD;

    @NotBlank
    private Boolean existanceRDEC;

    @NotBlank
    private Boolean existancePhoto;

    @NotBlank
    private Boolean existanceCIN;

    @NotBlank
    private Boolean existanceEnveloppe;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
    private Commission commission;


    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
    private Candidat candidat;
    // getters and setters



    public Integer getIdDossier() {
        return this.idDossier;
    }

    public void setIdDossier(Integer idDossier) {
        this.idDossier = idDossier;
    }

    public Date getDateLimite() {
        return this.dateLimite;
    }

    public void setDateLimite(Date dateLimite) {
        this.dateLimite = dateLimite;
    }

    public Boolean isExistanceFormulaire() {
        return this.existanceFormulaire;
    }

    public Boolean getExistanceFormulaire() {
        return this.existanceFormulaire;
    }

    public void setExistanceFormulaire(Boolean existanceFormulaire) {
        this.existanceFormulaire = existanceFormulaire;
    }

    public Boolean isExistanceADSA() {
        return this.existanceADSA;
    }

    public Boolean getExistanceADSA() {
        return this.existanceADSA;
    }

    public void setExistanceADSA(Boolean existanceADSA) {
        this.existanceADSA = existanceADSA;
    }

    public Boolean isExistanceATGC() {
        return this.existanceATGC;
    }

    public Boolean getExistanceATGC() {
        return this.existanceATGC;
    }

    public void setExistanceATGC(Boolean existanceATGC) {
        this.existanceATGC = existanceATGC;
    }

    public Boolean isExistanceCD() {
        return this.existanceCD;
    }

    public Boolean getExistanceCD() {
        return this.existanceCD;
    }

    public void setExistanceCD(Boolean existanceCD) {
        this.existanceCD = existanceCD;
    }

    public Boolean isExistanceRDEC() {
        return this.existanceRDEC;
    }

    public Boolean getExistanceRDEC() {
        return this.existanceRDEC;
    }

    public void setExistanceRDEC(Boolean existanceRDEC) {
        this.existanceRDEC = existanceRDEC;
    }

    public Boolean isExistancePhoto() {
        return this.existancePhoto;
    }

    public Boolean getExistancePhoto() {
        return this.existancePhoto;
    }

    public void setExistancePhoto(Boolean existancePhoto) {
        this.existancePhoto = existancePhoto;
    }

    public Boolean isExistanceCIN() {
        return this.existanceCIN;
    }

    public Boolean getExistanceCIN() {
        return this.existanceCIN;
    }

    public void setExistanceCIN(Boolean existanceCIN) {
        this.existanceCIN = existanceCIN;
    }

    public Boolean isExistanceEnveloppe() {
        return this.existanceEnveloppe;
    }

    public Boolean getExistanceEnveloppe() {
        return this.existanceEnveloppe;
    }

    public void setExistanceEnveloppe(Boolean existanceEnveloppe) {
        this.existanceEnveloppe = existanceEnveloppe;
    }


    public Commission getCommission() {
        return this.commission;
    }

    public void setCommission(Commission commission) {
        this.commission = commission;
    }


    public Candidat getCandidat() {
        return this.candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

}