package org.example;

import java.util.List;
import java.util.Objects;

public class Combattant {
    protected String id;
    protected String nom;
    protected String prenom;
    protected String nomCombattant;
    protected int poids;
   protected List<String> titres;
   protected char sexe;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Combattant that = (Combattant) o;
        return poids == that.poids && Objects.equals(id, that.id) && Objects.equals(nom, that.nom) && Objects.equals(prenom, that.prenom) && Objects.equals(nomCombattant, that.nomCombattant) && Objects.equals(titres, that.titres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, nomCombattant, poids, titres);
    }
}