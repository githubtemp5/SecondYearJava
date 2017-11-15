package longpipes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author up826133
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
      
        print("Enter the length of the pipes in metres: ");
        double length = myScanner.nextDouble();
        print("Enter the diameter in inches: ");
        double diameter = myScanner.nextDouble();
        print("Enter the grade: ");
        int grade = myScanner.nextInt();
        print("Colour [0], [1], [2]");
        int colour = myScanner.nextInt();
        print("Insulation: Y/N ");
        String insul = myScanner.nextLine();
        print("Outer Reinforcement: Y/N");
        String outerInforce = myScanner.nextLine();
        print("Chemical Resistance: Y/N");
        String chemRes = myScanner.nextLine();
        print("Quanity of Pipe: ");
        int quantity = myScanner.nextInt();
        
        ArrayList<Pipe> pipes= new ArrayList<Pipe>();
        
        //Deciding pipe type
        
        if(colour==0&& grade>=1 && grade <=3&& insul.equals("N")&& outerInforce.equals("N")){
        //Pipe1
        
        pipes.add(new Pipe1(length, diameter, grade, chemRes, quantity));
        }
        if(colour ==1 && grade >=2 && grade <=4 && insul.equals("N")&& outerInforce.equals("N")){
        //Pipe2
        pipes.add(new Pipe1(length, diameter, grade, chemRes, quantity));
        }
        if(colour ==2 && grade >=2 && grade <=5 && insul.equals("N")&& outerInforce.equals("N")){
        //Pipe3
        pipes.add(new Pipe1(length, diameter, grade, chemRes, quantity));
        }
        if(colour ==2 && grade >=2 && grade <=5 && insul.equals("Y")&& outerInforce.equals("N")){
        //Pipe4
        pipes.add(new Pipe1(length, diameter, grade, chemRes, quantity));
        }
        if(colour ==2 && grade >=3 && grade <=5 && insul.equals("Y")&& outerInforce.equals("Y")){
        //Pipe5
        pipes.add(new Pipe1(length, diameter, grade, chemRes, quantity));
        }
        else{
            System.out.println("Invalid Pipe Type");
        }
        
    }

    
    public static void print(String text){
        System.out.println(text);
    }

    
}

