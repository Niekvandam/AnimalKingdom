package mammals;

import Interfaces.IMammal;
import general.Animal;
import general.Egg;
import general.Gender;
import threads.SuckleDispatcherThread;

import java.util.ArrayList;


public abstract class Mammal extends Animal implements IMammal {

    private ArrayList<Egg> mammalEggs;

    public Mammal() {
        super();
    }

    public Mammal(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }

    public String giveLifeBirth() {
        ArrayList<Egg> mammalEggs = this.giveBirth();
        for (Egg m : mammalEggs) {
            babies.add((IMammal) m.getEmbryo());
        }
        this.suckle();
        return ("Suckle ing thingy idfk");
    }


    @SuppressWarnings("SameReturnValue")
    public ArrayList<IMammal> getBabies() {
        return babies;
    }


    public void suckle() {
        System.out.println("New suckledispatcherthread");
        new SuckleDispatcherThread(this).start();


    }

}