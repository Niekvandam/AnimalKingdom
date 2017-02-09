package niek.animalkingdom.zoo;

import niek.animalkingdom.general.Animal;
import niek.animalkingdom.general.Egg;

import java.util.ArrayList;

public class Cage implements Comparable {

    private ArrayList<Animal> cagedAnimals = new ArrayList();
    private String cageType;
    private Zoo Zoo;

    //Constructor
    public Cage(String Type) {
        this.cageType = Type;
        Zoo z = niek.animalkingdom.zoo.Zoo.getInstance("ICO41A");
        boolean b = z.addCage(this);
    }

    public Cage() {
    }

    //Methods
    public Animal selectAnimal() {
        return null;

    }

    public String getCageType() {
        return cageType;
    }


    public void setCageType(String cageType) {
        this.cageType = cageType;
    }

    public void addReptileEggs(ArrayList<Egg> reptileEggs) {
        for (Egg e : reptileEggs) {
            Animal embryo = e.getEmbryo();
            this.addAnimal(embryo);
        }
    }

    public boolean addAnimal(Animal anAnimal) {
        this.cagedAnimals.add(anAnimal);
        return true;
    }


    public ArrayList<Animal> getCagedAnimals() {
        return cagedAnimals;
    }

    @Override
    public int compareTo(Object o) {
        return -1;
    }


}
