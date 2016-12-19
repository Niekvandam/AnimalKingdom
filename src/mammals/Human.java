package mammals;

import general.Female;
import general.Gender;
import java.util.Random;


public class Human extends Mammal {

    private boolean usesBirthControl;
    public String LastName;
    public String insertion;
    public int maxNumberOfEggs;
 

    //constructor   
    public Human() {
        super();
    }

    public Human(Gender gender, String bodyCovering, String name, String insertion, String LastName, String color, double weight, int maxNumberOfEggs) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }

    private Human partner;

    //methods
    public void MakeLove(Human partner) {
                System.out.println("AWWW YEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
          
    }



    private void marriageLove() {
    }

    private void adulteryLove(Human lover) {
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

    public boolean isMarried() {
        return partner != null;
    }

    public void divorce() {
        if (this.isMarried() == true) {
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

    
}
