/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidayPrac;

/**
 *
 * @author CLLB19
 */
public class Student {
        private String name; 
    private String surname; 
    private String idNumber; 
    private String dateOfBirth; 
    private String school; 
    private int grade; 
    
    public Student(String name, String surname, String idNumber, String dateOfBirth, String school, int grade){ 
    this.name = name; 
    this.surname = surname; 
    this.idNumber = idNumber; 
    this.dateOfBirth = dateOfBirth; 
    this.school = school; 
    this.grade = grade; 
}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSchool() {
        return school;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public String toString(){ 
        return this.name + "@" + this.surname + "@" +  this.idNumber + "@" + this.dateOfBirth + "@" + this.school + "@" + this.grade; 
    }
        

    
}
