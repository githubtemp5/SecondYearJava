
package hello;

/**
 *
 * @author up826133
 */
public class Hello {

    public void print(String text)
    {
        System.out.print(text);
    }
    public static void main(String[] args) {
        Hello system = new Hello();
        
        for(String temp: args)
        {
            System.out.println(temp);
        }
    }
    
}
