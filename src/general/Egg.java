package general;

import birds.Parrot;
import birds.Pinguin;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import mammals.AfricanElephant;
import mammals.AsianElephant;
import mammals.GrayMouse;
import mammals.Human;
import mammals.WhiteMouse;
import reptiles.Crocodile;
import reptiles.Snake;
import special.Platypus;

public class Egg {

    private Animal embryo;
    private ArrayList<Egg> reptileEggs = new ArrayList();


    //Egg constructor
    public Egg() {
    
    }

    //Egg methods
    public boolean isInseminated() {
    if (embryo == null){
    return false;
            } else {
    return true;
    }
    }
    
    public Animal getEmbryo() {
        return embryo;
    }

    public void inseminate(Animal parent1, Animal parent2) {
        Random rand = new Random();
        int a = rand.nextInt(2) + 1;
        String classname = parent1.getClass().getSimpleName();
        switch (classname) {

            case "Human":
                embryo = new Human();
                if (a == 1) {
                    embryo.setColor(parent1.getColor());
                    embryo.setBodyCovering(parent1.getBodyCovering());
                    embryo.setGender(parent1.getGender());
                    embryo.setMaxNumberOfEggs(parent1.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent1.getWeight());
                    ((Human) embryo).setInsertion(((Human) parent1).getInsertion());
                    ((Human) embryo).setLastName(((Human) parent1).getLastName());
                    ((Human) embryo).setName(this.namegiving());
                } else {
                    embryo.setColor(parent2.getColor());
                    embryo.setBodyCovering(parent2.getBodyCovering());
                    embryo.setGender(parent2.getGender());
                    embryo.setMaxNumberOfEggs(parent2.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent2.getWeight());
                    ((Human) embryo).setInsertion(((Human) parent1).getInsertion());
                    ((Human) embryo).setLastName(((Human) parent1).getLastName());
                    ((Human) embryo).setName(this.namegiving());
                }
                break;

            case "AsianElephant":

                embryo = new AsianElephant();
                if (a == 1) {
                    embryo.setColor(parent1.getColor());
                    embryo.setBodyCovering(parent1.getBodyCovering());
                    embryo.setGender(parent1.getGender());
                    embryo.setMaxNumberOfEggs(parent1.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent1.getWeight());
                    ((AsianElephant) embryo).setEarSize(((AsianElephant) parent1).getEarSize());
                    ((AsianElephant) embryo).setName(this.namegiving());
                } else {
                    embryo.setColor(parent2.getColor());
                    embryo.setBodyCovering(parent2.getBodyCovering());
                    embryo.setGender(parent2.getGender());
                    embryo.setMaxNumberOfEggs(parent2.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent2.getWeight());
                    ((AsianElephant) embryo).setEarSize(((AsianElephant) parent2).getEarSize());
                    ((AsianElephant) embryo).setName(this.namegiving());
                }
                break;

            case "AfricanElephant":
                embryo = new AfricanElephant();
                if (a == 1) {
                    embryo.setColor(parent1.getColor());
                    embryo.setBodyCovering(parent1.getBodyCovering());
                    embryo.setGender(parent1.getGender());
                    embryo.setMaxNumberOfEggs(parent1.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent1.getWeight());
                    ((AsianElephant) embryo).setEarSize(((AsianElephant) parent1).getEarSize());
                    ((AfricanElephant) embryo).setName(this.namegiving());
                } else {
                    embryo.setColor(parent2.getColor());
                    embryo.setBodyCovering(parent2.getBodyCovering());
                    embryo.setGender(parent2.getGender());
                    embryo.setMaxNumberOfEggs(parent2.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent2.getWeight());
                    ((AfricanElephant) embryo).setEarSize(((AfricanElephant) parent2).getEarSize());
                    ((AfricanElephant) embryo).setName(this.namegiving());
                }
                break;

            case "WhiteMouse":
                embryo = new WhiteMouse();
                if (a == 1) {
                    embryo.setColor(parent1.getColor());
                    embryo.setBodyCovering(parent1.getBodyCovering());
                    embryo.setGender(parent1.getGender());
                    embryo.setMaxNumberOfEggs(parent1.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent1.getWeight());
                    ((WhiteMouse) embryo).setName(this.namegiving());
                } else {
                    embryo.setColor(parent2.getColor());
                    embryo.setBodyCovering(parent2.getBodyCovering());
                    embryo.setGender(parent2.getGender());
                    embryo.setMaxNumberOfEggs(parent2.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent2.getWeight());
                    ((WhiteMouse) embryo).setName(this.namegiving());
                }
                break;

            case "GrayMouse":
                embryo = new GrayMouse();
                if (a == 1) {
                    embryo.setColor(parent1.getColor());
                    embryo.setBodyCovering(parent1.getBodyCovering());
                    embryo.setGender(parent1.getGender());
                    embryo.setMaxNumberOfEggs(parent1.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent1.getWeight());
                    ((GrayMouse) embryo).setName(this.namegiving());
                } else {
                    embryo.setColor(parent2.getColor());
                    embryo.setBodyCovering(parent2.getBodyCovering());
                    embryo.setGender(parent2.getGender());
                    embryo.setMaxNumberOfEggs(parent2.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent2.getWeight());
                    ((GrayMouse) embryo).setName(this.namegiving());
                }
                break;

            case "Snake":
                embryo = new Snake();
                if (a == 1) {
                    embryo.setColor(parent1.getColor());
                    embryo.setBodyCovering(parent1.getBodyCovering());
                    embryo.setGender(parent1.getGender());
                    embryo.setMaxNumberOfEggs(parent1.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent1.getWeight());
                    ((Snake) embryo).setName(this.namegiving());  
                } else {
                    embryo.setColor(parent2.getColor());
                    embryo.setBodyCovering(parent2.getBodyCovering());
                    embryo.setGender(parent2.getGender());
                    embryo.setMaxNumberOfEggs(parent2.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent2.getWeight());
                    ((Snake) embryo).setName(this.namegiving());
                }
                break;

            case "Crocodile":
                embryo = new Crocodile();
                if (a == 1) {
                    embryo.setColor(parent1.getColor());
                    embryo.setBodyCovering(parent1.getBodyCovering());
                    embryo.setGender(parent1.getGender());
                    embryo.setMaxNumberOfEggs(parent1.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent1.getWeight());
                    ((Crocodile) embryo).setName(this.namegiving());
                } else {
                    embryo.setColor(parent2.getColor());
                    embryo.setBodyCovering(parent2.getBodyCovering());
                    embryo.setGender(parent2.getGender());
                    embryo.setMaxNumberOfEggs(parent2.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent2.getWeight());
                    ((Crocodile) embryo).setName(this.namegiving());
                }
                break;

            case "Platypus":
                embryo = new Platypus();
                if (a == 1) {
                    embryo.setColor(parent1.getColor());
                    embryo.setBodyCovering(parent1.getBodyCovering());
                    embryo.setGender(parent1.getGender());
                    embryo.setMaxNumberOfEggs(parent1.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent1.getWeight());
                    ((Platypus) embryo).setName(this.namegiving());
                } else {
                    embryo.setColor(parent2.getColor());
                    embryo.setBodyCovering(parent2.getBodyCovering());
                    embryo.setGender(parent2.getGender());
                    embryo.setMaxNumberOfEggs(parent2.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent2.getWeight());
                    ((Platypus) embryo).setName(this.namegiving());
                }
                break;
            case "Parrot":
                embryo = new Parrot();
                if (a == 1) {
                    embryo.setColor(parent1.getColor());
                    embryo.setBodyCovering(parent1.getBodyCovering());
                    embryo.setGender(parent1.getGender());
                    embryo.setMaxNumberOfEggs(parent1.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent1.getWeight());
                    ((Parrot) embryo).setName(this.namegiving());
                } else {
                    embryo.setColor(parent2.getColor());
                    embryo.setBodyCovering(parent2.getBodyCovering());
                    embryo.setGender(parent2.getGender());
                    embryo.setMaxNumberOfEggs(parent2.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent2.getWeight());
                    ((Parrot) embryo).setName(this.namegiving());
                }
                break;
            case "Pinguin":
                embryo = new Pinguin();
                if (a == 1) {
                    embryo.setColor(parent1.getColor());
                    embryo.setBodyCovering(parent1.getBodyCovering());
                    embryo.setGender(parent1.getGender());
                    embryo.setMaxNumberOfEggs(parent1.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent1.getWeight());
                    ((Pinguin) embryo).setName(this.namegiving());
                } else {
                    embryo.setColor(parent2.getColor());
                    embryo.setBodyCovering(parent2.getBodyCovering());
                    embryo.setGender(parent2.getGender());
                    embryo.setMaxNumberOfEggs(parent2.getMaxNumberOfEggs());
                    embryo.setWeight((int) parent2.getWeight());
                    ((Pinguin) embryo).setName(this.namegiving());

                }
                break;
        }
    }

    public String namegiving(){
        String[] arr = {
            "Gay",
            "Dexter",
            "Fern",
            "Theola",
            "Rosalinda",
            "Arnetta",
            "Tyra",
            "Teisha ",
            "Klara",
            "Dallas",
            "Lien",
            "Thomasine",
            "Evie",
            "Elyse ",
            "Bettina",
            "Ernesto",
            "Earline",
            "Margherita ",
            "Monika",
            "Andy ",
            "Lilliana",
            "Everette ",
            "Keesha",
            "Ellie",
            "Shaneka",
            "Henry ",
            "Ashleigh",
            "Melvina ",
            "Hallie",
            "Adrien ",
            "Xiao",
            "Evette ",
            "Sigrid",
            "Yetta",
            "Tam",
            "Kelli ",
            "Desmond",
            "Livia",
            "Michelle",
            "Angel",
            "WHEN YOU Buster NUT BUT SHE KEEPS GOING",
            "Mauricio",
            "Angie",
            "Ericka",
            "Latonya",
            "Donny",
            "Ruth",
            "Kira ",
            "Jamie",
            "Claudine"};
        Random random = new Random();
        int select = random.nextInt(arr.length);
        return(arr[select]);
        }

}
