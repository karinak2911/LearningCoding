/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalNimbus;

/**
 *
 * @author Karinak
 */
public class Technician {
    private String techID; 
    private String name; 
    private int experience; 
    private String roleSpecialty; 

    public Technician(String techID, String name, int experience, String roleSpecialty) {
        this.techID = techID;
        this.name = name;
        this.experience = experience;
        this.roleSpecialty = roleSpecialty;
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

    @Override
    public String toString() {
        return name + ", " + techID + ", " + experience + "year(s), " + "[" + roleSpecialty + "]"; 
    }
    
    
    
}
