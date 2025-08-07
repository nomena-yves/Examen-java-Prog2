package org.example;

public class MatchTitre extends MatchLigue{
    public boolean gagnerLeMatch(int pointA, int pointB,boolean gagner,String titre) {
        if (pointA == pointB){
            System.out.println("MatchAmicaux: null");
        }else if(pointA > pointB){
            combattant1.getTitres().add(titre);
            return false;
        }
        combattant2.getTitres().add(titre);
        return true;
    }
}
