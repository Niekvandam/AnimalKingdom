package niek.animalkingdom.com.scalda.javales.controllers;

import niek.animalkingdom.SpringHelper;
import niek.animalkingdom.birds.Parrot;
import niek.animalkingdom.birds.Pinguin;
import niek.animalkingdom.general.Animal;
import niek.animalkingdom.general.Female;
import niek.animalkingdom.general.Male;
import niek.animalkingdom.mammals.*;
import niek.animalkingdom.reptiles.Crocodile;
import niek.animalkingdom.reptiles.Snake;
import niek.animalkingdom.special.Platypus;
import niek.animalkingdom.zoo.Zoo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


@Controller
public class TestController {
    private Human Human01;
    private Human Human02;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String animals(ModelMap map) {
        map.put("Animals", Zoo.getInstance().getAllAnimals());
        map.put("h", Human.class);


        return "test";
    }

    @RequestMapping(value = "/overview", method = RequestMethod.GET)
    public String allAnimalsbyrace(Map<String, Object> model,
                                   @RequestParam(value = "race", required = false, defaultValue = "") String race) throws ClassNotFoundException {
        if (race.equals("")) {
            model.put("Animal", Zoo.getInstance().getAllAnimals());

        } else {
            model.put("Animal", Zoo.getInstance().getCageByRace1(race).getCagedAnimals());
        }


        return "overview";

    }

    @RequestMapping(value = "/cageoverview", method = RequestMethod.GET)
    public String allCages(ModelMap map) {


        map.put("Cage", Zoo.getInstance().getCages());


        return "cageoverview";
    }


    @RequestMapping(value = "/animalsNoHuman", method = RequestMethod.GET)
    public String animalsNoHuman1(ModelMap map) {

        Set<Animal> animalsNoHuman;
        animalsNoHuman = Zoo.getInstance().getAllAnimals();
        ArrayList<Human> allhumans = new ArrayList();

        for (Animal a : animalsNoHuman) {
            if (a instanceof Human) {
                allhumans.add((Human) a);
            }

        }
        animalsNoHuman.removeAll(allhumans);
        map.put("Animalnh", animalsNoHuman);
        return "animalsNoHuman";
    }

    @RequestMapping(value = "/humans", method = RequestMethod.GET)
    public String humans(ModelMap map) {


        ArrayList<Animal> human = Zoo.getInstance().getCageByRace1("Human").getCagedAnimals();
        ArrayList<Human> humans = new ArrayList(human);

        map.put("Human", humans);


        return "humans";

    }

    @RequestMapping(value = "/addanimal", method = RequestMethod.GET)
    public String addAnimal() {
        return "addanimal";
    }

    @RequestMapping(value = "/addanimal",
            method = RequestMethod.POST)
    ModelAndView addAnimal(HttpServletRequest request) throws IOException {

        ModelAndView m = new ModelAndView();
        String race = request.getParameter("Race");
        String maxNumberOfEggs = request.getParameter("MaxNumberOfEggs");
        String weight = request.getParameter("Weight");
        String color = request.getParameter("Color");
        String bodyCovering = request.getParameter("BodyCovering");
        String name = request.getParameter("FirstName");
        String gender = request.getParameter("Gender");
        double weight1 = Integer.parseInt(weight);
        int maxNumberOfEggs1 = Integer.parseInt(maxNumberOfEggs);


        switch (race) {
            case "Human":
                String insertion = request.getParameter("Insertion");
                String lastName = request.getParameter("LastName");
                if (gender.equals("Male")) {
                    Human h = new Human(new Male(), bodyCovering, name, insertion, lastName, color, weight1, maxNumberOfEggs1, false);
                    m.addObject(h);
                } else {
                    Human h = new Human(new Female(), bodyCovering, name, insertion, lastName, color, weight1, maxNumberOfEggs1, false);
                    m.addObject(h);
                }
                break;
            case "White Mouse":
                if (gender.equals("Male")) {
                    WhiteMouse h = new WhiteMouse(new Male(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                } else {
                    WhiteMouse h = new WhiteMouse(new Female(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                }
                break;
            case "Gray Mouse":
                if (gender.equals("Male")) {
                    GrayMouse h = new GrayMouse(new Male(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                } else {
                    GrayMouse h = new GrayMouse(new Female(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                }
                break;
            case "Asian Elephant":
                String earSize = request.getParameter("EarSize");
                int earSize1 = Integer.parseInt(earSize);
                if (gender.equals("Male")) {
                    AsianElephant h = new AsianElephant(new Male(), bodyCovering, name, color, weight1, maxNumberOfEggs1, earSize1);
                    m.addObject(h);
                } else {
                    AsianElephant h = new AsianElephant(new Female(), bodyCovering, name, color, weight1, maxNumberOfEggs1, earSize1);
                    m.addObject(h);
                }
            case "African Elephant":
                earSize = request.getParameter("EarSize");
                earSize1 = Integer.parseInt(earSize);
                if (gender.equals("Male")) {
                    AfricanElephant h = new AfricanElephant(new Male(), bodyCovering, name, color, weight1, maxNumberOfEggs1, earSize1);
                    m.addObject(h);
                } else {
                    AfricanElephant h = new AfricanElephant(new Female(), bodyCovering, name, color, weight1, maxNumberOfEggs1, earSize1);
                    m.addObject(h);
                }
                break;
            case "Parrot":
                if (gender.equals("Male")) {
                    Parrot h = new Parrot(new Male(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                } else {
                    Parrot h = new Parrot(new Female(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                }
                break;
            case "Pinguin":
                if (gender.equals("Male")) {
                    Pinguin h = new Pinguin(new Male(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                } else {
                    WhiteMouse h = new WhiteMouse(new Female(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                }
                break;
            case "Snake":
                if (gender.equals("Male")) {
                    Snake h = new Snake(new Male(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                } else {
                    Snake h = new Snake(new Female(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                }
                break;
            case "Crocodile":
                if (gender.equals("Male")) {
                    Crocodile h = new Crocodile(new Male(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                } else {
                    Crocodile h = new Crocodile(new Female(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                }
                break;
            case "Platypus":
                if (gender.equals("Male")) {
                    Platypus h = new Platypus(new Male(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                } else {
                    Platypus h = new Platypus(new Female(), bodyCovering, name, color, weight1, maxNumberOfEggs1);
                    m.addObject(h);
                }
                break;
        }

        return m;
    }

    @RequestMapping(value = "/marry", method = RequestMethod.GET)
    public String marry(ModelMap map) {

        ArrayList<Animal> human = Zoo.getInstance().getCageByRace1("Human").getCagedAnimals();
        ArrayList<Human> humans = new ArrayList(human);

        map.put("Human", humans);

        return "marry";
    }


    @RequestMapping(value = "/marry",

            method = RequestMethod.POST)

    public
    @ResponseBody
    boolean marryPost(HttpServletRequest request) throws IOException {

        String ajaxString = SpringHelper.getAjaxStringFromRequest(request);

        String maleUUID = SpringHelper.getParameterFromAjaxString(ajaxString, "maleUUID");

        String femaleUUID = SpringHelper.getParameterFromAjaxString(ajaxString, "femaleUUID");

        Human male = (Human) Zoo.getInstance().getAnimalByUUID(UUID.fromString(maleUUID));

        Human female = (Human) Zoo.getInstance().getAnimalByUUID(UUID.fromString(femaleUUID));

        male.marry(female);

        return male.isMarried();

    }

}


