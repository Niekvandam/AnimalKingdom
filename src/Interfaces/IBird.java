package Interfaces;
import general.Egg;
import java.util.ArrayList;
public interface IBird extends IEggLayer {
    
    public abstract String fly();
    public void hatchEggs(ArrayList<Egg> layedEggs);
    
  
    
}
