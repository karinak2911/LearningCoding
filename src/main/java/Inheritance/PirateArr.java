/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karinak
 */
public class PirateArr {
    
    Pirate [] pArr = new Pirate[100]; 
    private int size = 0; 
    
    public PirateArr(){ 
         try {
            Scanner sc = new Scanner(new File("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\LearningCoding\\data\\Pirate.txt"));
            while (sc.hasNext()) {
                Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter(",");
                String surname = lineSc.next();
                String firstName = lineSc.next();
                String deck = lineSc.next(); 
                String job = lineSc.next(); 
                int grog = lineSc.nextInt(); 
                int limbs = lineSc.nextInt(); 
                Pirate p;
                if (lineSc.hasNext()) {
                    String med = lineSc.next();
                    p = new PirateMedCondition(surname, firstName, deck, job, grog, limbs, med);                     
                } else {
                    p = new Pirate(surname, firstName, deck, job, grog, limbs);
                }

                pArr[size] = p;
                size++;

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EntryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String toString(){ 
      String temp = ""; 
      for(int i = 0; i < size; i++){ 
          temp += pArr[i].toString() + "\n\n"; 
      }
      return temp; 
    }
    
    public String pirateHasMedCondition(){ 
    String temp = ""; 
      for(int i = 0; i < size; i++){ 
          if (pArr[i] instanceof PirateMedCondition) 
              temp += pArr[i].toString(); 
      }
      return temp; 
}
    
    public void sortBySurname(){ 
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--) {
            boolean sorted = true;
            for (int i = 0; i < currentIndex; i++) {
                if (pArr[i].surname.compareToIgnoreCase(pArr[i + 1].surname) > 0) {
                    Pirate temp = pArr[i];
                    pArr[i] = pArr[i + 1];
                    pArr[i + 1] = temp;
                    sorted = false;

                }

            }
            // outside inner for loop!!!
            if (sorted) {
                break;
            }
        }
    }
    
    public int distance(double barrelsOfGrog){ 
        double grogOnBoardInMilli = barrelsOfGrog * 100000; 
        double totalCrewDrinksInDay = 0; 
        for(int i = 0; i < size; i++){ 
            totalCrewDrinksInDay += pArr[i].grogToMilli(); 
        }
        int days = (int) (grogOnBoardInMilli / totalCrewDrinksInDay); 
        return days; 
    }
    
    public String advert(){ 
        String jobs = "Jobs Available: " + "\n"; 
        for(int i = 0; i < size; i++){ 
            if(pArr[i].getLimbs() == 4 && pArr[i].getDeck().equalsIgnoreCase("Lower Deck") ){ 
                jobs += pArr[i].getJob() + "\n"; 
                pArr[i].setJob("Sword Fighter");
                pArr[i].setDeck("Upper Deck");
                        } 
        }
        jobs += "Apply to Jack Sparrow at the docks"; 
        return jobs; 
    }
    
    
}
