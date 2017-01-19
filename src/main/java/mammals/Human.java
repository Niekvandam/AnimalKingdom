package mammals;

import general.Gender;
import threads.SuckleDispatcherThread;

import java.util.Random;


public class Human extends Mammal {

    public String std;
    public boolean usesbirthcontrol;
    private String LastName;
    private String insertion;
    private int maxNumberOfEggs;
    private Human partner;
    private int getcaught = 50;
    private int stdchance = 0;


    //constructor   
    public Human() {
        super();
    }

    public Human(Gender gender, String bodyCovering, String name, String insertion, String LastName, String color, double weight, int maxNumberOfEggs, boolean usesBirthControl) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }


    //methods
    public void MakeLove() {
        System.out.println("I am making love and I am single");
        Random randomGenerator = new Random();
        int randomInt1 = randomGenerator.nextInt(100);
        if (randomInt1 <= stdchance) {
            this.setStd("Chlamydia and Cholera in one.. so basically AIDS");
        }
        this.setStdchance(getStdchance() + 5);
    }

    public void MakeLove(Human partner) {
        if (this.isUsesbirthcontrol()) {
            setStdchance(0);
        }

        if (partner == this.partner) {
            this.marriageLove(partner);
        } else if (this.partner == null && partner.partner == null) {
            this.MakeLove();
        } else if (!this.usesbirthcontrol && !partner.usesbirthcontrol) {
        this.propagate(partner);
            } else {
            this.adulteryLove(partner);
        }

        }



    public void marriageLove(Human partner) {
        System.out.println("We are married yay");

    }

    public void adulteryLove(Human lover) {
        System.out.println("This is wrong");
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        if (randomInt <= getGetcaught()) {
            System.out.println("WHAT ARE YOU DOING HERE (in my swamp)");
            System.out.println("I slipped onto it while being naked");
            this.setPartner(null);
            System.out.println("Your new partner is: " + this.getPartner());
            System.out.println("You're alone now fgt");
        }
        if (randomInt <= stdchance) {
            this.setStd("Aids");
        }
        this.setGetcaught(getGetcaught() + 5);
        this.setStdchance(getStdchance() + 5);
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
        new SuckleDispatcherThread(this).run();
        System.out.println("New suckledispatcherthread");

    }


    @Override
    public String communicate() {
        if (!this.isMarried()) {
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


    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getInsertion() {
        return insertion;
    }

    public void setInsertion(String insertion) {
        this.insertion = insertion;
    }

    public Human getPartner() {
        return partner;
    }

    public void setPartner(Human partner) {
        this.partner = partner;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public int getGetcaught() {
        return getcaught;
    }

    public void setGetcaught(int getcaught) {
        this.getcaught = getcaught;
    }

    public int getStdchance() {
        return stdchance;
    }

    public void setStdchance(int stdchance) {
        this.stdchance = stdchance;
    }

    public boolean isUsesbirthcontrol() {
        return usesbirthcontrol;
    }

    public void setUsesbirthcontrol(boolean usesbirthcontrol) {
        this.usesbirthcontrol = usesbirthcontrol;
    }
}

