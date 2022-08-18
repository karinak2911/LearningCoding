/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suppPaper2022;

import java.io.FileNotFoundException;

/**
 *
 * @author Karinak
 */
public class ShootMe {
    public static void main(String[] args) throws FileNotFoundException {
        CandidatePaperManager c = new CandidatePaperManager(); 
        System.out.println(c.displayAllCandidates());
    }
}
