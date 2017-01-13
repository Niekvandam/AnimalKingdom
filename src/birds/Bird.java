package birds;

import Interfaces.IBird;
import general.Animal;
import general.Egg;
import general.Gender;
import zoo.Zoo;

import java.util.ArrayList;

public abstract class Bird extends Animal implements IBird {
    public Bird() {
        super();
    }

    public Bird(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }


    public ArrayList<Egg> layEggs() {
        this.getGender().giveBirth();
        System.out.println("Laying eggs");
        return null;
    }

    public void hatchEggs(ArrayList<Egg> layedEggs){
        Zoo z = new Zoo();
        for (Egg e : layedEggs) {
            Animal b = e.getEmbryo();
            Zoo.getInstance();
            z.addAnimal(b);
        }
    }




}
