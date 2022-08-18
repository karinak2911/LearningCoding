/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hope;

/**
 *
 * @author Karinak
 */
public class TimeSlot {
    private String counsellor; 
    private int startHour; 
    private boolean isAvailable; 

    public TimeSlot(String counsellor, int startHour) {
        this.counsellor = counsellor;
        this.startHour = startHour;
        this.isAvailable = true; 
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getCounsellor() {
        return counsellor;
    }

    public int getStartHour() {
        return startHour;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }
    
    private int getEndHour(){ 
        return startHour + 1; 
    }
    
    public String toString(){ 
        return counsellor + ": " + startHour + ":00 - " + this.getEndHour() + ":00 "; 
    }
    
    
}
