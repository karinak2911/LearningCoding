/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package may2021;

/**
 *
 * @author Karinak
 */
public class Exam {
    private String examDate; 
    private String paper; 
    private String startTime; 
    private double duration; 

    public Exam(String inExamDate, String inPaper, String inStartTime, double inDuration) {
        this.examDate = inExamDate;
        this.paper = inPaper;
        this.startTime = inStartTime;
        this.duration = inDuration;
    }
    
    public String getEndTime(){ 
       String out = ""; 
       int startHour = Integer.parseInt(startTime.substring(0, 2)); 
       int startMin = Integer.parseInt(startTime.substring(3)); 
       int endHour = 0; 
       int num = (int) duration; 
       if(duration - num == 0){ 
           endHour = startHour + num;
           out = endHour + ":00"; 
       } 
       else{ 
           endHour = startHour + num; 
           out = endHour + ":30"; 
       }
       return out; 
    }
    
    public String getAMorPM(){ 
        String out = ""; 
        if(startTime.substring(0, 2).equalsIgnoreCase("09"))
            out = "AM"; 
        else 
            out = "PM"; 
        
        return out; 
    }

    public String getExamDate() {
        return examDate;
    }

    public String getPaper() {
        return paper;
    }
 
    public String toString(){ 
        return startTime + "-" + getEndTime() + " " + paper; 
    }
}
