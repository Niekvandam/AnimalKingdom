package niek.animalkingdom.birds;

import niek.animalkingdom.Interfaces.IBird;
import niek.animalkingdom.general.Animal;
import niek.animalkingdom.general.Egg;
import niek.animalkingdom.general.Gender;
import niek.animalkingdom.zoo.Zoo;

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

    public void hatchEggs(ArrayList<Egg> layedEggs) {
        Zoo z = new Zoo();
        for (Egg e : layedEggs) {
            Animal b = e.getEmbryo();
            Zoo.getInstance();
            z.addAnimal(b);
        }
    }


}
