/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CLLB19
 */
public class StudentsAge {
    private int[] arr = new int[156]; 
    private int size; 
    
    public StudentsAge(){ 
        size = 0; 
        try { 
            Scanner sc = new Scanner(new File("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\arrays\\Ages"));
            while(sc.hasNext()){ 
                arr[size] = sc.nextInt(); 
                size++; 
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }
        
                
    }
            

public int BinarySearch(int value){ 
    int start = 0; 
    int end = size - 1; 
    while(start < end){ 
        int middle = start + end / 2; 
    }
return 0; 
}
}
