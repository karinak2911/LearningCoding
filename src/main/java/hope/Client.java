/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hope;

/**
 *
 * @author Karinak
 */
public class Client {
    private String clientName; 
    private String preferredCounsellor; 
    private int earliestHour; 

    public Client(String clientName, String preferredCounsellor, int earliestHour) {
        this.clientName = clientName;
        this.preferredCounsellor = preferredCounsellor;
        if(earliestHour > 16)
            this.earliestHour = 16; 
        else 
             this.earliestHour = earliestHour;
    }

    public String getClientName() {
        return clientName;
    }

    public String getPreferredCounsellor() {
        return preferredCounsellor;
    }

    public int getEarliestHour() {
        return earliestHour;
    }
    
    public String toString(){ 
      return clientName + "\t" + preferredCounsellor + "\t" + "Earliest " + earliestHour + ":00"; 
    }
    
    
    
}
