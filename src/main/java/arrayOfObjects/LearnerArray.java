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
    private Learner [] math = new Learner [150]; 
    private int size; 
    
    public LearnerArray(){ 
        try {
            String filename = "data//LearnerMarks.txt";  
            File f = new File(filename);
            Scanner sc = new Scanner(f);
            String fullName; 
            double term1, term2, term3; 
            while(sc.hasNext()){ 
                string li
                Scanner lineSc = sc.nextLine();
                lineSc.useDelimiter("%"); 
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnerArray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
