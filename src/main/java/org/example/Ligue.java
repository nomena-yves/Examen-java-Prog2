package org.example;

import java.util.List;
import java.util.Objects;

public class Ligue {
    private String name;
    private List<Combattant> combattants;
    private List<MatchLigue> match;

    public Ligue(String name, List<Combattant> combattants, List<MatchLigue> match) {
        this.name = name;
        this.combattants = combattants;
        this.match = match;
    }

    public String getName() {
        return name;
    }

    public List<Combattant> getCombattants() {
        return combattants;
    }

    public List<MatchLigue> getMatch() {
        return match;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ligue ligue = (Ligue) o;
        return Objects.equals(name, ligue.name) && Objects.equals(combattants, ligue.combattants) && Objects.equals(match, ligue.match);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, combattants, match);
    }
}
