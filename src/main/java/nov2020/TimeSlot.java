/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nov2020;

/**
 *
 * @author Karinak
 */
public class TimeSlot {
    private String counsellor; 
    private int startHour; 
    private boolean isAvaiable; 

    public TimeSlot(String counsellor, int startHour) {
        this.counsellor = counsellor;
        this.startHour = startHour;
        this.isAvaiable = true;
    }

    public void setIsAvaiable(boolean isAvaiable) {
        this.isAvaiable = isAvaiable;
    }
    
    private int getEndHour(){ 
        return startHour + 1; 
    }
    
    public String toString(){ 
        return counsellor + ": " + startHour + ":00 - " + this.getEndHour() + ":00"; 
    }

    public String getCounsellor() {
        return counsellor;
    }

    public int getStartHour() {
        return startHour;
    }

    public boolean isIsAvaiable() {
        return isAvaiable;
    }
   
    
    
}
