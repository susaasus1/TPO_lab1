package main.java.task3.notalive;

public class Poster extends Thing {

    private Craft whereSpin;
    private Craft wherePlaning = new Park();
    private Craft whereCling;
    private Craft tube = new Tube("трубу ");

    private String pronoun = "Одна из них ";

    public Craft getWherePlaning() {
        return wherePlaning;
    }

    public void setWherePlaning(Craft wherePlaning) {
        this.wherePlaning = wherePlaning;
    }

    public Craft getWhereCling() {
        return whereCling;
    }

    public void setWhereCling(Craft whereCling) {
        this.whereCling = whereCling;
    }

    public Craft getTube() {
        return tube;
    }

    public void setTube(Craft tube) {
        this.tube = tube;
    }

    public Poster() {
    }

    public Poster(Craft whereCling) {
        this.whereCling = whereCling;
        setDescription("театральные ");
        setName("афиши ");
    }

    public Craft getWhereSpin() {
        return whereSpin;
    }

    public void setWhereSpin(Craft whereSpin) {
        this.whereSpin = whereSpin;
    }

    private String spin() {
        return "кружиться ";
    }

    public String continued() {
        return "продолжали " + spin() + whereSpin.getDescription();
    }

    public String planning() {
        return "спланировала " + wherePlaning.getDescription();
    }

    public String cling() {
        return "и прилипла к " + whereCling.getReversDescription();
    }

    public String being() {
        return "была ";
    }

    public String transformation() {
        return "превратилась в ";
    }

    public String falling() {
        return "упало в " + tube.getName();
    }

    public String burned() {
        return "и сгорело";
    }

    @Override
    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }

    public String getPronoun() {
        return pronoun;
    }



}
