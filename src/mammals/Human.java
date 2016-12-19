package mammals;

import general.Female;
import general.Gender;
import java.util.Random;


public class Human extends Mammal {

    private boolean usesBirthControl;
    private String LastName;
    private String insertion;
    private int maxNumberOfEggs;
    private String STD;

    //constructor   
    public Human() {
        super();
    }

    public Human(Gender gender, String bodyCovering, String name, String insertion, String LastName, String color, double weight, int maxNumberOfEggs, String STD) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }

    private Human partner;

    //methods
    public void MakeLove(Human partner) {

    }



    private void marriageLove() {
    }

    public void adulteryLove(Human lover) {
        System.out.println("This is wrong");
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        if (randomInt <= 10) {
            System.out.println("WHAT ARE YOU DOING HERE (in my swamp)");
            System.out.println("I slipped onto it while being naked");
            this.setPartner(null);
            System.out.println("Your new partner is: " + this.getPartner());
            System.out.println("You're alone now fgt");

        }
        if (randomInt <= 99){
        this.STDGIVING();
        }

    }



    public void STDGIVING(){
        String[] arr = {
                "Robbie rotten virus",
                "HIV",
                "AIDS",
                "Kinderziekte",
                "Genital warts",
                "Herpes",
                "Hepatitis",
                "Chlamydia",
                "Cholera",
                "Crabs"
        };
        Random random5 = new Random();
        int STD = random5.nextInt();
        this.setSTD(arr[STD]);

    }


    public boolean marry(Human partner) {
        boolean maleIsMarried = this.isMarried();
        boolean femaleIsMarried = partner.isMarried();
        if (!maleIsMarried && !femaleIsMarried) {
            this.partner = partner;
            partner.partner = this;
            return true;
        } else {
            return false;
        }
    }

    private boolean isMarried() {
        return partner != null;
    }

    public void divorce() {
        if (this.isMarried()) {
            this.setPartner(null);
            partner.setPartner(null);
        } else {
            System.out.println("You can't divorce if they aren't married");
        }

    }



    //abstract methods
    @Override
    public void suckle() {
    }



    @Override
    public String communicate() {
        if (this.isMarried() == false) {
            String[] arr = {
                "Y u gotta be so rude don't you know I'm human too", "I am Human and I am slav", "Memes are the most important thing in life", "Bush did 9/11"};
            Random random = new Random();
            int select = random.nextInt(arr.length);
            return (name + " says:            " + arr[select]);
        } else {
            String[] arr = {
                "Sad life married life", "Why did I get married agian?", "WE NEED MORE CHEESE", "Oioi boi I am married fgt"};
            Random random = new Random();
            int select = random.nextInt(arr.length);
            return (name + " says:            " + arr[select]);

        }
    }

    public boolean isUsesBirthControl() {
        return usesBirthControl;
    }

    public String getLastName() {
        return LastName;
    }

    public String getInsertion() {
        return insertion;
    }



  public Human getPartner() {
        return partner;
    }
    public void setPartner(Human partner) {
        this.partner = partner;
    }

    public void setInsertion(String insertion) {
     this.insertion = insertion;
    }

    public void setLastName(String lastName) {
   this.LastName = lastName;
    }

    public String getSTD() {
        return STD;
    }

    public void setSTD(String STD) {
        this.STD = STD;
    }



}
