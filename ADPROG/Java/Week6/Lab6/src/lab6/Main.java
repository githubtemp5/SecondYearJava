package lab6;

/**
 *
 * @author UP826133
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Triangle t1 = new Triangle(2, 4, 5);
      RightAngledTriangle r1 = new RightAngledTriangle(3, 4);
      EquiTriangle e1 = new EquiTriangle(2);
      
        System.out.println("Triangle: ");
        t1.printInfo();
        System.out.println("Righty: ");
        r1.printInfo();
        System.out.println("Equi: ");
        e1.printInfo();
    }
    
}
