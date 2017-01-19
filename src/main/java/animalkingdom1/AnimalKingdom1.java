package animalkingdom1;
import birds.Pinguin;
import birds.Bird;
import birds.Parrot;
import general.Animal;
import general.Female;
import general.Male;
import mammals.*;
import reptiles.Crocodile;
import reptiles.Reptile;
import reptiles.Snake;
import zoo.Cage;
import zoo.Zoo;

import java.util.ArrayList;

public class AnimalKingdom1 {

    public static void main(String[] args) throws InterruptedException {


        Parrot p = new Parrot(new Male(), "Feathers", "Johan IV", "Blue", 0.18, 5);
        Parrot p1 = new Parrot(new Female(), "Feathers", "Johan IV", "Blue", 0.18, 5);

        Pinguin pingu = new Pinguin(new Male(), "Fur", "Klaus XVI", "Black and Gray", 0.5, 8);

        AfricanElephant Jan = new AfricanElephant(new Male(), "Skin", "Archibald gerard", "Gray", 800, 2, 3);

        AsianElephant Ping = new AsianElephant(new Male(), "Skin", "Bronto Johan Kaasvis", "Gray", 800, 2, 3);

        Elephant Elephant = new Elephant(new Male(), "Skin,", "Pweet pweet", "Gray", 900, 2);

        GrayMouse Piep = new GrayMouse(new Male(), "Hair", "Samuel L Jackson", "Gray", 0.2, 5);

        WhiteMouse Ed = new WhiteMouse(new Male(), "Hair", "Samuel L Jackson's white brother", "White", 0.2, 5);

        Human GiantCookie = new Human(new Female(), "Skin and Hair", "Homo", "de la", "Erectus", "brown", 42.0, 30, false);

        Human PizzaMan = new Human(new Male(), "Skin and Hair", "Homo", "de", "Erectus", "brown", 42.0, 3, false);
        Human Homosapien = new Human(new Male(), "Skin and Hair", "Homo", "een", "Erectus", "brown", 42.0, 3, false);
        Human Hughmungus = new Human(new Male(), "Skin and Hair", "Ivan", "teh", "Slav", "Adidas", 80.1, 3, false);


        Crocodile snake1 = new Crocodile(new Male(), "Scales", "Rick", "Black", 3, 10);
        Crocodile snekk1inator = new Crocodile(new Female(), "Scales", "Coen", "Black and blue", 5, 15);

        Snake snake = new Snake(new Male(), "Scales", "Rick", "Black", 3, 10);
        Snake snekkinator = new Snake(new Female(), "Scales", "Coen", "Black and blue", 5, 15);

        //All methods


        GiantCookie.propagate(Hughmungus);
        System.out.println(GiantCookie.getGender().isPregnant());


    }
}
