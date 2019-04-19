package com.projet.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.io.Serializable;


@Entity
@Table(name = "Commission")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( allowGetters = true)
public class Commission implements Serializable {
    


    public Commission(Integer idCommission, Date dateCreation, Byte pv) {
        this.idCommission = idCommission;
        this.dateCreation = dateCreation;
        this.pv = pv;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCommission;

    @NotBlank
    private Date dateCreation;
    
    @NotBlank
    private Byte pv;

    @OneToMany(mappedBy="commission",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Dossier> dossiers;
    

    // getters and setters


    public Integer getIdCommission() {
        return this.idCommission;
    }

    public void setIdCommission(Integer idCommission) {
        this.idCommission = idCommission;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Byte getPv() {
        return this.pv;
    }

    public void setPv(Byte pv) {
        this.pv = pv;
    }


    public Set<Dossier> getDossiers() {
        return this.dossiers;
    }

    public void setDossiers(Set<Dossier> dossiers) {
        this.dossiers = dossiers;
    }

}