/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.util.Scanner;

/**
 *
 * @author up826133
 */
public class Server extends UnicastRemoteObject implements MyRemoteInterface {

    public void printMessage(String message) throws RemoteException {
        System.out.println(message);
    }

    public static void main(String args[]) throws Exception {
        ServerCode s = new ServerCode(1234);
        Client c = new Client(1234);
        
        s.start();
        c.start();
        c.join();
        s.join();
    }

    public Server() throws RemoteException {
    }
}

class ServerCode extends Thread {

    private int port;

    public ServerCode(int _port) {
        port = _port;
    }

    public void run() {
        try {
            Server server = new Server();

            Registry reg = LocateRegistry.createRegistry(port);
            reg.bind("source", server);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Client extends Thread {
private int port;
    public Client(int _port){
        port = _port;
}
    public void run() {
        try {
            Scanner myScanner = new Scanner(System.in);
            Registry reg = LocateRegistry.getRegistry("148.197.209.230", port);

            MyRemoteInterface handle
                    = (MyRemoteInterface) reg.lookup("source");
            while (true) {
                System.out.println("Enter text: ");
                handle.printMessage(myScanner.nextLine());
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

interface MyRemoteInterface extends Remote {

    void printMessage(String message) throws RemoteException;
}
