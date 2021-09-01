/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayOfObjects;

import java.util.Scanner;

/**
 *
 * @author Karinak
 */
public class Learner {

  
    private String fullName; 
    private double term1; 
    private double term2; 
    private double term3; 

    public Learner(String fullName, double term1, double term2, double term3) {
        this.fullName = fullName;
        this.term1 = term1;
        this.term2 = term2;
        this.term3 = term3;
    }
      public String getFullName() {
        return fullName;
    }
    public String getFirstName(){ 
        Scanner sc = new Scanner(this.fullName); 
        String firstName  = ""; 
        while (sc.hasNext()){ 
            firstName = sc.next(); 
        }
        return firstName; 
    }
    
     public String getSurname(){ 
        Scanner sc = new Scanner(this.fullName); 
        String firstName  = ""; 
        String surname = ""; 
        while (sc.hasNext()){ 
            firstName = sc.next(); 
            surname = sc.next(); 
        }
        return surname; 
    }
     
     
      @Override
    public String toString(){ 
        return this.fullName + "-  term 1: "+ this.term1 + " term 2: " + this.term2 + " term 3: " + this.term3; 
    }
    
    
    
    public double getAverage(){ 
        double average = ( this.term1 + this.term2 + this.term3 )  / 3; 
        average = Math.round(average * 10); 
        average = average / 10; 
        return average; 
    }
    
    
    public double getHighestMark(){ 
        double highest = term1; 
        if(highest< term2)
            highest = term2; 
        if(highest < term3)
            highest = term3; 
        return highest; 
    }
    
    
    
    public String getHighestTerm(){ 
        double highest = term1; 
        if(highest< term2)
            highest = term2; 
        if(highest < term3)
            highest = term3; 
        
        if(highest == term1)
            return "term 1"; 
        else if (highest == term2)
             return "term 2"; 
        else return "term 3 "; 
    }
    
    public int compareTo(Learner b){ 
         return this.fullName.compareTo(b.getFullName());
    }
    
}
