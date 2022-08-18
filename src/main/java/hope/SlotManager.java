/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hope;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karinak
 */
public class SlotManager {
    private Client [] cArr = new Client[20]; 
    int cSize = 0; 
    private TimeSlot [] tArr = new TimeSlot[40]; 
    int tSize = 0; 

    public SlotManager() {
        try { 
            Scanner sc = new Scanner(new File("data\\clients.txt")); 
            while(sc.hasNextLine()){ 
                String name = sc.nextLine(); 
                String preferredCounsellor = sc.nextLine(); 
                int earliestHour = Integer.parseInt(sc.nextLine()); 
                
                cArr[cSize] = new Client(name, preferredCounsellor, earliestHour); 
                cSize++; 
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SlotManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public String displayAllClients(){ 
        String out = ""; 
        for(int i = 0; i < cSize; i++){ 
            out += cArr[i].toString() + "\n"; 
        }
        return out; 
    }
    
    public void generateTimeSlot(){ 
        try { 
            Scanner sc = new Scanner(new File("data\\counsellors.txt")).useDelimiter(",");
            while(sc.hasNext()){ 
                String counsellor = sc.next();  
                for(int i = 8; i < 17; i++){ 
                    if(i != 12){ 
                    tArr[tSize] = new TimeSlot(counsellor, i); 
                    tSize++; 
                    } 
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SlotManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String displayAllAvailableTimeSlots(){ 
        String out = ""; 
        for(int i = 0; i < tSize; i++ ){ 
            if(tArr[i].isIsAvailable()){ 
                out += tArr[i].toString() + "\n"; 
            }
        }
        return out; 
    }
    
    public String createBookedslotArray(){ 
        String out = "Appointments \n"; 
        for(int i = 0; i < cSize; i++){ 
            for(int j = 0; j < tSize; j++){ 
                if(cArr[i].getPreferredCounsellor().equalsIgnoreCase(tArr[j].getCounsellor()) && tArr[i].isIsAvailable() && tArr[j].getStartHour() >= cArr[i].getEarliestHour() ){ 
                    tArr[j].setIsAvailable(false);
                   out += cArr[i].getClientName() + "(" + cArr[i].getEarliestHour() + ") to see "  + tArr[j].toString()  + "\n"; 
                    break; 
                }
            }
        }
        
        
        return out; 
    }
    
    
}
