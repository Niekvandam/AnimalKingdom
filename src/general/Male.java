package general;

import general.Gender;
import general.Animal;
import java.util.ArrayList;

public class Male extends Gender {

    //Male constructor
public Male(){
    
}

    
  //Abstract methods
    @Override
    public boolean isPregnant() {
        System.out.println("Why did you even bother thinking a male could be pregnant");
        return false;
    }

    @Override
    public void propagate(Animal parent1, Animal parent2) {
 
    }

    @Override
    public ArrayList<Egg> giveBirth() {
      System.out.println("Does nothing but being nervous and walking in circles while waiting for the baby to be born");
      return null;
    }

    @Override
    public boolean isFemale() {
        return false;
    }

}
