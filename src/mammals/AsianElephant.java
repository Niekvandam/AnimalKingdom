package mammals;

import general.Gender;
import zoo.Cage;
import zoo.Zoo;

public class AsianElephant extends Elephant {

    public AsianElephant (Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs, int earSize){
            super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
           
}
    

protected static int earSize;
    
 
    
    public  int getEarSize() {
        return earSize;
    }

    public void setEarSize(int earSize) {
        Elephant.earSize = earSize;
    }

    public AsianElephant() {
     super();
    }

}
    
    

