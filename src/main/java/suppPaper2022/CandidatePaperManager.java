/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suppPaper2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author Karinak
 */
public class CandidatePaperManager {

    private Candidate[] cArr = new Candidate[20];
    int cArrSize = 0;
    private ResearchPaper[] rpArr = new ResearchPaper[20];
    private ResearchPaper[] rpRejectedArr = new ResearchPaper[20];
    int rpSize = 0;
    int rprejected = 0;

    public CandidatePaperManager() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data\\candidates.txt"));
        while (sc.hasNextLine()) {
            Scanner lineSC = new Scanner(sc.nextLine()).useDelimiter("#");
            String studentID = lineSC.next();
            String name = lineSC.next();
            int year = lineSC.nextInt();

            cArr[cArrSize] = new Candidate(studentID, name, year);
            cArrSize++;

        }

    }

    public String reviewResearchPapers() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data\\researchPapers.txt"));
        while (sc.hasNextLine()) {
            Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter("#");
            String title = lineSc.next();
            String department = lineSc.next();
            boolean mdr = lineSc.nextBoolean();
            String reqCode = lineSc.next();
            String studentID = lineSc.next();

            ResearchPaper rp = new ResearchPaper(title, department, mdr, reqCode, studentID);
            if (rp.isMeetsDeptRequirments()) {
                rpArr[rpSize] = rp;
                rpSize++;

            } else {
                rpRejectedArr[rprejected] = rp;
                rprejected++;
            }

        }

        String out = "Accepted: \n";
        for (int i = 0; i < rpSize; i++) {
            out += rpArr[i] + "\n";
        }

        out += "Rejected: \n";
        for (int i = 0; i < rprejected; i++) {
            out += rpRejectedArr[i] + "\n";
        }

        return out;

    }

    public String displayAllCandidates() {
        String out = "";
        for (int i = 0; i < cArrSize; i++) {
            out += cArr[i].toString() + "\n";
        }

        return out;
    }

    public void sort() {
        for (int currentIndex = cArrSize - 1; currentIndex >= 0; currentIndex--) {
            boolean sorted = true;
            for (int i = 0; i > currentIndex; i++) {
                if (cArr[i].getYear() > cArr[i + 1].getYear()) {
                    Candidate temp = cArr[i];
                    cArr[i] = cArr[i + 1];
                    cArr[i + 1] = temp;
                    sorted = false;

                }

            }
            // outside inner for loop!!!
            if (sorted) {
                break;
            }
        }

    }

    public String doctoralCandidates() {

        String out = "";
        LocalDateTime currentDate = LocalDateTime.now();
        out += currentDate + "\n\n";

        String depts = "MatSci#BusCom#HumArt#LawMed";
        Scanner sc = new Scanner(depts).useDelimiter("#");

        
        System.out.println("");
        while (sc.hasNext()) {
            String currentDept = sc.next();

            out += currentDept + "\n";
            for (int i = 0; i < rpSize; i++) {
                
                if (rpArr[i].getDepartment().equalsIgnoreCase(currentDept)) {
                    
                    for (int j = 0; j < cArrSize; j++) {
                        
                        if (rpArr[i].getStudentID().equals(cArr[j].getStudentID())) {
                            if (rpArr[i].onDeansList()) {

                                out += cArr[j].getName() + "(D)\n";
                            } else {
                                out += cArr[j].getName() + "\n";
                            }
                            out += rpArr[i].getTitle() + "\n\n";
                            break;
                        }
                    }

                }

            }

        }

        return out;
    }
}
