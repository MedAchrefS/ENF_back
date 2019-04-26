package com.projet.projet.metier;

import com.projet.projet.entities.Candidat;

public class TestCandidat {
    /**
     *
     */


    public static void main(String[] args) {

        CandidatMetierImpl metier = new CandidatMetierImpl();
        Candidat c = metier.findBycin(123);

        System.out.println("le nom du Cnadidat  dont la cin 123 est "+c.getNom());

}


}