/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

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
        if (args[0].equals("setting1")) {

            Student stud1 = new Student("Richard Parker", "824566", new int[]{80, 70, 40});
            Student stud2 = new Student("Timmy Smith", "827999", new int[]{90, 60, 90});

            stud1.printOut();
            stud2.printOut();

            Student stud3 = new Student();
            stud3.setId("856888");
            stud3.setName("Rose Smith");
            stud3.setScore(0, 60);
            stud3.setScore(1, 90);
            stud3.setScore(2, 50);

            stud3.printOut();

            //sets the first student as the highest scorer unless the second and the third student has a average score above the first one.
            Student highestScorer = stud1;
            if (stud2.avScore() > highestScorer.avScore()) {
                highestScorer = stud2;
            }

            if (stud3.avScore() > highestScorer.avScore()) {
                highestScorer = stud3;
            }

            print("Highest Scorer: ");
            highestScorer.printOut();
        }

        //week 3 practical
        if (args[0].equals("setting2")) {

            Course course1 = new Course("Computer Science");
            Course course2 = new Course("Computing");
            Course course3 = new Course("Software Enginnering");

            Student stud1 = new Student("Richard Parker", "824566", new int[]{80, 70, 410});
            Student stud2 = new Student("Timmy Smith", "812345", new int[]{90, 60, 90});
            Student stud3 = new Student("Thomas Rich", "812346", new int[]{80, 70, 40});
            Student stud4 = new Student("Random Name", "812347", new int[]{80, 70, 40});
            Student stud5 = new Student("Amelia Parker", "812348", new int[]{80, 70, 40});
            Student stud6 = new Student("John Smith", "812349", new int[]{80, 70, 40});
            Student stud7 = new Student("Johny Smith", "812350", new int[]{80, 70, 40});
            Student stud8 = new Student("Edward Green", "812351", new int[]{80, 70, 40});
            Student stud9 = new Student("Richard Blue", "812352", new int[]{80, 70, 40});
            Student stud10 = new Student("Ellie Baker", "812353", new int[]{80, 70, 40});

            course1.addStudent(stud1);
            course1.addStudent(stud2);
            course1.addStudent(stud3);
            course2.addStudent(stud4);
            course2.addStudent(stud5);
            course2.addStudent(stud6);
            course3.addStudent(stud7);
            course3.addStudent(stud8);
            course3.addStudent(stud9);
            course3.addStudent(stud10);

            //changing courses demo
            course3.changeCourse(course1, stud9);

            course1.printCourseInfo();
            course2.printCourseInfo();
            course3.printCourseInfo();

        }

        if (args[0].equals("setting3")) {
            Scanner myScanner = new Scanner(System.in);
            ArrayList<Student> students = new ArrayList<Student>();
            Course cm = new Course("Computing");
            Course cs = new Course("Computer Science");

            String answer = "";
            do {
                String name;
                String id;
                int[] score = new int[3];

                print("Please enter student details: ");
                print("Enter the name: ");
                name = myScanner.nextLine();
                print("Enter the student id: ");
                id = myScanner.nextLine();
                boolean exception;
                do {
                    exception = false;
                    try {
                        print("Enter the three marks separated by spaces: ");
                        for (int i = 0; i < 3; i++) {
                            score[i] = myScanner.nextInt();
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                        System.out.println("Marks should be in numberals!");
                        exception = true;
                    }
                } while (exception);

                students.add(new Student(name, id, score));

                print("Last Added: " + students.get(0).getName());
                print("Do you want to add another student?");

                do {    // Fixing a problem with the Scanner taking an empty character fromthe previous readLine.
                    answer = myScanner.nextLine();
                } while (answer.equals(""));

            } while (answer.equalsIgnoreCase("y"));

            int tempCounter = 0;
            for (Student temp : students) {
                if (tempCounter == 0) {
                    tempCounter = 1;
                    cm.addStudent(temp);
                } else {
                    tempCounter = 0;
                    cs.addStudent(temp);

                }

            }

            cs.printCourseInfo();
            cs.printCourseInfo();

        }
        if(args[0].equals("setting4")){
            DatabaseConnection db = new DatabaseConnection();
        }
    }

    public static void print(String text) {
        System.out.println(text);
    }

}
