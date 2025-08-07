package org.example;

import java.util.List;

public class Combattant {
    protected String id;
    protected String nom;
    protected String prenom;
    protected String nomCombattant;
    protected int poids;
   protected List<String> titres;

    public Combattant(String id, String nom, String prenom, String nomCombattant, int poids, List<String> titres) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattant = nomCombattant;
        this.poids = poids;
        this.titres = titres;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomCombattant() {
        return nomCombattant;
    }

    public int getPoids() {
        return poids;
    }

    public List<String> getTitres() {
        return titres;
    }

}