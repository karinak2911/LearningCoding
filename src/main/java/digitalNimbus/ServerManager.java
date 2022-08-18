package digitalNimbus;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Karinak
 */
public class ServerManager {

    private Server[] sArr = new Server[50];
    private int size = 0;

    public ServerManager() {

        try {
            Scanner sc = new Scanner(new File("data\\Servers.txt"));

            while (sc.hasNextLine()) {
                Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter("#");
                String serverID;
                String location;
                String role;
                String fault;
                serverID = lineSc.next();
                location = lineSc.next();
                fault = lineSc.next();
                role = lineSc.next();

                sArr[size] = new Server(serverID, location, fault, role);
                size++;

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ServerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String allServers() {
        String temp = "";
        for (int i = 0; i < size; i++) {
            temp += sArr[i].toString() + "\n\n";
        }
        return temp;
    }

    public int countServers(String fault, String roleType) {
        int total = 0;
        for (int i = 0; i < size; i++) {
            if (sArr[i].getFault().equalsIgnoreCase(fault) && sArr[i].getRole().equalsIgnoreCase(roleType)) {
                total = total + 1;
            }
        }
        return total;

    }

    public void assignTechnician() {
        try {
            Scanner sc = new Scanner(new File("data\\Technicians.txt"));

            while (sc.hasNextLine()) {
                Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter("#");
                String techID = lineSc.next();
                String name = lineSc.next();
                int experince = lineSc.nextInt();
                String roleSpecialty = lineSc.next();
                
                Technician t = new Technician(techID, name, experince, roleSpecialty); 
                int assignedNo = 0; 
                for(int i = 0; i < size; i++){ 
                    if(t.getRoleSpecialty().equalsIgnoreCase(sArr[i].getRole()) && sArr[i].getAssignedTech() == null){ 
                        sArr[i].setAssignedTech(t);
                        assignedNo++; 
                        
                        if(assignedNo == 4){ 
                            break; 

                        }
                        
                    }
                    
                    
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ServerManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
//1-15
public int getRow(String location){ 
    return Integer.parseInt(location.substring(1))-1; 
}
//A-J
public int getCol(String location){ 
    return (int)location.charAt(0) - (int)('A'); 
    
}
    
    public String printMap(String techID) throws FileNotFoundException{ 
        String output = "";
        char[][] mapTwoDArr = new char[10][15];
        for(int i = 0; i < mapTwoDArr.length; i++){ 
            for(int j = 0; j < mapTwoDArr[i].length; j++){ 
                mapTwoDArr[i][j] = '*'; 
            }
        }
        
        for(int i = 0; i < size; i++){ 
            if(sArr[i].getAssignedTech().getTechID().equalsIgnoreCase(techID)){ 
                int row = getRow(techID); 
                int col = getCol(techID);
                mapTwoDArr[row][col] = 'X'; 
            }
        }
        
        
        
        
        
    }
}
