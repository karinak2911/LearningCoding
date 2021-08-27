/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidayPrac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class RegistrationManager {
  
    private String logFilePath;

    public RegistrationManager(String logFilePath) {

        this.logFilePath = logFilePath;
 
    }

    public void addStudent() {
        String name = JOptionPane.showInputDialog("Enter your first name");
        String surname = JOptionPane.showInputDialog("Enter your last name");
        String idNumber = JOptionPane.showInputDialog("Enter your ID number");
        String dateOfBirth = JOptionPane.showInputDialog("Enter your date of birth in the format DD/MM/YYYY");
        String school = JOptionPane.showInputDialog("Enter your school");
        int grade = Integer.parseInt(JOptionPane.showInputDialog("Enter your grade"));

        Student s = new Student(name, surname, idNumber, dateOfBirth, school, grade);

        this.logStudent(s);
       

    }

    private void logStudent(Student st) {
        try {
            FileWriter fw = new FileWriter(logFilePath, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.append(st.toString() + "/n");
            pw.close();
        } catch (IOException e) {
            System.out.println("An input output exception has occured");
            System.out.println(e.toString());
        }

    }

    public void viewStudents() {
        File f = new File(this.logFilePath);
        try {

            Scanner fileScanner = new Scanner(f);
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("@");
                String name = lineScanner.next();
                String surname = lineScanner.next();
                String idNumber = lineScanner.next();
                String dateOfBirth = lineScanner.next();
                String school = lineScanner.next();
                int grade = lineScanner.nextInt();

                Student s = new Student(name, surname, idNumber, dateOfBirth, school, grade);
                System.out.println("The name of the student is " + s.getName());
                System.out.println("The last name of the student is " + s.getSurname());
                System.out.println("The ID Number of the student is " + s.getIdNumber());
                System.out.println("The date of birth of the student is " + s.getDateOfBirth());
                System.out.println("The school the student goes to is " + s.getSchool());
                System.out.println("The grade of the student is " + s.getGrade());

                lineScanner.close();

            }
            fileScanner.close();
        } catch (FileNotFoundException n) {
            System.out.println("A file not found error has occured");
            System.out.println(n.toString());
        }
    } 
} 

    
 
