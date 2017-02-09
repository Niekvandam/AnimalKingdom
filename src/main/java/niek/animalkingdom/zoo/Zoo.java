package niek.animalkingdom.zoo;

import niek.animalkingdom.birds.Bird;
import niek.animalkingdom.birds.Parrot;
import niek.animalkingdom.birds.Pinguin;
import niek.animalkingdom.general.Animal;
import niek.animalkingdom.general.Egg;
import niek.animalkingdom.general.Female;
import niek.animalkingdom.general.Male;
import niek.animalkingdom.mammals.*;
import niek.animalkingdom.reptiles.Crocodile;
import niek.animalkingdom.reptiles.Reptile;
import niek.animalkingdom.reptiles.Snake;
import niek.animalkingdom.special.Platypus;
import niek.animalkingdom.threads.ReptileEggHatcherThread;

import java.lang.reflect.Modifier;
import java.util.*;

public class Zoo {

    private static Zoo instance;
    protected String name;
    private TreeSet<Cage> cages = new TreeSet<>();
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
            loadAllAnimals();
        }
        return instance;
    }

    public static Zoo getInstance() {
        if (instance == null) {
            instance = new Zoo();
            loadAllAnimals();
        }
        return instance;
    }

    public static void loadAllAnimals() {
        Parrot p = new Parrot(new Male(), "Feathers", "Johan IV", "Blue", 0.18, 5);
        Parrot p1 = new Parrot(new Female(), "Feathers", "Johan IV", "Blue", 0.18, 5);
        Pinguin pingu = new Pinguin(new Male(), "Fur", "Klaus XVI", "Black and Gray", 0.5, 8);
        AfricanElephant Jan = new AfricanElephant(new Male(), "Skin", "Archibald gerard", "Gray", 800, 2, 3);
        AsianElephant Ping = new AsianElephant(new Male(), "Skin", "Bronto Johan Kaasvis", "Gray", 800, 2, 3);
        Elephant Elephant = new Elephant(new Male(), "Skin,", "Pweet pweet", "Gray", 900, 2);
        GrayMouse Piep = new GrayMouse(new Male(), "Hair", "Samuel L Jackson", "Gray", 0.2, 5);
        WhiteMouse Ed = new WhiteMouse(new Male(), "Hair", "Samuel L Jackson's white brother", "White", 0.2, 5);
        Human GiantCookie = new Human(new Female(), "Skin and Hair", "cAPSLOCK", "de la", "Erectus", "brown", 42.0, 30, false);
        Human PizzaMan = new Human(new Male(), "Skin and Hair", "jAN", "de", "Erectus", "brown", 42.0, 3, false);
        Human Homosapien = new Human(new Male(), "Skin and Hair", "kLAAS", "een", "Erectus", "brown", 42.0, 3, false);
        Human Hughmungus = new Human(new Male(), "Skin and Hair", "Ivan", "teh", "Slav", "Adidas", 80.1, 3, false);
        Crocodile snake1 = new Crocodile(new Male(), "Scales", "Rick", "Black", 3, 10);
        Crocodile snekk1inator = new Crocodile(new Female(), "Scales", "Coen", "Black and blue", 5, 15);
        Snake snake = new Snake(new Male(), "Scales", "Rick", "Black", 3, 10);
        Snake snekkinator = new Snake(new Female(), "Scales", "Coen", "Black and blue", 5, 15);
        Platypus plat = new Platypus(new Male(), "Fur", "Remco", "blue", 14, 13);
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

    public TreeSet<Cage> getCages() {
        return cages;
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

    public Cage getCageByRace1(String race) {
        for (Cage c : cages) {
            c.getCageType();
            if (race.equals(c.getCageType().toString())) {
                return c;
            } else {

            }
        }
        Cage c = new Cage(race);
        cages.add(c);
        return c;
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

    public ArrayList<Animal> getAllAnimalsByRace1(String race) {
        Cage aCage = getCageByRace1(race);
        ArrayList<Animal> animals = aCage.getCagedAnimals();
        return animals;
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

    public Set<Animal> getAllAnimals() {
        Set<Animal> allAnimals = new HashSet<Animal>() {
        };
        for (Cage c : cages) {
            allAnimals.addAll(c.getCagedAnimals());
        }
        return allAnimals;
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


    public Animal getAnimalByUUID(UUID ID) {
        for (Animal a : getAllAnimals()) {
            String uuidString = ID.toString();
            if (!uuidString.equals(a.getID().toString())) {
                continue;
            }
            return a;
        }
        return null;
    }
}