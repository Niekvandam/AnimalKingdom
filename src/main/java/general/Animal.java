package general;

import zoo.Zoo;

import java.util.ArrayList;

public abstract class Animal {

    //Animal methods
    protected int maxNumberOfEggs;
    protected String bodyCovering;
    protected String name;

    //ArrayLists
    protected String color;
    protected double weight;
    private Gender gender;
    //Animal constructor
    public Animal() {

    }
    public Animal(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs) {
        this.bodyCovering = bodyCovering;
        this.gender = gender;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.maxNumberOfEggs = maxNumberOfEggs;
        this.gender.setGenderOwner(this);
        Zoo z = Zoo.getInstance();
        boolean b = z.addAnimal(this);
    }

    public abstract String communicate();

    public boolean isFemale() {
        return gender.isFemale();
    }

    public ArrayList<Egg> giveBirth() {
        ArrayList<Egg> giveBirth = this.getGender().giveBirth();
       return giveBirth;
    }

    public String propagate(Animal partner) {
//        if (this.getClass().getSimpleName() != partner.getClass().getSimpleName()) {
//            System.out.println("Can't propagate because it's not the same species");
//        } else {
        partner.gender.propagate(this, partner);
        this.gender.propagate(partner, this);
        System.out.println("Propagating...");
        this.gender.propagate(this, partner);
        return ("Propagation complete");
    }


    public boolean isPregnant() {
        return gender.isPregnant();
    }

    //Getters and Setters
    public String getBodyCovering() {
        return bodyCovering;
    }

    public void setBodyCovering(String bodyCovering) {
        this.bodyCovering = bodyCovering;
    }

    @SuppressWarnings("UnusedReturnValue")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getMaxNumberOfEggs() {
        return maxNumberOfEggs;
    }

    public void setMaxNumberOfEggs(int maxNumberOfEggs) {
        this.maxNumberOfEggs = maxNumberOfEggs;
    }

}
