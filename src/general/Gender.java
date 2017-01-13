package general;

import java.util.ArrayList;

public abstract class Gender {

    //Methods
    private Animal genderOwner;


    //Constructor
    public Gender() {

    }

    public abstract boolean isNotPregnant();

    public abstract void propagate(Animal parent1, Animal parent2);

    public abstract ArrayList<Egg> giveBirth();

    public abstract boolean isFemale();

    public Animal getGenderOwner() {
        return genderOwner;
    }

    //Setters and getters
    public void setGenderOwner(Animal owner) {
        this.genderOwner = owner;
    }


}
