package niek.animalkingdom.threads;

import niek.animalkingdom.Interfaces.IMammal;
import niek.animalkingdom.general.Animal;
import niek.animalkingdom.mammals.Mammal;
import niek.animalkingdom.zoo.Zoo;

public class SuckleDispatcherThread extends Thread {
    private Mammal mother;


    public SuckleDispatcherThread(Mammal mother) {
        this.mother = mother;

    }

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("Reached suckle");
            sleep(3);
            for (IMammal m : mother.getBabies()) {
                Zoo.getInstance().addAnimal((Animal) m);

            }
            mother.getBabies().clear();


        } catch (InterruptedException e) {

            e.printStackTrace();
        }


    }


}
