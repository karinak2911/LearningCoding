/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Karinak
 */
public class Project {
    private String name; 
    private int max; 
    private Student[] sArr = new Student[50]; 
    private int sCount; 
    private Grade[] gARr = new Grade[5]; 
  

    public Project(String inN, String inC, int inM) throws FileNotFoundException {
        this.name = inN; 
        this.max = inM; 
        Scanner sc = new Scanner(new File("data\\Students.txt")); 
        while(sc.hasNextLine()){ 
            Scanner scLine = new Scanner(sc.nextLine()).useDelimiter(",").useLocale(Locale.ENGLISH); 
        String fullName = scLine.next(); 
        int grade = scLine.nextInt(); 
        String interest = scLine.next(); 
        double hours = scLine.nextDouble(); 
       
           // System.out.println("shoot man");
        
        if(interest.equalsIgnoreCase(inC) || interest.equalsIgnoreCase("Both")){
            sArr[sCount] = new Student(fullName, grade, interest, hours); 
            sCount++; 
        }
            
    }
    }
    

    
    public void sort(){ 
        for(int currentIndex = sCount - 1; currentIndex >= 0; currentIndex--){ 
            boolean sorted = true; 
            for(int i = 0; i < currentIndex; i++){ 
                if(sArr[i].getGrade() > sArr[i+1].getGrade()){ 
                    Student temp = sArr[i]; 
                    sArr[i] = sArr[i+1]; 
                    sArr[i+1] = temp;
                    sorted = false; 
                }
               
            } if(sorted)
                    break; 
        }
    }
    
    public String correctNumbers(){ 
        String out = "Removed students: \n\n";
        int numToRemove = sCount - max; 
        System.out.println(numToRemove);
              
        for(int i = 0; i < numToRemove; i++){ 
          int randInt = (int) (Math.random() * (sCount - 1)); 
            System.out.println(randInt);
            out += sArr[randInt].toString() + "\n"; 
          this.shiftLeft(randInt);
        }
        
        out += "\n\nRemaining students: \n\n" + this.toString(); 
        return out; 
    }
    
    private void shiftLeft(int index){ 
      
        for (int i = index; i < sCount; i++) {
            sArr[i] = sArr[i + 1];
        }
        sCount--;

    }
    
    
        public String toString(){ 
       String out = "Name: \t" + this.name + "Maximum: \t" + this.max + "\n\n"; 
        
       for(int i = 0; i < sCount; i++){ 
           out+= sArr[i].toString() + "\n"; 
       }
       
       return out; 
    }
        
        public String createGradeArray(String inH){
            String out = "Grade Totals: \n"; 
            Scanner sc = new Scanner(inH).useDelimiter(";"); 
             int gradeCount = 0; 
            for(int i = 0; i < 5; i++){ 
                int grade = sc.nextInt(); 
                double total = sc.nextDouble(); 
                gARr[gradeCount] = new Grade(grade, total);  
                out+= gARr[gradeCount].toString() + "\n"; 
                gradeCount++;  
              
            }
            return out; 
        }
    
}
