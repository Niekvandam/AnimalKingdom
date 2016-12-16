package animalkingdom1;

import birds.Parrot;
import birds.Pinguin;
import general.Egg;
import general.Female;
import general.Male;
import java.util.ArrayList;
import java.util.TreeSet;
import mammals.AfricanElephant;
import mammals.AsianElephant;
import mammals.Elephant;
import mammals.GrayMouse;
import mammals.WhiteMouse;
import mammals.Human;
import reptiles.Crocodile;
import reptiles.Snake;
import reptiles.Snek;
import special.Platypus;
import zoo.Cage;
import zoo.Zoo;

public class AnimalKingdom1 {

    public static void main(String[] args) throws InterruptedException {

//        //parrot
        Parrot p = new Parrot(new Female(), "Feathers", "Johan IV", "Blue", 0.18, 5);
//
//        
//        //pinguin
//        Pinguin pingu = new Pinguin(new Male(), "Fur", "Klaus XVI", "Black and Gray", 0.5, 8);
//
//        //AfricanElephant
        AfricanElephant Jan = new AfricanElephant(new Male(), "Skin", "Archibald gerard", "Gray", 800, 2, 3);
//
//        //AsianElephant
        AsianElephant Ping = new AsianElephant(new Male(), "Skin", "Bronto Johan Kaasvis", "Gray", 800, 2, 3);
//
//        //Elephant
        Elephant Elephant = new Elephant(new Male(), "Skin,", "Pweet pweet", "Gray", 900, 2);
//
//        //GrayMouse
        GrayMouse Piep = new GrayMouse(new Male(), "Hair", "Samuel L Jackson", "Gray", 0.2, 5);
//
//        //WhiteMouse
        WhiteMouse Ed = new WhiteMouse(new Male(), "Hair", "Samuel L Jackson's white brother", "White", 0.2, 5);
//
//        //Human]
        Human GiantCookie = new Human(new Female(), "Skin and Hair", "Homo", "de la", "Erectus", "brown", 42.0, 3);
//
        Human PizzaMan = new Human(new Male(), "Skin and Hair", "Homo", "de", "Erectus", "brown", 42.0, 3);
        Human Homosapien = new Human(new Male(), "Skin and Hair", "Homo", "een", "Erectus", "brown", 42.0, 3);
        Human Hughmungus = new Human(new Male(), "Skin and Hair", "Ivan", "teh", "Slav", "Adidas", 80.1, 3);
//
//        //Crocodile
//        Crocodile Croc = new Crocodile(new Male(), "Scales", "Archibald Krok", "Green", 200, 9);
//
//        //Snake         
        Snake snake = new Snake(new Male(), "Scales", "Rick", "Black", 3, 10);
//
//        //Snek (Class just for fun)        
//    Snek Snek = new Snek(new Male(), "Dank memes", "Snek the snek", "Memes", 69, 69);
//       Snek Snek1 = new Snek(new Female(), "Dank memes", "Snek the snek", "Memes", 69, 69);
//
//        //Perry
//        Platypus Perry = new Platypus(new Male(), "Fur", "Perry", "Blue", 5, 5);
//

        //Animal test methods
        //Propagate test animals
//        Snake an1 = new Snake(new Male(), "Scales", "PropagateTestAnimal1", "Brown and black", 5, 9);
//        Snake an2 = new Snake(new Female(), "Scales", "PropagateTestAnimal2", "Brown and black", 5, 9);
//        System.out.println(an1.Propagate(an2));
        //Marry test animals
        //    Homosapien.marry(Hughmungus);
//        System.out.println(Homosapien1.getPartner());
        Egg e = new Egg();
        p.layEggs();

//GiantCookie.MakeLove(PizzaMan);
    }

}
