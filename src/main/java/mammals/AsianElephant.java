package mammals;

import general.Gender;

public class AsianElephant extends Elephant {

    protected static int earSize;


    public AsianElephant(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs, int earSize) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);

    }


    public AsianElephant() {
        super();
    }

    public int getEarSize() {
        return earSize;
    }

    public void setEarSize(int earSize) {
        Elephant.earSize = earSize;
    }

}
    
    

