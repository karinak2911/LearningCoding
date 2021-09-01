/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayOfObjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karinak
 */
public class LearnerArray {
    private Learner [] arr = new Learner [150]; 
    private int size = 0; 
    
    public LearnerArray(){ 
        try {
            String filename = "data//LearnerMarks.txt";  
            File f = new File(filename);
            Scanner sc = new Scanner(f);
            String fullName; 
            double term1, term2, term3; 
            while(sc.hasNext()){ 
                String line = sc.nextLine(); 
                Scanner lineSc = new Scanner (line); 
                lineSc.useDelimiter("%"); 
                while (lineSc.hasNext()){ 
                    fullName = lineSc.next(); 
                    term1 = lineSc.nextDouble(); 
                    term2 = lineSc.nextDouble(); 
                    term3 = lineSc.nextDouble(); 
                    
                    arr[size] = new Learner(fullName, term1, term2, term3); 
                    size++; 
                }
                
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnerArray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public String getStudentsAverage(){ 
        String averages = ""; 
        for(int i = 0; i < size; i++){ 
            averages += arr[i].getFullName() + ": " + arr[i].getAverage() + "/n"; 
        }
        return averages; 
    }
    
    public String getBestmark(){ 
        String bestMarks = ""; 
        for(int i = 0; i < size; i++){ 
            bestMarks += arr[i].getFullName() + " has achieved " + arr[i].getHighestMark() + " in " + arr[i].getHighestTerm(); 
        }
        return bestMarks; 
    }
    
    
    public void sort(){ 
        for (int i = 0 ; i < size - 1; i++){ 
            for(int j = i + 1; j < size; j++){ 
                if(arr[i].compareTo(arr[j])> 0){ 
                    Learner temp = arr [j]; 
                    arr [j] = arr [i]; 
                    arr [i] = temp; 
                }
            }
        }
    }
    
    public String search(String name){
        int start = 0;
        int end = size -1; 
        while(start <=end){ 
        int middle = start + end / 2;
          if (arr[middle].getFirstName().compareToIgnoreCase(name) == 0) {
                return arr[middle].toString();
            } else if (arr[middle].getFirstName().compareToIgnoreCase(name) > 0) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return "there is no student with that name"; 
        } 
      
    
    public 
    } 
    
