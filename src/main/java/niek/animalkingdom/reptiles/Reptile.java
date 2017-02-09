package niek.animalkingdom.reptiles;

import niek.animalkingdom.Interfaces.IReptile;
import niek.animalkingdom.general.Animal;
import niek.animalkingdom.general.Egg;
import niek.animalkingdom.general.Gender;

import java.util.ArrayList;

public abstract class Reptile extends Animal implements IReptile {

    private ArrayList<Egg> reptileEggs = new ArrayList<>();

    public Reptile() {
        super();
    }

    public Reptile(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }


}



    

