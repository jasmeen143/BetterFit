package singh.betterfit;

import java.util.ArrayList;
import java.util.List;

public class Muscle {

    private String nombre;
    private String description;
    private int image;
    private boolean trained;

    public Muscle() {
    }

    public Muscle(String nombre, String description, int image,boolean trained) {
        this.nombre = nombre;
        this.description = description;
        this.image = image;
        this.trained = trained;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public List<String> addNames() {
        List<String> names = new ArrayList<String>();
        names.add("Abs");
        names.add("Biceps");
        names.add("Calves");
        names.add("Chest");
        names.add("Forearms");
        names.add("Glutes");
        names.add("Hamstrings");
        names.add("Lats");
        names.add("MidBack");
        names.add("Quadriceps");
        names.add("Shoulders");
        names.add("Traps");
        names.add("Triceps");
        return names;
    }

    public List<String> addDescriptions() {
        List<String> descriptions = new ArrayList<String>();
        descriptions.add("Abs description");
        descriptions.add("Biceps description");
        descriptions.add("Calves description");
        descriptions.add("Chest description");
        descriptions.add("Forearms description");
        descriptions.add("Glutes description");
        descriptions.add("Hamstrings description");
        descriptions.add("Lats description");
        descriptions.add("MidBack description");
        descriptions.add("Quadriceps description");
        descriptions.add("Shoulders description");
        descriptions.add("Traps description");
        descriptions.add("Triceps description");
        return descriptions;
    }

    public List<Integer> addImages() {
        List<Integer> images = new ArrayList<Integer>();

        images.add(R.drawable.abs);
        images.add(R.drawable.biceps);
        images.add(R.drawable.calves);
        images.add(R.drawable.chest);
        images.add(R.drawable.forearms);
        images.add(R.drawable.glutes);
        images.add(R.drawable.hamstrings);
        images.add(R.drawable.lats);
        images.add(R.drawable.midback);
        images.add(R.drawable.quadriceps);
        images.add(R.drawable.shoulders);
        images.add(R.drawable.traps);
        images.add(R.drawable.triceps);

        return images;
    }
    public List<Boolean> addTrained() {
        List<Boolean> trained = new ArrayList<Boolean>();
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        return trained;
    }
}
