package general;

import mammals.Human;
import threads.OvulatingThread;
import zoo.Zoo;

import java.util.ArrayList;
import java.util.Random;


public class Female extends Gender {

    private ArrayList<Egg> eggs = new ArrayList();
    private OvulatingThread ovThread;
    private ArrayList<Egg> inseminatedEggs = new ArrayList();
    //Female constructor


    public Female() {
        Random r = new Random();
        int i = r.nextInt(10);
        i++;
        i = i * 1000;
        ovThread = new OvulatingThread(this, i);
        ovThread.start();
        r = null;
    }

    //methods
    public void ovulate() {
        if (this.isNotPregnant() == false) {
            System.out.println("You can't ovulate when you're pregnant");
        } else {
            int i = this.getGenderOwner().getMaxNumberOfEggs();
            for (int a = 0; a < i; a++) {
                eggs.add(new Egg());

            }

        }
        System.out.println("TIME FOR SEX");
    }

    public void menstruate() {
        if (this.isNotPregnant() == false) {
            System.out.println("You can't menstruate when you're pregnant");
        } else {
            eggs.clear();
            System.out.println("");
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
    public boolean isNotPregnant() {
        return inseminatedEggs.isEmpty();
    }


    @Override
    public void propagate(Animal parent1, Animal parent2) {
        this.ovulate();
         if (parent1.getClass().equals(parent2.getClass())) {
            for (Egg egg : this.eggs) {
                egg.inseminate(parent1, parent2);
                inseminatedEggs.add(egg);
            }

            } else{
                System.out.println("Can't fuck with da beast boii");

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
