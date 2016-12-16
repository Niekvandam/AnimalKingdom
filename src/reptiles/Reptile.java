package reptiles;

import Interfaces.IReptile;
import general.Animal;
import general.Egg;
import general.Female;
import general.Gender;
import java.util.ArrayList;
import zoo.Zoo;
public abstract class Reptile extends Animal implements IReptile {
    
    private ArrayList<Egg> reptileEggs;
    
public Reptile(){
    super();
}
    public Reptile(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }

    @Override
    public ArrayList<Egg> layEggs() {
        ArrayList reptileEggs = this.getGender().giveBirth();
        Zoo z = new Zoo();
        Zoo.getInstance();
//        z.addEggsOfReptiles(reptileEggs);
        return null;
    }

    
}
