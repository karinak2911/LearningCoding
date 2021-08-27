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
public class Names {
    String[] arr = new String [256]; 
    private int size; 

public Names(){ 
    size = 0; 
        try { 
            Scanner sc = new Scanner(new File("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\arrays\\Names"));
            while(sc.hasNext()){ 
                arr[size] = sc.next(); 
                size++; 
            }
        } catch (FileNotFoundException ex) {
            System.out.println("There was a file not found error");
        }
            
}   


public void BubbleSort(){ 
    for(int currentIndex = size - 1; currentIndex >= 0; currentIndex--){ 
        boolean sorted = true; 
        for(int i = 0; i < currentIndex; i++){ 
            if(arr[i].compareToIgnoreCase(arr[i+1])>0){ 
                String temp = arr[i]; 
                arr[i] = arr[i + 1]; 
                arr[i + 1] = temp; 
                sorted = false; 
                
            }
             
        }
        if(sorted)
            break; 
    }
}

public int FindName(String name){ 
    int start = 0; 
    int end = size - 1; 
    while(start <= end){ 
        int middle = (start + end) / 2;
        if(name.compareToIgnoreCase(arr[middle])==0)
            return middle; 
        else if(name.compareToIgnoreCase(arr[middle]) < 0)
            start = middle + 1; 
        else 
            end = middle -1; 
    }
    return -1; 
}


public void printArray(){
    for(int i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
}
}
