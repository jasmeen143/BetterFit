package singh.betterfit;

import java.util.ArrayList;
import java.util.List;

public class Stretches {
    private String nameMuscle;
    private int idStretch;
    private String gifLink;
    private static List<Stretches> allStretches = new ArrayList<Stretches>();

    public Stretches() {}

    public Stretches(String nameMuscle, int idStretch, String gifLink) {
        this.nameMuscle = nameMuscle;
        this.idStretch = idStretch;
        this.gifLink = gifLink;
    }

    public String getNameMuscle() {
        return nameMuscle;
    }

    public void setNameMuscle(String nameMuscle) {
        this.nameMuscle = nameMuscle;
    }

    public int getIdStretch() {
        return idStretch;
    }

    public void setIdStretch(int idStretch) {
        this.idStretch = idStretch;
    }

    public String getGifLink() {
        return gifLink;
    }

    public void setGifLink(String gifLink) {
        this.gifLink = gifLink;
    }

    public List<Stretches> addAllStretches(Stretches str) {
        allStretches.add(str);
        return allStretches;
    }

    public void createAllStretches() {
        //ABS STRETCHES
        noNameMethod("Abs",1,"https://musclewiki.org/media/uploads/male-strech-3-side.gif");
        noNameMethod("Abs",2,"https://musclewiki.org/media/uploads/male-strech-2-front.gif");
        noNameMethod("Abs",3,"https://musclewiki.org/media/uploads/Male-strech-1-front.gif");
        noNameMethod("Abs",4,"https://musclewiki.org/media/uploads/male-strech-4-side.gif");

        //BICEPS STRETCHES


        //CHEST STRETCHES

        //GLUTES STRETCHES

        //HAMSTRINGS STRETCHES

        //LATS STRETCHES

        //MIDBACK STRETCHES

        //QUADRICEPS STRETCHES

        //SHOULDERS STRETCHES

        //TRAPS STRETCHES

        //TRICEPS STRETCHES


    }
    public void noNameMethod(String nameMuscle, int idStretch, String gifLink){
        Stretches stretches = new Stretches();
        stretches.setNameMuscle(nameMuscle);
        stretches.setIdStretch(idStretch);
        stretches.setGifLink(gifLink);

        addAllStretches(stretches);
    }
}
