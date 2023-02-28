package main.java.task3.being;

import main.java.task3.notalive.Craft;
import main.java.task3.notalive.Home;
import main.java.task3.notalive.Tea;


public class Hemuliha extends Born {

    private String descriptions = "маленькая ";
    private Born whoInteractsWith = new Guests();
    private Craft Where = new Home();
    private Craft have = new Tea();

    public Hemuliha() {
        setName("Хемулиха ");
    }

    public String getDescriptions() {
        return descriptions;
    }

    public Born getWhoInteractsWith() {
        return whoInteractsWith;
    }

    public Craft getWhere() {
        return Where;
    }

    public Craft getHave() {
        return have;
    }
}
