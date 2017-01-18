package threads;

import Interfaces.IMammal;
import general.Animal;
import mammals.Mammal;
import zoo.Zoo;

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
