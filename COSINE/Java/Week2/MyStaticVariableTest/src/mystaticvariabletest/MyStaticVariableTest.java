
package mystaticvariabletest;

/**
 *
 * @author up826133
 */
public class MyStaticVariableTest {

    /**
     * @param args the command line arguments
     */
     public static void main(String args []) {
         

          MyOtherClass object1 = new MyOtherClass() ;
          object1.changeA(42);
          object1.setB("My other value");
          
          MyOtherClass object2 = new MyOtherClass() ;
          object2.changeA(23);

          System.out.println("Fields of object1:") ;
          object1.printMyFields() ;

          System.out.println("Fields of object2:") ;
          object2.printMyFields() ;
      }
    
}

class MyOtherClass {
      int a ;
      static String b ;

      void printMyFields() {

          System.out.println("Field a is: " + a) ;
          System.out.println("Field b is: " + b) ;
      }
      
      public void changeA(int temp)
      {
          a = temp;
      }
      
      public void setB(String temp)
      {
          b = temp;
      }
  }