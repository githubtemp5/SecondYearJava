/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author up826133
 */
public class Student {

    private String name;
    private String id;
    private int[] score;
    private Scanner myScanner;

    //default constructor
    public Student() {
        
    }

    public Student(String _name, String _id, int[] _score) {
        myScanner = new Scanner(System.in);   
        name = _name;
        id = _id;
        score = this.validateScore(_score);
    }

    private int[] validateScore(int[] _score) {
        for (int i = 0; i < 3; i++) {
            while (_score[i] < 0 || _score[i] > 100){
                System.out.println("Invalid Score " + _score[i] + " at index: " + i);
                System.out.println("Enter a score between 0 and 100: ");

                int tempScore = myScanner.nextInt();
                _score[i] = tempScore;

            } 
        }
        return _score;
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return "course";
    }

    public void setId(String _id) {
        id = _id;
    }

    public String getId() {
        return id;
    }

    public int[] getScores() {
        return score;
    }

    public void setScore(int pos, int _value) {
        score[pos] = _value;
    }

    public double avScore() {
        double average = (score[0] + score[1] + score[2]) / 3;
        return average;
    }

    public void printOut() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student Average Score: " + avScore());
        System.out.println("Score 1: " + score[0]);
        System.out.println("Score 2: " + score[1]);
        System.out.println("Score 3: " + score[2]);
    }

}
