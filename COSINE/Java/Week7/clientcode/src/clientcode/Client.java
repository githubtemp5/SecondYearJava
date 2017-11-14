/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientcode;

import java.rmi.registry.*;
import java.rmi.*;
import java.util.Scanner;

  public class Client {
      
      public static void main(String [] args) throws Exception {
          Scanner myScanner = new Scanner(System.in);
          Registry reg = LocateRegistry.getRegistry("148.197.145.165", 1234) ;
         
          MyRemoteInterface handle =
                  (MyRemoteInterface) reg.lookup("clientcode");
          while(true){
          handle.printMessage(myScanner.nextLine());
         }
      }
  }
interface MyRemoteInterface extends Remote {
      void printMessage(String message) throws RemoteException ;
  }