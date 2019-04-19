package com.projet.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.io.Serializable;


@Entity
@Table(name = "Examen")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( allowGetters = true)
public class Examen implements Serializable {

    //Constructor

    public Examen(Integer codeExamen, Surveillant surveillant, Formateur formateur, Integer sujet, Integer dateDeroulement) {
        this.codeExamen = codeExamen;
        this.surveillant = surveillant;
        this.formateur = formateur;
        this.sujet = sujet;
        this.dateDeroulement = dateDeroulement;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeExamen;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
    private Surveillant surveillant;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Formateur formateur;
   
    @NotBlank
    private Integer sujet;

    @NotBlank
    private Integer dateDeroulement;

    
    

    // Getters and Setters ... (Omitted for brevity)


    public Integer getCodeExamen() {
        return this.codeExamen;
    }

    public void setCodeExamen(Integer codeExamen) {
        this.codeExamen = codeExamen;
    }

    public Surveillant getSurveillant() {
        return this.surveillant;
    }

    public void setSurveillant(Surveillant surveillant) {
        this.surveillant = surveillant;
    }

    public Formateur getFormateur() {
        return this.formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public Integer getSujet() {
        return this.sujet;
    }

    public void setSujet(Integer sujet) {
        this.sujet = sujet;
    }

    public Integer getDateDeroulement() {
        return this.dateDeroulement;
    }

    public void setDateDeroulement(Integer dateDeroulement) {
        this.dateDeroulement = dateDeroulement;
    }

    
}