package zoo;

import general.Animal;
import general.Egg;
import threads.ReptileEggHatcherThread;

import java.util.ArrayList;
import java.util.TreeSet;

public class Zoo {

    private TreeSet<Cage> cages = new TreeSet();
    protected String name;
    private static Zoo instance;
    private ArrayList ReptileEggHatcherThread;
    private Cage aCage;
    

    
    //Constructors
    public Zoo() {
        this.cages = new TreeSet();
    }

    public Zoo(String name) {
        this.name = name;
        this.cages = new TreeSet();
    }

//methods
    public static Zoo getInstance(String name) {
        if (instance == null) {
            instance = new Zoo(name);
        }
        return instance;
    }
    
   public static Zoo getInstance() {
        if (instance == null) {
            instance = new Zoo();
        }
        return instance;
    }


    public boolean addCage(Cage aCage) {
        cages.add(aCage);
        return true;
    }

    public boolean addAnimal(Animal anAnimal) {
          Cage aCage = getCageOfAnimal(anAnimal);
        if (aCage == null){
            aCage = new Cage(anAnimal.getClass().getSimpleName());
            cages.add(aCage);
        }
        return aCage.addAnimal(anAnimal);
    }

    public Cage getCageOfAnimal(Animal anAnimal) {
        Cage cage = getCageByRace(anAnimal.getClass());
        return cage;
    }

    public ArrayList<Cage> getCagesBySpeciesOfAnimal(Animal anAnimal) {
        return null;
    }

    public ArrayList<Cage> getCagesBySpecies(Class<? extends Animal> species) {
        return null;
    }

    public Cage getCageByRace(Class<? extends Animal> race) {
        for (Cage c : this.cages ) {
            String type = c.getCageType();
            String className = race.getSimpleName();
            if (type.equals(className)) {
                return c;
            }  else {
                return null;
            }
        }
       return aCage;
  }

    public ArrayList<Animal> getAllAnimalsByRace(Class<? extends Animal> race) {
        Cage aCage = getCageByRace(Animal.class);

        return aCage.getCagedAnimals();
    }

    public ArrayList<Animal> getAllAnimalsBySpecies(Class<? extends Animal> species) {
        ArrayList<Cage> cages = getCagesBySpecies(Animal.class);
        for(Cage c : cages){
       ArrayList<Animal> animalsOfCage = c.getCagedAnimals();
        }
        return null;
    }

    public ArrayList<Animal> getAllAnimals() {
        return null;
    }


  public void addEggsOfReptiles(ArrayList<Egg> reptileEggs) {
      Cage reptileCage = getCageByRace(reptileEggs.get(0).getEmbryo().getClass());
      new ReptileEggHatcherThread(reptileCage, reptileEggs).start();

    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
