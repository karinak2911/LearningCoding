/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Scores {

    private int[] arr = new int[200];
    private int size;

    public Scores() {
        size = 0;
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\arrays\\Scores.txt"));
            // just while sc.hasnext , not line 
            while (sc.hasNext()) {
                arr[size] = sc.nextInt();
                size++;
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("There was a file not found exception");
        }

    }

    public void ImprovedBubbleSort() {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--) {
            boolean sorted = true;
            for (int i = 0; i < currentIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }

            }
            // outside inner for loop!!!
            if (sorted) {
                break;
            }
        }
        this.updateArray();
       
    }

    public int BinarySearch(int val) {
        int start = 0;
        int end = size - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] == val) {
                return middle;
            } else if (arr[middle] > val) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;

    }

    public void PrintArr() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public void addElement(int num) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > num) {
                index = i;
                break;
            }
        }
        this.shiftRight(index);
        arr[index] = num;
        this.updateArray();

    }

    public void deleteElement(int num) {

        int index = this.BinarySearch(num);
        if (index >= 0) {
            this.shiftLeft(index);
        }
        this.updateArray();
    }

    public void removeDuplicates() {
        for (int i = 0; i < size; i++) {
            if (arr[i] == arr[i + 1]) {
                this.shiftLeft(i);
                i--;
            }
        }
        this.updateArray();

    }

    public void shiftLeft(int index) {
        
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void shiftRight(int index) {
        size++;
        for (int i = size - 1; i > index; i--) {
            arr[i] = arr[i-1];
        }
    }

    public void updateArray() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\arrays\\Scores.txt");
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < size; i++) {
                pw.println(arr[i]);
            }
            pw.close();
        } catch (IOException ex) {
            System.out.println("There was an IO exception");
        }
    }

}
