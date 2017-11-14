
package helloworldapp;
import java.util.Random;
/**
 *
 * @author up826133
 */
public class randInt {
    private Random rGen = new Random();
   public void generateRandInt()
   {
       int i = rGen.nextInt(5000);
       System.out.println(i); 
   }
   
   public void printStuff(String text)
   {
       System.out.println(text);
   }
   public static void main(String[] args) throws Exception
   {
       randInt r = new randInt();
       r.generateRandInt();
       Thread.sleep(5000);
       r.printStuff("You have been delayed.");
   }
}
