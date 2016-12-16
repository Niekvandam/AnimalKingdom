package reptiles;

import general.Gender;
import java.util.Random;

public class Snake extends Reptile {

    public Snake() {
super();
    }


    @Override
    public String communicate() {
       String [] arr = {"hisssssssss", "I am a snake hiss", "*eats chicken*"};
       Random random = new Random();
       int select = random.nextInt(arr.length); 
       return (name +  "says:            " + arr[select]);
    }
    
    @Override
    public String crawl() {
    String className = this.getClass().getName();
    return("Crawl like a " + className);
    }
    
        public Snake  (Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs){
            super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
}
    }
    

