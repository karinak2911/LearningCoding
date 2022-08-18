/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socialOutreach;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karinak
 */
public class Project {

    private String name;
    private int max;
    private Student[] sArr = new Student[50];
    private int sCount = 0;
    private Grade[] gArr = new Grade[5];

    public Project(String inN, String inC, int inM) {
        this.name = inN;
        this.max = inM;

        try {
            Scanner sc = new Scanner(new File("data\\Students.txt"));
            while (sc.hasNextLine()) {
                Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter(",");
                String name = lineSc.next();
                int grade = lineSc.nextInt();
                String interest = lineSc.next();
                double hours = Double.parseDouble(lineSc.next());

                if (interest.equalsIgnoreCase(inC) || interest.equalsIgnoreCase("both")) {
                    sArr[sCount] = new Student(name, grade, interest, hours);
                    sCount++;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String toString() {
        String out = "Name: " + this.name + "\n Maximum: " + this.max + "\n";
        for (int i = 0; i < sCount; i++) {
            out += sArr[i].toString() + "\n";
        }
        return out;

    }

    public void sort() {
        for (int currentIndex = sCount - 1; currentIndex >= 0; currentIndex--) {
            boolean sorted = true;
            for (int i = 0; i < currentIndex; i++) {
                if (sArr[i].getGrade() > sArr[i + 1].getGrade()) {
                    Student temp = sArr[i];
                    sArr[i] = sArr[i + 1];
                    sArr[i + 1] = temp;

                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
    }
    
   


    public String correctNumbers() {
        String out = "";
        if (sCount > max) {
            int noToRemove = sCount - max;
            Student[] sRemoved = new Student[noToRemove];
            for (int i = 0; i < noToRemove; i++) {
               int item =(int) (Math.random() * sCount); sRemoved[i] = sArr[i];
                this.shiftLeft(item);
            }
            out += "Student removed: \n";
            for (int i = 0; i < sRemoved.length; i++) {
                out += sRemoved[i].toString() + "\n";
            }
            out += "\n\n Remaining students: \n" + this.toString();

        }
        return out;

    }

    public String createGradeArray(String inH) {
        int gSize = 0;
        Scanner sc = new Scanner(inH).useDelimiter(";");
        while (sc.hasNext()) {
            int grade = sc.nextInt();
            double hours = sc.nextDouble();
            gArr[gSize] = new Grade(grade, hours);
            gSize++;
        }

        String out = "Grade Totals: \n";
        for (int i = 0; i < gSize; i++) {
            out += gArr[i].toString() + "\n";
        }
        return out;
    }

    
    public void shiftLeft(int index) {
        for (int i = index; i < sCount; i++) {
            sArr[i] = sArr[i + 1];
        }
        sCount--;
    } 
}
