package general;

import java.util.ArrayList;

public class Male extends Gender {

    //Male constructor
    public Male() {

    }


    //Abstract methods
    @Override
    public boolean isNotPregnant() {
        System.out.println("Why did you even bother thinking a male could be pregnant");
        return false;
    }

    @Override
    public void propagate(Animal parent1, Animal parent2) {
        System.out.println("This is fun");
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
