package mammals;

import Interfaces.IMammal;
import general.Animal;
import general.Egg;
import general.Gender;
import threads.SuckleDispatcherThread;

import java.util.ArrayList;


public abstract class Mammal extends Animal {

    private ArrayList<Egg> mammalEggs;
    
    public Mammal() {
        super();
    }
    public Mammal (Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs){
            super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }

    public void giveLifeBirth() {
ArrayList<Egg> mammalEggs = this.giveBirth();
 for(Egg m : mammalEggs){
 m.getEmbryo();
 }
 this.suckle();
System.out.println("Suckle ing thingy idfk");
 }
    

    public ArrayList<IMammal> getBabies() {
    IMammal.babies.clear();
    return null;
    }


        public void suckle() {
                    System.out.println("New suckledispatcherthread");
        new SuckleDispatcherThread(this).start();

}

}