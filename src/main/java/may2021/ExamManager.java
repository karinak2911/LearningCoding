/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package may2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Karinak
 */
public class ExamManager {
    Exam [] examArr = new Exam[37]; 
    int examSize = 0; 
    ExamDay [] examDay = new ExamDay[31];
    int examDaySize = 0; 

    public ExamManager() throws FileNotFoundException {
       Scanner sc = new Scanner(new File("data\\timetable.txt")); 
       while(sc.hasNextLine()){ 
           Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter(",").useLocale(Locale.UK);
           String date = lineSc.next(); 
           String paper = lineSc.next(); 
           String time = lineSc.next(); 
           double duration = lineSc.nextDouble(); 
           
           Exam e =  new Exam(date, paper, time, duration); 
           examArr[examSize] = e; 
           examSize++; 

       }
       
    }
    
    public String displayAll(){ 
        String out = ""; 
        for(int i = 0; i < examSize; i++){ 
            out += examArr[i].toString() + "\n"; 
        }
        return out; 
    }
    
    public String getExamOnDay(String inDate, String inTime){ 
        String out = ""; 
        String inDateDay = inDate.substring(7); 
       for(int i = 0; i < examSize; i++){ 
           if(examArr[i].getExamDate().substring(7).equals(inDateDay) && examArr[i].getAMorPM().equals(inTime)){ 
               out = examArr[i].toString(); 
               break; 
           } 
       }
        
        return out; 
    }
    
    public String populateTimeTable(String inFileName) throws FileNotFoundException{ 
        String out = ""; 
        Scanner sc = new Scanner(new File("data\\" + inFileName)); 
        
        String [] subjects = new String[50]; 
        int subjectsSize = 0; 
//        Exam [] myExams = new Exam[100]; 
//        int myExamSize = 0; 
        
        while(sc.hasNextLine()){ 
            subjects[subjectsSize] = sc.nextLine(); 
            subjectsSize++; 
        }
        
//        for(int i = 0; i < examSize; i++){ 
//            for(int j = 0; j < subjectsSize; j++){ 
//                if(examArr[i].getPaper().contains(subjects[j])){ 
//                    myExams[myExamSize] = examArr[i]; 
//                    myExamSize++; 
//                }
//                    
//            }
//        }
        
        String date = "2017-03-"; 
        for(int i = 1; i < 32; i++){ 
            if(i < 10)
                date = date + "0" + i; 
            else 
                date = date + i; 
            out += date; 
            Exam am = null;
 Exam pm = null;
 
 
        }  
            
            
        return out; 
        
    }
    
}

