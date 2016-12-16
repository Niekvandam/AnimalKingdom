package threads;

import general.Female;
import static java.lang.Thread.sleep;

public class SuperSexyThread extends Thread {

    public SuperSexyThread() {

    }

    @Override
    public void run() {
        super.run();
        try {
            sleep(2000);
            while (true) {
                sleep(2000);

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
