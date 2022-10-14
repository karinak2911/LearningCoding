/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nov2021;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Karinak
 */
public class ServerUI {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        ServerManager sm = new ServerManager(); 
//        sm.assignTechnician();
        //System.out.println(sm.allServers());
       // System.out.println("Number of servers with a Temp Fault and Custom Role: " + sm.countServers("Temp", "Custom"));
//        System.out.println(sm.printBetterMap("T-D1"));
        
        
        
        for (int i = 0; i < 255; i++) {
            System.out.println(i + ":" + Character.valueOf((char) i));
            
        }
    }
}
