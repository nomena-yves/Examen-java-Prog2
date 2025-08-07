package org.example;

import java.time.LocalDate;

public abstract class MatchLigue {
    String id;
    LocalDate date;
    String lieu;
    Combattant combattant1;
    Combattant combattant2;

    abstract boolean gagnerLeMatch(int pointA, int pointB,boolean gagner,String titre);

}
