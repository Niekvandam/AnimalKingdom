package niek.animalkingdom.reptiles;

import niek.animalkingdom.general.Egg;
import niek.animalkingdom.general.Gender;
import niek.animalkingdom.zoo.Zoo;

import java.util.ArrayList;
import java.util.Random;

public class Crocodile extends Reptile {

    public Crocodile(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }

    public Crocodile() {
        super();
    }

    @Override
    public String communicate() {
        String[] arr = {"I am crocodile slav slav slav"};
        Random random = new Random();
        int select = random.nextInt(arr.length);
        return (name + "says:            " + arr[select]);
    }

    @Override
    public String crawl() {
        String className = this.getClass().getName();
        return ("Crawl like a " + className);
    }


    @Override
    public ArrayList<Egg> layEggs() {
        ArrayList<Egg> reptileEggs = this.giveBirth();
        Zoo.getInstance().addEggsOfReptiles(reptileEggs);
        return reptileEggs;
    }
}
    

