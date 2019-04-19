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
public class Session implements Serializable {
    

    public Session(Integer idAnnonceSession, Date dateAnnonceSession) {
        this.idAnnonceSession = idAnnonceSession;
        this.dateAnnonceSession = dateAnnonceSession;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAnnonceSession;

    @NotBlank
    private Date dateAnnonceSession;



    // getters and setters


    public Integer getIdAnnonceSession() {
        return this.idAnnonceSession;
    }

    public void setIdAnnonceSession(Integer idAnnonceSession) {
        this.idAnnonceSession = idAnnonceSession;
    }

    public Date getDateAnnonceSession() {
        return this.dateAnnonceSession;
    }

    public void setDateAnnonceSession(Date dateAnnonceSession) {
        this.dateAnnonceSession = dateAnnonceSession;
    }


}