package com.projet.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.Collection;
import java.util.Date;
import java.io.Serializable;


@Entity
@Table(name = "Note")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( allowGetters = true)
public class Note implements Serializable {
    

    public Note(Integer idNote, Integer idCandidat, Integer reference, Double note1, Double note2, Double noteFinal, String observation) {
        this.idNote = idNote;
        this.idCandidat = idCandidat;
        this.reference = reference;
        this.note1 = note1;
        this.note2 = note2;
        this.noteFinal = noteFinal;
        this.observation = observation;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNote;

    @NotBlank
    private Integer idCandidat;
    
    @NotBlank
    private Integer reference;

    @NotBlank
    private Double note1;

    @NotBlank
    private Double note2;

    @NotBlank
    private Double noteFinal;

    @NotBlank
    private String observation;


    // getters and setters

    public Integer getIdNote() {
        return this.idNote;
    }

    public void setIdNote(Integer idNote) {
        this.idNote = idNote;
    }

    public Integer getIdCandidat() {
        return this.idCandidat;
    }

    public void setIdCandidat(Integer idCandidat) {
        this.idCandidat = idCandidat;
    }

    public Integer getReference() {
        return this.reference;
    }

    public void setReference(Integer reference) {
        this.reference = reference;
    }

    public Double getNote1() {
        return this.note1;
    }

    public void setNote1(Double note1) {
        this.note1 = note1;
    }

    public Double getNote2() {
        return this.note2;
    }

    public void setNote2(Double note2) {
        this.note2 = note2;
    }

    public Double getNoteFinal() {
        return this.noteFinal;
    }

    public void setNoteFinal(Double noteFinal) {
        this.noteFinal = noteFinal;
    }

    public String getObservation() {
        return this.observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }


}