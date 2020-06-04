package singh.betterfit;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    private String nameMuscle;
    private String nameExercise;
    private int gif;
    private static List<Exercise> allExercises = new ArrayList<Exercise>();

    public Exercise() {}

    public Exercise(String nameMuscle, String nameExercise, int gif) {
        this.nameMuscle = nameMuscle;
        this.nameExercise = nameExercise;
        this.gif = gif;
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

    public int getGif() {
        return gif;
    }

    public void setGif(int gif) {
        this.gif = gif;
    }

    public List<Exercise> addAllExercises(Exercise ex) {
        allExercises.add(ex);
        return allExercises;
    }
/*
        names.add("Chest");
        names.add("Forearms");
        names.add("Glutes");
        names.add("Hamstrings");
        names.add("Lats");
        names.add("MidBack");
        names.add("Quadriceps");
        names.add("Shoulders");
        names.add("Traps");
        names.add("Triceps");*/
    public void createAllExercises(){
        Exercise exercise = new Exercise();

        /*----------------------------------------------------------------------------*/
        exercise.setNameMuscle("Abs");
        exercise.setNameExercise("Crunches");
        exercise.setGif(R.drawable.abs_crunches);
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("Abs");
        exercise.setNameExercise("Forearm Plank");
        exercise.setGif(R.drawable.abs_forearmplank);
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("Abs");
        exercise.setNameExercise("Roll-Outs");
        exercise.setGif(R.drawable.abs_rollouts);
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("Abs");
        exercise.setNameExercise("Laying Leg Raises");
        exercise.setGif(R.drawable.abs_layinglegraises);
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("Abs");
        exercise.setNameExercise("Hanging Knee Raises");
        exercise.setGif(R.drawable.abs_hangingkneeraises);
        addAllExercises(exercise);

        /*----------------------------------------------------------------------------*/

        exercise = new Exercise();
        exercise.setNameMuscle("Biceps");
        exercise.setNameExercise("Hammer Curl");
        exercise.setGif(R.drawable.biceps_hammercurl);
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("Biceps");
        exercise.setNameExercise("Dumbbell Curl");
        exercise.setGif(R.drawable.biceps_dumbellcurl);
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("Biceps");
        exercise.setNameExercise("Barbell Curl");
        exercise.setGif(R.drawable.biceps_barbellcurl);
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("Biceps");
        exercise.setNameExercise("Chin-Ups");
        exercise.setGif(R.drawable.biceps_chinups);
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("Biceps");
        exercise.setNameExercise("Inverted Row");
        exercise.setGif(R.drawable.biceps_invertedrow);
        addAllExercises(exercise);

        /*----------------------------------------------------------------------------*/

        exercise = new Exercise();
        exercise.setNameMuscle("Calves");
        exercise.setNameExercise("Standing Calf Raises");
        exercise.setGif(R.drawable.calves_standingcalfraises);
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("Calves");
        exercise.setNameExercise("Seated Calf Raises");
        exercise.setGif(R.drawable.calves_seatedcalfraises);
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("Calves");
        exercise.setNameExercise("Tip Toe Walking");
        exercise.setGif(R.drawable.calves_tiptoewalking);
        addAllExercises(exercise);

        /*----------------------------------------------------------------------------*/
/*
        exercise = new Exercise();
        exercise.setNameMuscle("");
        exercise.setNameExercise("");
        exercise.setGif();
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("");
        exercise.setNameExercise("");
        exercise.setGif();
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("");
        exercise.setNameExercise("");
        exercise.setGif();
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("");
        exercise.setNameExercise("");
        exercise.setGif();
        addAllExercises(exercise);

        exercise = new Exercise();
        exercise.setNameMuscle("");
        exercise.setNameExercise("");
        exercise.setGif();
        addAllExercises(exercise);*/

    }


}
