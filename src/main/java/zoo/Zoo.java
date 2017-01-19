package zoo;

import birds.Bird;
import general.Animal;
import general.Egg;
import mammals.Mammal;
import reptiles.Reptile;
import threads.ReptileEggHatcherThread;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.TreeSet;

public class Zoo {

    private static Zoo instance;
    protected String name;
    private TreeSet<Cage> cages = new TreeSet();
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
        if (aCage == null) {
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
        ArrayList<Cage> cages = new ArrayList();
        ArrayList<Class<? extends Animal>> allspecies = new ArrayList<>();
        allspecies.add(Animal.class);
        allspecies.add(Reptile.class);
        allspecies.add(Mammal.class);
        allspecies.add(Bird.class);

        if (!Modifier.isAbstract(species.getModifiers()) || !allspecies.contains(species)) {
            return cages;
        }
        for (Cage cage : this.cages) {
            String cageRace = cage.getCageType();
        }
        return cages;
    }


    public Cage getCageByRace(Class<? extends Animal> race) {
        for (Cage c : cages) {
            c.getCageType();
            if (race.getSimpleName().equals(c.getCageType())) {
                return c;
            } else {

            }
        }
        Cage c = new Cage(race.getSimpleName());
        cages.add(c);
        return c;
    }

    public ArrayList<Animal> getAllAnimalsByRace(Class<? extends Animal> race) {
        Cage aCage = getCageByRace(race);
        ArrayList<Animal> animals = aCage.getCagedAnimals();
        return animals;
    }


    public ArrayList<Animal> getAllAnimalsBySpecies1(Class<? extends Animal> species) {
        ArrayList<Animal> animalsBySpecies = new ArrayList<>();
        if (!Modifier.isAbstract(species.getModifiers())) {
            return animalsBySpecies;
        }
        ArrayList<Cage> cages = getCagesBySpecies(species);
        for (Cage c : cages) {
            ArrayList<Animal> animalsOfCage = c.getCagedAnimals();
            if (animalsOfCage.size() <= 0) {
                continue;
            }
            animalsBySpecies.addAll(animalsOfCage);
        }
        return animalsBySpecies;
    }

//    public ArrayList<Animal> getAllAnimalsBySpecies(Class<? extends Animal> species) {
//        Cage cages = getCagesBySpecies();
//        for (Cage animalsOfCage : cages) {
//            animalsOfCage.getCagedAnimals();
//        }
//    }


//    public ArrayList<Animal> getAllAnimals() {
//        return this.getAllAnimalsBySpecies(Animal.class);
//    }


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
