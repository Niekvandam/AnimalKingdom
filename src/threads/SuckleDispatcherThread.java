package threads;

import Interfaces.IMammal;
import general.Animal;
import mammals.Mammal;
import zoo.Zoo;

public class SuckleDispatcherThread extends Thread {
private Mammal mother;


    public SuckleDispatcherThread(Mammal aThis) {
     
    }

	@Override
	public void run() {
		super.run();
		try {
			/* Wait a while before the babies grow up and are added to the Zoo. */
			sleep(30000); /* This Thread pauzes for 30 seconds before executing the next line of code. Adjust if you feel the need. */
			
                                               mother.getBabies();
                                               System.out.println(IMammal.babies);
                                               for(IMammal anAnimal : IMammal.babies){
                                                  Zoo.getInstance().addAnimal((Animal) anAnimal);

                                               }
                                               IMammal.babies.clear();
                                               System.out.println("Babies added to the zoo");


		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
}
