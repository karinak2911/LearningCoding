/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socialOutreach;

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
    
    private String alterName(){ 
        String out = ""; 
        Scanner sc = new Scanner(fullName).useDelimiter(" ");
        String firstName = sc.next(); 
        String lastName = sc.next(); 
        out = lastName + ", " + firstName.charAt(0); 
        
        return out;
    }
    
    public String toString(){ 
        return this.alterName() + "\t" + this.grade + "\t" + this.interest + "\t" + this.hours;  
    }
}
