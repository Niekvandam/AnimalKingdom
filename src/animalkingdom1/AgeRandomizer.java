
package animalkingdom1;

import java.util.Random;

public class AgeRandomizer {
     public static int age() {
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(100);
    System.out.println(age());
    return randomInt;
}
}