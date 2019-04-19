package com.projet.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.Collection;
import java.util.Date;
import java.io.Serializable;


@Entity
@Table(name = "Emploi")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( allowGetters = true)
public class Emploi implements Serializable {
    

    public Emploi(Integer idEmploi, Integer idCandidat, Integer codeExamen) {
        this.idEmploi = idEmploi;
        this.idCandidat = idCandidat;
        this.codeExamen = codeExamen;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmploi;

    @NotBlank
    private Integer idCandidat;
    
    @NotBlank
    private Integer codeExamen;



    // getters and setters

    public Integer getIdEmploi() {
        return this.idEmploi;
    }

    public void setIdEmploi(Integer idEmploi) {
        this.idEmploi = idEmploi;
    }

    public Integer getIdCandidat() {
        return this.idCandidat;
    }

    public void setIdCandidat(Integer idCandidat) {
        this.idCandidat = idCandidat;
    }

    public Integer getCodeExamen() {
        return this.codeExamen;
    }

    public void setCodeExamen(Integer codeExamen) {
        this.codeExamen = codeExamen;
    }


}