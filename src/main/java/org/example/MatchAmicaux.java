package org.example;

public class MatchAmicaux extends MatchLigue {

    public boolean gagnerLeMatch(int pointA, int pointB,boolean gagner) {
        if (pointA == pointB){
            System.out.println("MatchAmicaux: null");
        }else if(pointA > pointB){
            return false;
        }
        return true;
    }
}
