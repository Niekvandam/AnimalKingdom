package threads;

import general.Female;
import mammals.Human;

import static java.lang.Thread.sleep;

public class SuperSexyThread extends Thread {
private Human human;

    public SuperSexyThread() {
this.human = human;
    }


    public void run(Human partner) {
        super.run();
        try {
            sleep(2000);
            while (true) {
                sleep(2000);

                human.MakeLove(partner);

                System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                System.out.println("EEEeeeeeeeeeeEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
