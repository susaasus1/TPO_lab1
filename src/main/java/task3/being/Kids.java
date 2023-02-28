package main.java.task3.being;
import main.java.task3.notalive.Poster;
import main.java.task3.notalive.Roof;

public class Kids extends Born {

    private Roof whereClimbed;
    private Poster giveWhat;
    private Snusmumrik toWhom;

    public void setWhereClimbed(Roof whereClimbed) {
        this.whereClimbed = whereClimbed;
    }

    public void setToWhom(Snusmumrik toWhom) {
        this.toWhom = toWhom;
    }

    public Kids() {
        setName("малыш");
    }


    public Roof getWhereClimbed() {
        return whereClimbed;
    }

    public Poster getGiveWhat() {
        return giveWhat;
    }

    public Snusmumrik getToWhom() {
        return toWhom;
    }

    public void setGiveWhat(Poster giveWhat) {
        this.giveWhat = giveWhat;
    }
}
