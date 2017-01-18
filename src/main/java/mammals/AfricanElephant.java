package mammals;

import general.Gender;

public class AfricanElephant extends Elephant {

    protected static int earSize;

    public AfricanElephant(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs, int earSize) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);

    }


    public AfricanElephant() {
        super();
    }

    public int getEarSize() {
        return earSize;
    }

    public void setEarSize(int earSize) {
        Elephant.earSize = earSize;
    }


}
    
    

