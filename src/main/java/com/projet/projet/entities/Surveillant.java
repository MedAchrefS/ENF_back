package com.projet.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;


@Entity
@Table(name = "Surveillant")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( allowGetters = true)
public class Surveillant implements Serializable {

    //Constructor

    public Surveillant(Integer idSurveillant, String nomSurveillant, String prenomSurveillant, String structure, Integer nombreHeureSurv, Double rib) {
        this.idSurveillant = idSurveillant;
        this.nomSurveillant = nomSurveillant;
        this.prenomSurveillant = prenomSurveillant;
        this.structure = structure;
        this.nombreHeureSurv = nombreHeureSurv;
        this.rib = rib;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSurveillant;

    @OneToMany(mappedBy="surveillant",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Examen> examen;
    
    @NotBlank
    private String nomSurveillant;

    @NotBlank
    private String prenomSurveillant;

    @NotBlank
    private String structure;

    @NotBlank
    private Integer nombreHeureSurv;

    @NotBlank
    private Double rib;

    

    // Getters and Setters ... (Omitted for brevity)


    public Integer getIdSurveillant() {
        return this.idSurveillant;
    }

    public void setIdSurveillant(Integer idSurveillant) {
        this.idSurveillant = idSurveillant;
    }

    public String getNomSurveillant() {
        return this.nomSurveillant;
    }

    public void setNomSurveillant(String nomSurveillant) {
        this.nomSurveillant = nomSurveillant;
    }

    public String getPrenomSurveillant() {
        return this.prenomSurveillant;
    }

    public void setPrenomSurveillant(String prenomSurveillant) {
        this.prenomSurveillant = prenomSurveillant;
    }

    public String getStructure() {
        return this.structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public Integer getNombreHeureSurv() {
        return this.nombreHeureSurv;
    }

    public void setNombreHeureSurv(Integer nombreHeureSurv) {
        this.nombreHeureSurv = nombreHeureSurv;
    }

    public Double getRib() {
        return this.rib;
    }

    public void setRib(Double rib) {
        this.rib = rib;
    }

    public Set<Examen> getExamens() {
        return this.examen;
    }

    public void setExamens(Set<Examen> examens) {
        this.examen = examens;
    }


}