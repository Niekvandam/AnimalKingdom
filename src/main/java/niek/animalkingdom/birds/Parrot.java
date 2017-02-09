package niek.animalkingdom.birds;

import niek.animalkingdom.general.Gender;

public class Parrot extends Bird {

    public Parrot() {
        super();
    }

    public Parrot(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }


    @Override
    public String communicate() {
        System.out.println("I am a parrot doot doot");
        return ("");
    }

    @Override
    public String fly() {
        String className = this.getClass().getName();
        return ("Fly like a " + className);
    }


}




