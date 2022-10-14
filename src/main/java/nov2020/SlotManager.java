/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nov2020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Karinak
 */
public class SlotManager {

    Client[] cArr = new Client[20];
    TimeSlot[] tArr = new TimeSlot[40];

    public SlotManager() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data\\clients.txt"));
        int cSize = 0;
        while (sc.hasNextLine()) {
            String name = sc.nextLine();
            String pc = sc.nextLine();
            int eh = Integer.parseInt(sc.nextLine());

            cArr[cSize] = new Client(name, pc, eh);
            cSize++;
        }
    }

    public String displayAllCandidates() {
        String out = "";
        for (int i = 0; i < cArr.length; i++) {
            out += cArr[i].toString() + "\n";
        }
        return out;
    }

    public void generateTimeSlot() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data\\counsellors.txt")).useDelimiter(",");
        int tSize = 0;
        while (sc.hasNext()) {
            String counsellorname = sc.next();
            for (int i = 8; i <= 16; i++) {
                if (i != 12) {
                    tArr[tSize] = new TimeSlot(counsellorname, i);
                    tSize++;
                }

            }
        }
    }

    public String displayAvailableTimeSlots() {
        String out = "";
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i].isIsAvaiable()) {
                out += tArr[i].toString() + "\n";
            }
        }
        return out;
    }

    public String createBookedSlotArray() {
        String out = "";
        for (int i = 0; i < cArr.length; i++) {
            for (int j = 0; j < tArr.length; j++) {
                if (cArr[i].getEarliestHour() < 8 && tArr[j].isIsAvaiable() && tArr[i].getCounsellor().equalsIgnoreCase(cArr[i].getPrefferedCounselor()) && tArr[j].getStartHour() ==8 ) {
                    tArr[j].setIsAvaiable(false);
                    out += cArr[i].getClientName() + "(" + cArr[i].getEarliestHour() + ") to see " + tArr[j].toString() + "\n";
                    break; 
                   
                } 
                
                
               else if(cArr[i].getEarliestHour() < 8 && tArr[j].isIsAvaiable() && tArr[j].getStartHour() == 8){ 
                  tArr[j].setIsAvaiable(false);
                  out += cArr[i].getClientName() + "(" + cArr[i].getEarliestHour() + ") to see " + tArr[j].toString() + "\n";
                  break; 
               } 
                else if (tArr[j].isIsAvaiable() && tArr[j].getCounsellor().equalsIgnoreCase(cArr[i].getPrefferedCounselor()) && tArr[j].getStartHour() == cArr[i].getEarliestHour() && cArr[i].getEarliestHour() > 7) {
                    tArr[j].setIsAvaiable(false);
                    out += cArr[i].getClientName() + "(" + cArr[i].getEarliestHour() + ") to see " + tArr[j].toString() + "\n";
                    break; 

                } else if(tArr[j].isIsAvaiable() && tArr[j].getCounsellor().equalsIgnoreCase(cArr[i].getPrefferedCounselor()) && cArr[i].getEarliestHour() < tArr[j].getStartHour()){
                    tArr[j].setIsAvaiable(false);
                    out += cArr[i].getClientName() + "(" + cArr[i].getEarliestHour() + ") to see " + tArr[j].toString() + "\n";
                    break; 

                }
            
            } 
        }
        return out;
    }
} 
