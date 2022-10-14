/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nov2021;

/**
 *
 * @author Karinak
 */
public class Technician {
    private String techID; 
    private String name; 
    private int experience; 
    private String roleSpecialty; 

    public Technician(String inTID, String inN, int inE, String inR) {
        this.techID = inTID;
        this.name = inN;
        this.experience = inE;
        this.roleSpecialty = inR;
    }

    public String getTechID() {
        return techID;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String getRoleSpecialty() {
        return roleSpecialty;
    }
    
    public String toString(){ 
        return name + ", " + techID + ", " + experience + "year(s) [" + roleSpecialty + "]";  
    
    
}
} 
