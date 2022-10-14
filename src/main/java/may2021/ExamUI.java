/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package may2021;

import java.io.FileNotFoundException;

/**
 *
 * @author Karinak
 */
public class ExamUI {
    public static void main(String[] args) throws FileNotFoundException {
        ExamManager em = new ExamManager(); 
        System.out.println(em.displayAll());
    }
    
}
