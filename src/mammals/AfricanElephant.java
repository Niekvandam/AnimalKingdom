package mammals;

import general.Gender;
import zoo.Cage;
import zoo.Zoo;

public class AfricanElephant extends Elephant {

    public AfricanElephant (Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs, int earSize){
            super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
           
}
    
    public AfricanElephant() {
     super();
    }
    

protected static int earSize;
    
 
    
    public  int getEarSize() {
        return earSize;
    }

    public void setEarSize(int earSize) {
        Elephant.earSize = earSize;
    }

    

}
    
    

