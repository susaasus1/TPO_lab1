package main.java.task3.being;


import main.java.task3.notalive.Grass;
import main.java.task3.notalive.Poster;

public class Snusmumrik extends Born {

    private Poster whatUses;
    private Grass where = new Grass();

    public Snusmumrik(Poster whatUses) {
        setName("Снюсмумрик.");
        this.whatUses = whatUses;
    }

    public void setWhatUses(Poster whatUses) {
        this.whatUses = whatUses;
    }

    public Poster getWhatUses() {
        return whatUses;
    }

    public Grass getWhere() {
        return where;
    }
}
