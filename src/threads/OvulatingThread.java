package threads;

import general.Female;

public class OvulatingThread extends Thread {

    private int initialDelay;
    private  Female fem;

    public OvulatingThread(Female aThis, int i) {
this.fem = aThis;
this.initialDelay = i;
    }

    @Override
    public void run() {
        super.run();
        try {
            sleep(initialDelay);
            while (true) {
                sleep(2000);
                
                
                fem.ovulate();
                
                sleep(initialDelay);
                
                
                fem.menstruate();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}