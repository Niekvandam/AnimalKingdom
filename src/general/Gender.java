package general;
import general.Animal;
import java.util.ArrayList;

public abstract class Gender { 
        
         //Constructor
         public Gender(){
         
      }
      
         
          //Methods
          private Animal genderOwner;

           public abstract boolean isPregnant();
          
         public abstract void propagate (Animal parent1, Animal parent2 );
    
         public abstract ArrayList<Egg> giveBirth();     

         public abstract boolean isFemale();
        
      
    
         
         //Setters and getters
         public void setGenderOwner(Animal owner){
         this.genderOwner = owner;
         }

    public Animal getGenderOwner() {
        return genderOwner;
    }
 

    
    
}
