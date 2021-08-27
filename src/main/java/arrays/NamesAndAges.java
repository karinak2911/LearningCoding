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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karinak
 */
public class NamesAndAges {

    private int[] ageArr = new int[200];
    private String[] nameArr = new String[200];
    private int ageSize;
    private int nameSize;

    public NamesAndAges() {
        ageSize = 0;
        nameSize = 0;
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\arrays\\Ages.txt"));
            // just while sc.hasnext , not line 
            while (sc.hasNext()) {
                ageArr[ageSize] = sc.nextInt();
                ageSize++;
            }
            Scanner sc2 = new Scanner(new File("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\arrays\\Names.txt"));
            while (sc2.hasNext()) {
                nameArr[nameSize] = sc2.nextLine();
                nameSize++;
            }
            sc.close();
            sc2.close();
        } catch (FileNotFoundException ex) {
            System.out.println("There was a file not found exception");
        }

    }

    public void PrintArr() {
        for (int i = 0; i < nameSize; i++) {
            System.out.print(nameArr[i] + "\t");

        }
        System.out.println("");
        for (int i = 0; i < ageSize; i++) {
            System.out.print(ageArr[i] + "\t");

        }
        System.out.println("");

    }

    public void ImprovedBubbleSort() {
        for (int currentIndex = nameSize - 1; currentIndex >= 0; currentIndex--) {
            boolean sorted = true;
            for (int i = 0; i < currentIndex; i++) {
                if (nameArr[i].compareToIgnoreCase(nameArr[i + 1]) > 0) {
                    int temp = ageArr[i];
                    ageArr[i] = ageArr[i + 1];
                    ageArr[i + 1] = temp;
                    sorted = false;

                    String temp2 = nameArr[i];
                    nameArr[i] = nameArr[i + 1];
                    nameArr[i + 1] = temp2;

                }

            }
            // outside inner for loop!!!
            if (sorted) {
                break;
            }
        }
        this.updateArray();

    }

    public void ImprovedSelectionSort() {

        for (int currentPos = 0; currentPos < nameSize; currentPos++) {
            int lowestPos = currentPos;

            for (int i = currentPos; i < nameSize; i++) {

                if (nameArr[i].compareToIgnoreCase(nameArr[i + 1]) < 0) {
                    lowestPos = i;
                }

            }
            String temp = nameArr[lowestPos];
            nameArr[lowestPos] = nameArr[currentPos];
            nameArr[currentPos] = temp;

            int temp2 = ageArr[lowestPos];
            ageArr[lowestPos] = ageArr[currentPos];
            ageArr[currentPos] = temp2;

        }
       
    }

    public int BinarySearch(String name) {
        int start = 0;
        int end = nameSize - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (nameArr[middle].compareToIgnoreCase(name) == 0) {
                return middle;
            } else if (nameArr[middle].compareToIgnoreCase(name) > 0) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;

    }

    public int BinarySearch(int age) {
        int start = 0;
        int end = ageSize - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (ageArr[middle] == age) {
                return middle;
            } else if (ageArr[middle] > age) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;

    }

    public void addElement(String name, int age) {
        int index = 0;
        for (int i = 0; i < nameSize; i++) {
            if (nameArr[i].compareToIgnoreCase(name) > 0) {
                index = i;
                break;
            }
        }
        this.shiftRight(index);
        nameArr[index] = name;
        ageArr[index] = age;

    }

    public void deleteElement(String name) {

        int index = this.BinarySearch(name);
        System.out.println(index);
        if (index >= 0) {
            this.shiftLeft(index);
        }

    }

    public void deteleAt(int index) {
        this.shiftLeft(index);
    }

    public void removeDuplicates() {
        for (int i = 0; i < nameSize; i++) {
            if (nameArr[i].compareToIgnoreCase(nameArr[i + 1]) == 0) {
                this.shiftLeft(i);
                i--;
            }
        }
        this.updateArray();

    }

    public void removeDuplicatesUnsorted() {

    }

    public void shiftLeft(int index) {

        for (int i = index; i < ageSize; i++) {
            ageArr[i] = ageArr[i + 1];
        }
        ageSize--;
        for (int i = index; i < nameSize; i++) {
            nameArr[i] = nameArr[i + 1];
        }
        nameSize--;
    }

    public void shiftRight(int index) {
        ageSize++;
        for (int i = ageSize - 1; i > index; i--) {
            ageArr[i] = ageArr[i - 1];
        }
        nameSize++;
        for (int i = nameSize - 1; i > index; i--) {
            nameArr[i] = nameArr[i - 1];
        }
    }

    public void updateArray() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\arrays\\Age.txt");
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < ageSize; i++) {
                pw.println(ageArr[i]);
            }
            FileWriter fw2 = new FileWriter("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\arrays\\Name.txt");
            PrintWriter pw2 = new PrintWriter(fw2);
            for (int i = 0; i < nameSize; i++) {
                pw2.println(nameArr[i]);

            }
            pw.close();
            pw2.close();
        } catch (IOException ex) {
            System.out.println("There was a file not found exception");
        }

    }
}
