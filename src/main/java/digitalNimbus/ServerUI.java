/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalNimbus;

/**
 *
 * @author Karinak
 */
public class ServerUI {
    public static void main(String[] args) {
        ServerManager sMan = new ServerManager(); 
        //sMan.sort();
        //System.out.println(sMan.allServers());
        int num = sMan.countServers("temp", "custom"); 
        //System.out.println("Number of servers with a Temp fault and Custom Role: " + num);
        sMan.assignTechnician();; 
        System.out.println(sMan.allServers());
        
        
        
    }
    
}
