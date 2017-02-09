package niek.animalkingdom.birds;

import niek.animalkingdom.general.Gender;

public class Pinguin extends Bird {

    public Pinguin() {
        super();
    }

    public Pinguin(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }

    @Override
    public String communicate() {
        System.out.println("NOOT NOOT");
        return ("");
    }

    @Override
    public String fly() {
        String className = this.getClass().getName();
        return ("Fly like a " + className);
    }


}
