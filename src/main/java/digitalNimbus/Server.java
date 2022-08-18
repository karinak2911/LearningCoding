/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalNimbus;

/**
 *
 * @author Karinak
 */
public class Server {
    
    private String serverID; 
    private String location; 
    private String role; 
    private String fault; 
    private Technician assignedTech; 
    public static final String ROLETYPE_EMAIL = "Email"; 
    public static final String ROLETYPE_FILE = "File"; 
    public static final String ROLETYPE_PRINT = "Print"; 
    public static final String ROLETYPE_CUSTOM = "Custom";

    public Server(String serverID, String location, String fault, String role) {
        this.serverID = serverID;
        this.location = location;
        this.fault = fault;
        
        if(role.equalsIgnoreCase(ROLETYPE_FILE)|| role.equalsIgnoreCase(ROLETYPE_EMAIL) || role.equalsIgnoreCase(ROLETYPE_PRINT) || role.equalsIgnoreCase(ROLETYPE_CUSTOM))
        this.role = role;
        else 
            this.role = ROLETYPE_CUSTOM; 
    }

    public String getServerID() {
        return serverID;
    }

    public String getLocation() {
        return location;
    }

    public String getRole() {
        return role;
    }

    public String getFault() {
        return fault;
    }

    public Technician getAssignedTech() {
        return assignedTech;
    }

    public void setAssignedTech(Technician assignedTech) {
        this.assignedTech = assignedTech;
    }

    @Override
    public String toString() {
        if(this.assignedTech == null)
            return "Server: " + this.serverID + "(Role: " + this.role + ") \n Fault: " + this.fault + "@" + this.location + "\n Assigned to: none assigned"; 
        else  
            return "Server: " + this.serverID + "(Role: " + this.role + ") \n Fault: " + this.fault + "@" + this.location + "\n Assigned to: " + this.assignedTech.getName() + ", "+ this.assignedTech.getTechID() + ", " + this.assignedTech.getExperience() + " years, [" + this.getAssignedTech().getRoleSpecialty()  + "]"; 
    }
    
    
    
    
    
    
}
