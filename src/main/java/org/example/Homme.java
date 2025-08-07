package org.example;

import java.util.List;

public class Homme extends Combattant {
    boolean victoiore;
    String titre;
   public Homme(boolean victoiore, String titre) {
       super(this.id);
       this.victoiore = victoiore;
       this.titre = titre;
   }
    public List<String> gagnerUnTitre(boolean victoiore, String titre) {
        if (victoiore==true) {
           getTitres().add(titre);
        }
       return getTitres();
    }
}
