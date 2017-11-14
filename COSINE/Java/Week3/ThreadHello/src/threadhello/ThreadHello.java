
package threadhello;

/**
 *
 * @author up826133
 */
public class ThreadHello {

    public static void main(String[] args) throws Exception{
        MyThread mt1 = new MyThread();
        mt1.name = "A";
        
        MyThread mt2 = new MyThread();
        mt2.name = "B";
        
        mt1.start();
        mt2.start();
        
        mt2.join();
        mt1.join();
        
    }
    
}

class MyThread extends Thread{
    String name;
    public void run(){
        System.out.println("Hello from thread " + name);
        for(int i = 0 ; i < 10 ; i++) {
              delay() ;
              System.out.println("Hello from thread " + name) ;
          }
    }
    
    void delay(){
    int delay = (int) (1000 * Math.random()) ;
          try {
              Thread.sleep(delay) ;
          }
          catch(Exception e) {
          }
    }

}
