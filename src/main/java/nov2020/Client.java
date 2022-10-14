/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nov2020;

/**
 *
 * @author Karinak
 */
public class Client {
    private String clientName; 
    private String prefferedCounselor; 
    private int earliestHour; 

    public Client(String clientName, String prefferedCounselor, int earliestHour) {
        this.clientName = clientName;
        this.prefferedCounselor = prefferedCounselor;
      
       if(earliestHour > 16)
           this.earliestHour = 16; 
       else 
             this.earliestHour = earliestHour;
    }

    public String getClientName() {
        return clientName;
    }

    public String getPrefferedCounselor() {
        return prefferedCounselor;
    }

    public int getEarliestHour() {
        return earliestHour;
    }
    
    public String toString(){ 
        return clientName + "\t" + prefferedCounselor + "\tEarliest: " + earliestHour + ":00";  
    }
    
    
}
