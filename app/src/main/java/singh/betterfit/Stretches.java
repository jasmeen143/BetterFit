package singh.betterfit;

import java.util.ArrayList;
import java.util.List;

public class Stretches {
    private String nameMuscle;
    private String nameStretch;
    private int gif;
    private static List<Stretches> allStretches = new ArrayList<Stretches>();

    public Stretches() {}

    public Stretches(String nameMuscle, String nameStretch, int gif) {
        this.nameMuscle = nameMuscle;
        this.nameStretch = nameStretch;
        this.gif = gif;
    }

    public String getNameMuscle() {
        return nameMuscle;
    }

    public void setNameMuscle(String nameMuscle) {
        this.nameMuscle = nameMuscle;
    }

    public String getNameStretch() {
        return nameStretch;
    }

    public void setNameStretch(String nameStretch) {
        this.nameStretch = nameStretch;
    }

    public int getGif() {
        return gif;
    }

    public void setGif(int gif) {
        this.gif = gif;
    }

    public List<Stretches> addAllExercises(Stretches str) {
        allStretches.add(str);
        return allStretches;
    }
}
