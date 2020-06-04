package singh.betterfit;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    private String nameMuscle;
    private String nameExercise;
    private String gifLink;
    private static List<Exercise> allExercises = new ArrayList<Exercise>();

    public Exercise() {}

    public Exercise(String nameMuscle, String nameExercise, String gifLink) {
        this.nameMuscle = nameMuscle;
        this.nameExercise = nameExercise;
        this.gifLink = gifLink;
    }

    public String getNameMuscle() {
        return nameMuscle;
    }

    public void setNameMuscle(String nameMuscle) {
        this.nameMuscle = nameMuscle;
    }

    public String getNameExercise() {
        return nameExercise;
    }

    public void setNameExercise(String nameExercise) {
        this.nameExercise = nameExercise;
    }

    public String getGifLink() {
        return gifLink;
    }

    public void setGifLink(String gifLink) {
        this.gifLink = gifLink;
    }

    public List<Exercise> addAllExercises(Exercise ex) {
        allExercises.add(ex);
        return allExercises;
    }

    public void createAllExercises() {
        //ABS STRETCHES
        noNameMethod("Abs","Crunches","https://musclewiki.org/media/uploads/Crunch-Side-021316.gif");
        noNameMethod("Abs","Forearm Plank","https://musclewiki.org/media/uploads/Plank-Side-021316.gif");
        noNameMethod("Abs","Roll-Outs","https://musclewiki.org/media/uploads/AbRoller-Side-021316.gif");
        noNameMethod("Abs","Laying Leg Raises","https://musclewiki.org/media/uploads/LegRaises-Side-021316.gif");
        noNameMethod("Abs","Hanging Knee Raises","https://musclewiki.org/media/uploads/bodyweight-male-hanging-knee-raises-side.gif");
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
    public void noNameMethod(String nameMuscle, String nameExercise, String gifLink){
        Exercise exercise = new Exercise();
        exercise.setNameMuscle(nameMuscle);
        exercise.setNameExercise(nameExercise);
        exercise.setGifLink(gifLink);

        addAllExercises(exercise);
    }


}
