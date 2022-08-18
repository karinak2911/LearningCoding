/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2019;

import java.io.FileNotFoundException;

/**
 *
 * @author Karinak
 */
public class ProjectUI {
    public static void main(String[] args) throws FileNotFoundException {
        Project p = new Project("Collect old clothes", "Indoor", 12); 
        p.sort();
        System.out.println(p.correctNumbers());
        System.out.println(p.createGradeArray("9;53;12;13;8;72;11;90;10;34"));
    }
}
