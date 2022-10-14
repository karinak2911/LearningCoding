/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nov2020;

import java.io.FileNotFoundException;

/**
 *
 * @author Karinak
 */
public class CounsellingUI {
    public static void main(String[] args) throws FileNotFoundException {
        SlotManager sm = new SlotManager(); 
        //System.out.println(sm.displayAllCandidates());
        sm.generateTimeSlot();
        System.out.println(sm.createBookedSlotArray());
    }
    
}
