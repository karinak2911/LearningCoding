/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package may2021;

/**
 *
 * @author Karinak
 */
public class ExamDay {
    private String examDate; 
    private Exam morning; 
    private Exam afternoon; 

    public ExamDay(String examDate, Exam morning, Exam afternoon) {
        this.examDate = examDate;
        this.morning = morning;
        this.afternoon = afternoon;
    }

    public String getExamDate() {
        return examDate;
    }
    
    
    public void setExam(Exam inExam){ 
        if(inExam.getAMorPM().equalsIgnoreCase("AM"))
            morning = inExam; 
        else 
            afternoon = inExam; 
    }
    
    public String toString(){ 
        String out = examDate + "\n"; 
        if(morning.equals(null))
            out += "AM: No exam"; 
        else 
            out += "AM: " + morning.toString(); 
        if(afternoon.equals(null))
            out += "PM: No exam"; 
        else 
            out += "PM: " + afternoon.toString(); 
       
        return out; 
       
    }
}
