package niek.animalkingdom.mammals;

import niek.animalkingdom.general.Gender;

import java.util.Random;

public class Elephant extends Mammal {

    protected static int earSize;

    public Elephant() {
        super();
    }


    public Elephant(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }

    public int getEarSize() {
        return earSize;
    }

    public void setEarSize(int earSize) {
        Elephant.earSize = earSize;
    }

    @Override
    public String communicate() {
        String[] arr = {
                "PWEEEEET"
                , "DOOT DOOT DOOT DOOT"
                , "PWET PWUT PRUT BLABLR"
                , "IK BEN EEN OLIFANT DOOT DOOT"
        };
        Random random = new Random();
        int select = random.nextInt(arr.length);
        return (name + " says:            " + arr[select]);
    }

    @Override
    public void suckle() {

    }
}

   


 
    
      
      

