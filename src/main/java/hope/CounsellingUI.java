/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hope;

/**
 *
 * @author Karinak
 */
public class CounsellingUI {
    public static void main(String[] args) {
        SlotManager s = new SlotManager(); 
        //.System.out.println(s.displayAllClients());
        s.generateTimeSlot();
       // System.out.println(s.displayAllAvailableTimeSlots());
        System.out.println(s.createBookedslotArray());
    }
    
}
