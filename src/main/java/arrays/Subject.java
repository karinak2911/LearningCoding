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
public class Subject {

    private int[] arr = new int[150];
    private int size;

    public Subject() {
        size = 0;
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\arrays\\Marks.txt"));
            while (sc.hasNext()) {
                arr[size] = sc.nextInt();
                size++;
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("The file was not found: " + ex);
        }

    }

    public void ImprovedSelectionSort() {
        int comps = 0;
        int swaps = 0;

        for (int currentPos = 0; currentPos < size; currentPos++) {
            int lowestPos = currentPos;

            for (int i = currentPos; i < size; i++) {
                comps++;
                if (arr[i] < arr[lowestPos]) {
                    lowestPos = i;
                }

            }
            int temp = arr[lowestPos];
            arr[lowestPos] = arr[currentPos];
            arr[currentPos] = temp;
            swaps++;
        }
        System.out.println("Comps: " + comps + "Swaps: " + swaps);
    }

    public void SelectionSort() {
        int comps = 0;
        int swaps = 0;
        for (int currentPos = 0; currentPos < size; currentPos++) {

            for (int i = currentPos; i < size; i++) {
                comps++;
                if (arr[i] < arr[currentPos]) {
                    int temp = arr[i];
                    arr[i] = arr[currentPos];
                    arr[currentPos] = temp;
                    swaps++;
                }

            }

        }

        System.out.println("Comps: " + comps + "Swaps: " + swaps);
    }

    public void BubbleSort() {
        int comps = 0;
        int swaps = 0;
        for (int currentPos = size - 1; currentPos >= 0; currentPos--) {
            for (int i = 0; i < currentPos; i++) {
                comps++;
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("Comps: " + comps + "Swaps: " + swaps);
    }

    public void ImprovedBubbleSort() {
        int comps = 0;
        int swaps = 0;
        for (int currentPos = size - 1; currentPos >= 0; currentPos--) {
            boolean sorted = true;
            for (int i = 0; i < currentPos; i++) {
                comps++;
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                    swaps++;
                }
            }
            if (sorted) {
                break;
            }
        }
        System.out.println("Comps: " + comps + "Swaps: " + swaps);
    }

    
    public int LinerSearch(int val){ 
        for (int i = 0; i < size; i++){ 
            if(arr[i]==val)
                return i; 
        }
        return -1; 
    }
    
    public int BinarySearch(int val){ 
        int start = 0;
        int end = size -1; 
       int middle; 
        
        while(start<= end){
            middle = (start + end) / 2;
            if(arr[middle]==val)
                return middle; 
            else if(arr[middle]< val)
                start = middle + 1; 
                 
            else 
                end = middle -1; 
    }
        return -1; 
    } 
    
    public void PrintArr() {

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
    }
}
