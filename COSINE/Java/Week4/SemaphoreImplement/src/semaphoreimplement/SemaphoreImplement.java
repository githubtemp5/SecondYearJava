/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphoreimplement;

import java.util.concurrent.Semaphore;

/**
 *
 * @author up826133
 */
public class SemaphoreImplement {

      public static void main(String args []) throws Exception {

          MyThread.count = 0 ;

          MyThread thread1 = new MyThread() ;
          thread1.name = "A" ;

          MyThread thread2 = new MyThread() ;
          thread2.name = "B" ;

          thread1.start() ;
          thread2.start() ;

          thread2.join() ;
          thread1.join() ;

          System.out.println("MyThread.count = " + MyThread.count) ;
      }
  }

  class MyThread extends Thread {

      volatile static int count ;

      static Semaphore mySemaphore = new Semaphore(1);

      String name ;

      public void run() {

          for(int i = 0 ; i < 10 ; i++) {
              delay() ;
              try{
                  mySemaphore.acquire();
              }
              catch(Exception e) {
              }
              // start of critical section
              int x = count ;
              System.out.println("Thread " + name + " read " + x) ;
              delay() ;
              count = x + 1 ;
              System.out.println("Thread " + name + " wrote " + (x + 1)) ;
              // end of critical section
              
              mySemaphore.release();

          }
      }

      void delay() {

          int delay = (int) (1000 * Math.random()) ;
          try {
              Thread.sleep(delay) ;
          }
          catch(Exception e) {
          }
      }
  }