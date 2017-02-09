package niek.animalkingdom.mammals;

import niek.animalkingdom.general.Gender;

import java.util.Random;

public class Mouse extends Mammal {

    public Mouse() {
        super();
    }

    public Mouse(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }


    @Override
    public String communicate() {
        String[] arr = {"Piep", "GIVE ME CHEESE I WANT CHEESE", "Notice me because I am a mouse and I am small and stuff"};
        Random random = new Random();
        int select = random.nextInt(arr.length);
        return (name + " says:        " + arr[select]);
    }

    @Override
    public void suckle() {

    }

}
