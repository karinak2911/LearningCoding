/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nov2019;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Karinak
 */
public class ProjectUI {
    public static void main(String[] args) throws FileNotFoundException {
        Project p = new Project("Collect Old Clothes", "Indoor", 12); 
        p.sort();
        System.out.println(p.correctNumbers()); 
        //System.out.println(p.toString());
        System.out.println(p.createGradearray("11;90;8;72;12;13;10;34;9;53"));
    }
    
   
}
