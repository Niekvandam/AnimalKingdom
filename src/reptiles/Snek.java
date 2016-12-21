package reptiles;
import general.Egg;
import general.Gender;
import zoo.Zoo;

import java.util.ArrayList;
import java.util.Random;
public class Snek extends Reptile {

    @Override
    public String communicate() {
        String[] arr = {"Hissssssssssssss", "Dank memes are lyfe", "Dootlespook", "LALALALALALA I AM A SNEK"};
        Random random = new Random();
        int select = random.nextInt(arr.length);
        return (name + "says:            " + arr[select]);
    }

    @Override
    public String crawl() {
        String className = this.getClass().getName();
        return ("I am snek, I don't crawl. I fly on dank memes. I am " + className);
    }


    public Snek(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }


    @Override
    public ArrayList<Egg> layEggs() {
        ArrayList<Egg> reptileEggs = this.giveBirth();
        Zoo.getInstance().addEggsOfReptiles(reptileEggs);
        return reptileEggs;
    }
}
