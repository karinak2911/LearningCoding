/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supp2022v2;

import java.io.FileNotFoundException;

/**
 *
 * @author Karinak
 */
public class CandidatePaperUI {
    public static void main(String[] args) throws FileNotFoundException {
        CandidatePaperManager cpm = new CandidatePaperManager(); 
        cpm.sortByYear();
        //System.out.println(cpm.displayAllCandidates());
      cpm.reviewresearchPapers();
        System.out.println(cpm.doctoralCandidates());
    }
    
}
