/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author CLLB19
 */
public class registrationDetails {

    public static void nextRecord() {

        String name = JOptionPane.showInputDialog("Enter your first name");
        String lastName = JOptionPane.showInputDialog("Enter your last name");
        String idNumber = JOptionPane.showInputDialog("Enter your ID number");
        String dateOfBirth = JOptionPane.showInputDialog("Enter your date of birth in the format DD/MM/YYYY");
        String school = JOptionPane.showInputDialog("Enter your school");
        int grade = Integer.parseInt(JOptionPane.showInputDialog("Enter your grade"));

        String details = name + "#" + lastName + "%" + idNumber + "%" + dateOfBirth + "%" + school + "%" + grade;

        try {
            PrintWriter infoFile = new PrintWriter(new FileWriter("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Information.txt", true));
            infoFile.println(details);
            infoFile.close();
        } catch (IOException e) {
            System.out.println("An input output exception has occured");
            System.out.println(e.toString());
        }

    }

    /**
     *
     * @throws FileNotFoundException
     */
    public static void getRecord() {
        try {
            Scanner file = new Scanner(new File("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Information.txt"));

            while (file.hasNextLine()) {
                String line = file.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("%");

                String names = lineScanner.next();
                Scanner namesScanner = new Scanner(names);
                namesScanner.useDelimiter("#");
                String name = namesScanner.next();
                String lastName = namesScanner.next();

                String idNumber = lineScanner.next();
                String dateOfBirth = lineScanner.next();
                String school = lineScanner.next();
                int grade = lineScanner.nextInt();

                System.out.println("The name of the student is " + name);
                System.out.println("The last name of the student is " + lastName);
                System.out.println("The ID Number of the student is " + idNumber);
                System.out.println("The date of birth of the student is " + dateOfBirth);
                System.out.println("The school the student goes to is " + school);
                System.out.println("The grade of the student is " + grade);

                System.out.println("");
            }
        } catch (FileNotFoundException n) {
            System.out.println("A file not found error has occured");
            System.out.println(n.toString());
        }

    }

    public static void main(String[] args) throws IOException {
        nextRecord();
        getRecord();
    }

}
