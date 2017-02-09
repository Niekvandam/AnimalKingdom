package niek.animalkingdom.threads;

import niek.animalkingdom.general.Female;

public class OvulatingThread extends Thread {

    private int initialDelay;
    private Female fem;

    public OvulatingThread(Female aThis, int i) {
        this.fem = aThis;
        this.initialDelay = i;
    }

    @Override
    public void run() {
        super.run();
        try {
            sleep(initialDelay);
            //noinspection InfiniteLoopStatement
            while (true) {

                fem.ovulate();

                sleep(20000);

                fem.menstruate();

                sleep(20000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
