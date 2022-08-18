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
public class CandidatePaperUI {
    public static void main(String[] args) throws FileNotFoundException {
    CandidatePaperManager c = new CandidatePaperManager(); 
    c.sort();
        c.reviewResearchPapers(); 
        System.out.println(c.doctoralCandidates());
}
} 