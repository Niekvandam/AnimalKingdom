package general;

import threads.OvulatingThread;
import zoo.Zoo;

import java.util.ArrayList;
import java.util.Random;


public class Female extends Gender {

    private ArrayList<Egg> eggs = new ArrayList();
    private final OvulatingThread ovThread;
    private ArrayList<Egg> inseminatedEggs = new ArrayList();

    //Female constructor
    public Female() {
        Random r = new Random();
        int i = r.nextInt(10);
        i++;
        i = i * 100;
        ovThread = new OvulatingThread(this, i);
        ovThread.start();
        r = null;
    }

    //methods
    public void ovulate() {
        if (this.isPregnant() == true) {
            System.out.println("You can't ovulate when you're pregnant");
        } else {
            int i = this.getGenderOwner().getMaxNumberOfEggs();
            for (int a = 0; a < i; a++) {
                eggs.add(new Egg());
                System.out.println("Ovulation succesfull");
            }
        }
    }

    public void menstruate() {
        if (this.isPregnant() == true) {
            System.out.println("You can't menstruate when you're pregnant");
        } else {
            eggs.clear();
            System.out.println("Menstruation succesfull");
        }
    }

    //Getters and Setters
    public ArrayList<Egg> getEggs() {
        return eggs;
    }

    public void setEggs(ArrayList<Egg> eggs) {
        this.eggs = eggs;
    }

    //Abstract methods
    @Override
    public boolean isPregnant() {
        for(Egg egg: eggs) {
         egg.isInseminated();
        if (egg.isInseminated());
        return true;
        }
        return false;
    }

    @Override
    public void propagate(Animal parent1, Animal parent2) {
        if (parent1.getClass().getSimpleName() != parent2.getClass().getSimpleName()) {

        }
        if (parent1.isFemale() && parent2.isFemale() == true) {

        } else {
            System.out.println("We are inseminating eggs oh yeah oh yeah");
            for (Egg egg : this.eggs) {
                egg.inseminate(parent1, parent2);
                inseminatedEggs.add(egg);


            }

        }
    }

    @Override
    public ArrayList<Egg> giveBirth() {
        return inseminatedEggs;
    }

    @Override
    public boolean isFemale() {
        return true;
    }

}
