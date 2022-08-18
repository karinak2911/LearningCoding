/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2019;

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
     public String alterName(){ 
         char intial = fullName.charAt(0);
         String surname = ""; 
         Scanner sc = new Scanner(fullName).useDelimiter(" ");
         while(sc.hasNext()){ 
             String firstName = sc.next(); 
             surname = sc.next(); 
         }
         return surname + ", " + intial; 
     }

    @Override
    public String toString() {
        return this.alterName() + "\t" + this.grade + "\t" + this.interest + "\t" + this.hours;
    }
     
     
    
}
