package singh.betterfit;

import java.util.ArrayList;
import java.util.List;

public class Stretches {
    private String nameMuscle;
    private int idStretch;
    private String gifLink;
    private static List<Stretches> allStretches;

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

    public void addAllStretches(Stretches str) {
        allStretches = new ArrayList<Stretches>();
        allStretches.add(str);
    }
    public List<Stretches> getAllStretches(){
        createAllStretches();
        return allStretches;
    }

    public void createAllStretches() {
        //ABS STRETCHES
        noNameMethod("Abs",1,"https://musclewiki.org/media/uploads/male-strech-3-side.gif");
        noNameMethod("Abs",2,"https://musclewiki.org/media/uploads/male-strech-2-front.gif");
        noNameMethod("Abs",3,"https://musclewiki.org/media/uploads/Male-strech-1-front.gif");
        noNameMethod("Abs",4,"https://musclewiki.org/media/uploads/male-strech-4-side.gif");

        //BICEPS STRETCHES
        noNameMethod("Biceps",5,"https://musclewiki.org/media/uploads/male-strech-8-front.gif");
        noNameMethod("Biceps",6,"https://musclewiki.org/media/uploads/male-strech-5-side.gif");
        noNameMethod("Biceps",7,"https://musclewiki.org/media/uploads/male-strech-17-front.gif");
        noNameMethod("Biceps",8,"https://musclewiki.org/media/uploads/male-strech-6-side.gif");
        noNameMethod("Biceps",9,"https://musclewiki.org/media/uploads/male-strech-7-side_JDdFZRF.gif");

        //CALVES STRETCHES
        noNameMethod("Calves",40,"https://musclewiki.org/media/uploads/male-strech-19-side.gif");
        noNameMethod("Calves",41,"https://musclewiki.org/media/uploads/male-strech-19-side.gif");
        noNameMethod("Calves",42,"https://musclewiki.org/media/uploads/male-strech-19-side.gif");

        //CHEST STRETCHES
        noNameMethod("Chest",10,"https://musclewiki.org/media/uploads/male-strech-13-front.gif");
        noNameMethod("Chest",11,"https://musclewiki.org/media/uploads/male-strech-14-side.gif");
        noNameMethod("Chest",12,"https://musclewiki.org/media/uploads/male-strech-15-side.gif");
        noNameMethod("Chest",13,"https://musclewiki.org/media/uploads/male-strech-46-front.gif");

        //FOREARMS STRETCHES
        noNameMethod("Forearms",43,"https://musclewiki.org/media/uploads/male-strech-16-front.gif");
        noNameMethod("Forearms",44,"https://musclewiki.org/media/uploads/male-strech-18-side.gif");
        noNameMethod("Forearms",45,"https://musclewiki.org/media/uploads/male-strech-6-side.gif");
        noNameMethod("Forearms",46,"https://musclewiki.org/media/uploads/male-strech-7-side.gif");

        //GLUTES STRETCHES
        noNameMethod("Glutes",14,"https://musclewiki.org/media/uploads/male-strech-22-side.gif");
        noNameMethod("Glutes",15,"https://musclewiki.org/media/uploads/male-strech-23-side_Thzeg0r.gif");
        noNameMethod("Glutes",16,"https://musclewiki.org/media/uploads/male-strech-24-side.gif");

        //HAMSTRINGS STRETCHES
        noNameMethod("Hamstrings",17,"https://musclewiki.org/media/uploads/male-strech-25-side.gif");
        noNameMethod("Hamstrings",18,"https://musclewiki.org/media/uploads/male-strech-26-side.gif");
        noNameMethod("Hamstrings",19,"https://musclewiki.org/media/uploads/male-strech-27-side.gif");
        noNameMethod("Hamstrings",20,"https://musclewiki.org/media/uploads/male-strech-28-side.gif");

        //LATS STRETCHES
        noNameMethod("Lats",21,"https://musclewiki.org/media/uploads/male-strech-11-front.gif");
        noNameMethod("Lats",22,"https://musclewiki.org/media/uploads/male-strech-2-front.gif");
        noNameMethod("Lats",23,"https://musclewiki.org/media/uploads/male-strech-37-front.gif");

        //MIDBACK STRETCHES
        noNameMethod("MidBack",24,"https://musclewiki.org/media/uploads/male-strech-23-side.gif");
        noNameMethod("MidBack",25,"https://musclewiki.org/media/uploads/male-strech-43-front.gif");

        //QUADRICEPS STRETCHES
        noNameMethod("Quadriceps",26,"https://musclewiki.org/media/uploads/male-strech-29-side.gif");
        noNameMethod("Quadriceps",27,"https://musclewiki.org/media/uploads/male-strech-30-side.gif");
        noNameMethod("Quadriceps",28,"https://musclewiki.org/media/uploads/male-strech-31-side.gif");
        noNameMethod("Quadriceps",29,"https://musclewiki.org/media/uploads/male-strech-32-front.gif");

        //SHOULDERS STRETCHES
        noNameMethod("Shoulders",30,"https://musclewiki.org/media/uploads/male-strech-43-front_73MazEY.gif");
        noNameMethod("Shoulders",31,"https://musclewiki.org/media/uploads/male-strech-44-front.gif");
        noNameMethod("Shoulders",32,"https://musclewiki.org/media/uploads/male-strech-45-front.gif");
        noNameMethod("Shoulders",33,"https://musclewiki.org/media/uploads/male-strech-9-front.gif");

        //TRAPS STRETCHES
        noNameMethod("Traps",34,"https://musclewiki.org/media/uploads/male-strech-38-front_AXFOqL0.gif");
        noNameMethod("Traps",35,"https://musclewiki.org/media/uploads/male-strech-39-front_xwy5Hbe.gif");
        noNameMethod("Traps",36,"https://musclewiki.org/media/uploads/male-strech-40-front.gif");

        //TRICEPS STRETCHES
        noNameMethod("Triceps",37,"https://musclewiki.org/media/uploads/male-strech-10-side.gif");
        noNameMethod("Triceps",38,"https://musclewiki.org/media/uploads/male-strech-12-front.gif");
        noNameMethod("Triceps",39,"https://musclewiki.org/media/uploads/male-strech-9-front_BDXFiGR.gif");
    }
    public void noNameMethod(String nameMuscle, int idStretch, String gifLink){
        Stretches stretches = new Stretches();
        stretches.setNameMuscle(nameMuscle);
        stretches.setIdStretch(idStretch);
        stretches.setGifLink(gifLink);
        addAllStretches(stretches);
    }
}
