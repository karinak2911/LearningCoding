/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supp2022v2;

import java.io.File;
import java.io.FileNotFoundException;
import static java.time.LocalDate.now;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import jdk.vm.ci.meta.Local;

/**
 *
 * @author Karinak
 */
public class CandidatePaperManager {

    private Candidate[] cArr = new Candidate[20];
    private ResearchPaper[] rpArr = new ResearchPaper[20];
    private int rSize = 0;

    public CandidatePaperManager() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data\\candidates.txt"));
        int i = 0;
        while (sc.hasNextLine()) {
            Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter("#");
            String studentId = lineSc.next();
            String name = lineSc.next();
            int year = lineSc.nextInt();
            cArr[i] = new Candidate(studentId, name, year);
            i++;
        }
    }

    public String reviewresearchPapers() throws FileNotFoundException {
        String out = "";
        String accpeted = "Accepted\n";
        String rejected = "Rejected\n";
        Scanner sc = new Scanner(new File("data\\researchPapers.txt"));
        while (sc.hasNextLine()) {
            Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter("#");
            String title = lineSc.next();
            String department = lineSc.next();
            boolean mdr = lineSc.nextBoolean();
            String reqCode = lineSc.next();
            String studentID = lineSc.next();

            ResearchPaper rp = new ResearchPaper(title, department, mdr, reqCode, studentID);
            if (rp.isMeetsDeptRequirements()) {
                rpArr[rSize] = rp;
                rSize++;
                accpeted += rp.toString() + "\n";

            } else {
                rejected += rp.toString() + "\n";
            }

        }

        out = accpeted + "\n" + rejected;
        return out;

    }

    public String displayAllCandidates() {
        String out = "";
        for (int i = 0; i < 20; i++) {
            out += cArr[i].toString() + "\n";
        }
        return out;
    }

    public void sortByYear() {
        for (int currentPos = 19; currentPos >= 0; currentPos--) {

            boolean sorted = true;
            for (int i = 0; i < currentPos; i++) {
                if (cArr[i].getYear() < cArr[i + 1].getYear()) {
                    Candidate temp = cArr[i];
                    cArr[i] = cArr[i + 1];
                    cArr[i + 1] = temp;
                    sorted = false;
                }

            }
            if (sorted) {
                break;
            }
        }

    }

    public String doctoralCandidates() {
        String out = "";
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String now = date.format(dtf);
        out += now + "\n\n";

        String[] dArr = new String[4];
        int dSize = 0;
        String depts = "MatSci#BusCom#HumArt#LawMed";
        Scanner sc = new Scanner(depts).useDelimiter("#");
        while (sc.hasNext()) {
            dArr[dSize] = sc.next();
            dSize++;
        }

        String MS = "MatSci\n"; 
        String BC = "BusCom\n";
        String HA = "HumArt\n";
        String LM = "LawMed\n";

        for (int i = 0; i < rSize; i++) {
            String current = "";
            String rpSubject = rpArr[i].getDepartment();
            for (int j = 0; j < cArr.length; j++) {
                if (rpArr[i].getStudentID().equalsIgnoreCase(cArr[j].getStudentID()) && rpArr[i].onDeansList()) {
                    current += cArr[j].getName() + " (D)\n" + rpArr[i].getTitle() + "\n\n";
                    //break; 
                }
                else if (rpArr[i].getStudentID().equalsIgnoreCase(cArr[j].getStudentID())) {
                    current += cArr[j].getName() + "\n" + rpArr[i].getTitle() + "\n\n";
                    //break; 
                } 
               
            }     
                for (int k = 0; k < dSize; k++) {
                    if (rpSubject.equalsIgnoreCase(dArr[k]) && dArr[k].equalsIgnoreCase(MS.substring(0, 6))){ 
                        MS+= current;
                        break; 
                    } 
                   
                    else if(rpSubject.equalsIgnoreCase(dArr[k]) && dArr[k].equalsIgnoreCase(BC.substring(0, 6))){ 
                        BC += current; 
                        break; 
                    }
                        
                    else if(rpSubject.equalsIgnoreCase(dArr[k]) && dArr[k].equalsIgnoreCase(HA.substring(0, 6))){ 
                        HA += current;
                        break; 
                    }
                        
                    else if(rpSubject.equalsIgnoreCase(dArr[k]) && dArr[k].equalsIgnoreCase(LM.substring(0, 6))){ 
                        LM += current;
                        break; 
                    }
                        
                  
                        
                    
                
            }
        }
        
        
        
        out += MS + "\n\n" + BC + "\n\n" + HA + "\n\n" + LM; 

        return out;
    }
}
