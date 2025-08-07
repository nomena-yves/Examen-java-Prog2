package org.example;

import java.util.List;

public class Homme extends Combattant {
    public List<String> gagnerUnTitre(boolean victoiore, String titre) {
        if (victoiore==true) {
           getTitres().add(titre);
        }
       return getTitres();
    }
}
