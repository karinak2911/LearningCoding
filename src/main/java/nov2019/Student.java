/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nov2019;

import java.util.Scanner;

/**
 *
 * @author Karinak
 */
public class Student {

    private String fullName;
    private int grade;
    private String interest;
    private double hours;

    public Student(String fullName, int grade, String interest, double hours) {
        this.fullName = fullName;
        this.grade = grade;
        this.interest = interest;
        this.hours = hours;
    }

    public int getGrade() {
        return grade;
    }

    public String getInterest() {
        return interest;
    }

    public double getHours() {
        return hours;
    }

    private String alterName() {
        String out = "";
        Scanner sc = new Scanner(fullName).useDelimiter(" ");

        String f = sc.next();
        String s = sc.next();

        return s + ", " + f.charAt(0);

    }
    
    public String toString(){ 
        return this.alterName() + "\t" + grade + "\t" + interest + "\t" + hours; 
    }

}
