package birds;
import Interfaces.IBird;
import general.Animal;
import general.Egg;
import general.Female;
import general.Gender;
import java.util.ArrayList;
import zoo.Zoo;
public abstract class Bird extends Animal implements IBird{
public Bird(){
    super();
}
public Bird (Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs){
            super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
}


public ArrayList<Egg> layEggs(){
     this.getGender().giveBirth();
     return null;
}

public void hatchEggs(ArrayList<Egg> layedEggs){
Zoo z = new Zoo();
for(Egg e : layedEggs){
Animal b = e.getEmbryo();
Zoo.getInstance();
z.addAnimal(b);
}
}


}