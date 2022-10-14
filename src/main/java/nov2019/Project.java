/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nov2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

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

    public Project(String inN, String inC, int inM) throws FileNotFoundException {
        this.name = inN;
        this.max = inM;
        Scanner sc = new Scanner(new File("data\\Students.txt"));
        while (sc.hasNextLine()) {
            Scanner line = new Scanner(sc.nextLine()).useDelimiter(",").useLocale(Locale.US);
            String n = line.next();
            int g = line.nextInt();
            String i = line.next();
            double h = line.nextDouble();

            Student s = new Student(n, g, i, h);

            if (i.equalsIgnoreCase(inC) || i.equalsIgnoreCase("Both")) {
                sArr[sCount] = s;
                sCount++;
            }

        }
    }
    
    public String toString(){ 
        String out = "Name:\t" + name + "\tMaximum:\t" + max + "\n\n";
        for(int i = 0; i < sCount; i++){ 
            out += sArr[i].toString() + "\n"; 
        }
        return out; 
    }
    
    public void sort(){ 
        for(int ci = sCount -1; ci>= 0; ci--){ 
            boolean sorted = true; 
            for(int i = 0; i  < ci; i++){ 
            if(sArr[i].getGrade() > sArr[i + 1].getGrade()){ 
                Student temp = sArr[i]; 
                sArr[i] = sArr[i + 1]; 
                sArr[i+1] = temp; 
                sorted = false; 
            }
        }
            
            if(sorted)
                break; 
        }
    }
    
    public String correctNumbers(){
        String out = ""; 
        
        String rem = "Students removed: \n"; 
        int numToRemove = sCount - max;
        
        for(int i = 0; i < numToRemove; i++){ 
            int rand = (int) (Math.random() * max);  
            rem += sArr[rand].toString() + "\n";
            this.shiftleft(rand);
        }
        
        String kept = this.toString(); 
        out = rem + "\n\n" +  kept; 
        return out; 
    }
    
    private void shiftleft(int pos){ 
        for(int i = pos; i < sCount; i++){ 
            sArr[i] = sArr[i+1]; 
          
        }  sCount --; 
    }

    
     public String createGradearray(String inH){ 
        String out = "Grade Totals: \n"; 
        Scanner sc = new Scanner(inH).useDelimiter(";"); 
        int gCount = 0; 
        while(sc.hasNext()){ 
         int g = sc.nextInt(); 
         double h = sc.nextDouble(); 
         
         gArr[gCount] = new Grade(g, h);
         out += gArr[gCount].toString() + "\n"; 
         gCount++; 
     }
        
        
        
        return out; 
    }
}
