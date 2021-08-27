/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author CLLB19
 */
public class ClassExercise {
    public static void main(String[] args) throws FileNotFoundException {
        int[] arr1 = new int[10]; 
        for(int i = 0; i<10; i++){ 
            double k = Math.random() * 10; 
            arr1[i] = (int)(k); 
            System.out.println(arr1[i]);
        }
        int sum =0; 
        int average; 
        for(int i =0; i<10; i++){ 
            sum = sum + arr1[i]; 
        }
        
        average = sum / 10; 
       
        System.out.println("The sum of the numbers are:" + sum);
        System.out.println("The average of the numbers are:" + average);
        
        File f = new File("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\arrays\\Numbers.txt"); 
        Scanner sc = new Scanner(f); 
        int[] arr2 = new int[100];
        int size = 0; 
        while(sc.hasNextLine()){    
        arr2[size] = sc.nextInt(); 
        size++; 
        } 
        
        
        for(int i = 0; i <10; i++){ 
            System.out.println(arr2[i]); 
}
  
        }
    
    
    
}
