/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

/**
 *
 * @author Karinak
 */
public class Student {
    private int id; 
    private String firstName;
    private String lastname; 
    private int classID; 

    public Student(int ID, String firstName, String lastname, int classID) {
        this.id = ID;
        this.firstName = firstName;
        this.lastname = lastname;
        this.classID = classID;
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", classID=" + classID + '}';
    }
    
  
    
}
