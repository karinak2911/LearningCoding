/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supp2022v2;

/**
 *
 * @author Karinak
 */
public class Candidate {
    private String studentID; 
    private String name; 
    private int year; 

    public Candidate(String studentID, String name, int year) {
        this.studentID = studentID;
        this.name = name;
        this.year = year;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
    
    public String toString(){ 
        return name + " [" + studentID + "] year " + year;  
    }
}
