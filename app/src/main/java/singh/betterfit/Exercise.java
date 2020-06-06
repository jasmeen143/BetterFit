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

    public List<Exercise> getAllExercises(){
        createAllExercises();
        return allExercises;
    }

    public void createAllExercises() {

        allExercises = new ArrayList<Exercise>();

        //ABS EXERCISES
        noNameMethod("Abs","Crunches","https://musclewiki.org/media/uploads/Crunch-Side-021316.gif");
        noNameMethod("Abs","Forearm Plank","https://musclewiki.org/media/uploads/Plank-Side-021316.gif");
        noNameMethod("Abs","Roll-Outs","https://musclewiki.org/media/uploads/AbRoller-Side-021316.gif");
        noNameMethod("Abs","Laying Leg Raises","https://musclewiki.org/media/uploads/LegRaises-Side-021316.gif");
        noNameMethod("Abs","Hanging Knee Raises","https://musclewiki.org/media/uploads/bodyweight-male-hanging-knee-raises-side.gif");

        //BICEPS EXERCISES
        noNameMethod("Biceps","Barbell Curl","https://musclewiki.org/media/uploads/Male-Barbell-BicepCurl-side.gif");
        noNameMethod("Biceps","Dumbbell Curl","https://musclewiki.org/media/uploads/BicepCurl-Side-021316.gif");
        noNameMethod("Biceps","Hammer Curl","https://musclewiki.org/media/uploads/BicepHC-Side-021316.gif");
        noNameMethod("Biceps","Chin-Ups","https://musclewiki.org/media/uploads/bodyweight-male-chin-up-front.gif");
        noNameMethod("Biceps","Inverted Row","https://musclewiki.org/media/uploads/bodyweight-male-reverse-row-front.gif");

        //CALVES EXERCISES
        noNameMethod("Calves","Standing Calf Raises","https://musclewiki.org/media/uploads/StandingCalfRaisesWide-Front-021316.gif");
        noNameMethod("Calves","Seated Calf Raises","https://musclewiki.org/media/uploads/SeatedCalfRaises-side-021316.gif");

        //CHEST EXERCISES
        noNameMethod("Chest","Dumbbell Bench Press","https://musclewiki.org/media/uploads/BenchPress-Side-021316.gif");
        noNameMethod("Chest","Barbell Bench Press","https://musclewiki.org/media/uploads/dumbbell-benchpress-male-side.gif");
        noNameMethod("Chest","Dips","https://musclewiki.org/media/uploads/DumbbellCP-Side-021316.gif");
        noNameMethod("Chest","Incline Dumbbell Press","https://musclewiki.org/media/uploads/bodyweight-male-dips-side_5HAGnjr.gif");
        noNameMethod("Chest","Dumbbell Flys","https://musclewiki.org/media/uploads/Flyes-Side-021316.gif");
        noNameMethod("Chest","Incline Barbell Bench Press","https://musclewiki.org/media/uploads/male-incline-barbell-press-side_VFI8X1n.gif");

        //FOREARMS EXERCISES
        noNameMethod("Forearms","Behind The Back Barbell Wrist Curl","https://musclewiki.org/media/uploads/RV-Curl-Forearms-Front-021316.gif");
        noNameMethod("Forearms","Wrist Curl","https://musclewiki.org/media/uploads/ForearmCurls-Side-021316.gif");
        noNameMethod("Forearms","Reverse Curl","https://musclewiki.org/media/uploads/dumbbell-reversecurl-male-side.gif");
        noNameMethod("Forearms","Barbell Wrist Curl","https://musclewiki.org/media/uploads/barbell-wristcurl-male-side.gif");

        //GLUTES EXERCISES
        noNameMethod("Glutes","Glute Bridge","https://musclewiki.org/media/uploads/GluteBridges-Side-021316.gif");
        noNameMethod("Glutes","Barbell Hip Thrust","https://musclewiki.org/media/uploads/BarbellHT-Side-021316.gif");
        noNameMethod("Glutes","Single Leg Glute Bridge","https://musclewiki.org/media/uploads/bodyweight-slglutebridge-male-side.gif");

        //HAMSTRINGS EXERCISES
        noNameMethod("Hamstrings","Squat","https://musclewiki.org/media/uploads/Squats-Side-021316.gif");
        noNameMethod("Hamstrings","Stiff Leg Deadlifts","https://musclewiki.org/media/uploads/Male-Stiff-Leg-Deadlifts-front.gif");
        noNameMethod("Hamstrings","Hamstring Curl","https://musclewiki.org/media/uploads/ProneLegCurl-Back-021316.gif");

        //LATS EXERCISES
        noNameMethod("Lats","Neutral Grip Pulldown","https://musclewiki.org/media/uploads/NeutralGripPulldown-Front-021316.gif");
        noNameMethod("Lats","Seated Cable Row","https://musclewiki.org/media/uploads/SeatedCableRow-Side-021316.gif");
        noNameMethod("Lats","Bent Over Barbell Row","https://musclewiki.org/media/uploads/Male-bent-over-barbell-row-side_ptmr31v.gif");
        noNameMethod("Lats","Dumbbell Row","https://musclewiki.org/media/uploads/DumbbellRow-Side-021316.gif");

        //MIDBACK EXERCISES
        noNameMethod("MidBack","Deadlift","https://musclewiki.org/media/uploads/Deadlifts-Side-021316_F6Lp4jJ.gif");
        noNameMethod("MidBack","Seated Cable Row","https://musclewiki.org/media/uploads/SeatedCableRow-Side-021316.gif");
        noNameMethod("MidBack","Dumbbell Row","https://musclewiki.org/media/uploads/DumbbellRow-Side-021316.gif");

        //QUADRICEPS EXERCISES
        noNameMethod("Quadriceps","Squat","https://musclewiki.org/media/uploads/Squats-Side-021316.gif");
        noNameMethod("Quadriceps","Leg Press","https://musclewiki.org/media/uploads/LegPress-Front-021316.gif");
        noNameMethod("Quadriceps","Leg Extension","https://musclewiki.org/media/uploads/LegExtension-Front-021316.gif");
        noNameMethod("Quadriceps","Goblet Squat","https://musclewiki.org/media/uploads/GoblinSquat-Front-021316.gif");

        //SHOULDERS EXERCISES
        noNameMethod("Shoulders","Seated Dumbbell Shoulder Press","https://musclewiki.org/media/uploads/ShoulderPress-Front-021316_TPQKWgi.gif");
        noNameMethod("Shoulders","Side Lateral Raises","https://musclewiki.org/media/uploads/SideLateralRaise-Front-021316_FIRCTda.gif");
        noNameMethod("Shoulders","Bent-Over Rear Delt Fly","https://musclewiki.org/media/uploads/RearDF-Side-021316.gif");
        noNameMethod("Shoulders","Front Raises","https://musclewiki.org/media/uploads/dumbbell-male-frontraise-side.gif");

        //TRAPS EXERCISES
        noNameMethod("Traps","Seated DB Shrugs","https://musclewiki.org/media/uploads/SeatedDBShrugs-Side-021316.gif");
        noNameMethod("Traps","Standing Smith Machine Shrugs","https://musclewiki.org/media/uploads/StandingSMShrugs-back-021316_SJOQmEE.gif");

        //TRICEPS EXERCISES
        noNameMethod("Triceps","Seated Triceps Extensions","https://musclewiki.org/media/uploads/TricepExtensions-Side-021316.gif");
        noNameMethod("Triceps","Dips (narrow elbows)","https://musclewiki.org/media/uploads/bodyweight-male-dips-side.gif");
        noNameMethod("Triceps","Cable Push Downs","https://musclewiki.org/media/uploads/CablePulldowns-Side-021316.gif");
        noNameMethod("Triceps","Bench Dips","https://musclewiki.org/media/uploads/male-bench-tricep-dip-side.gif");
    }
    public void noNameMethod(String nameMuscle, String nameExercise, String gifLink){
        Exercise exercise = new Exercise();
        exercise.setNameMuscle(nameMuscle);
        exercise.setNameExercise(nameExercise);
        exercise.setGifLink(gifLink);
        addAllExercises(exercise);
    }

    public void addAllExercises(Exercise ex) {
        allExercises.add(ex);
    }


}
