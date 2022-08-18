/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2019;

/**
 *
 * @author Karinak
 */
public class Grade {
    private int grade; 
    private double total; 
    private final int LIMIT = 20; 
    private final int BONUS = 10; 

    public Grade(int grade, double total) {
        this.grade = grade;
        if(total > LIMIT)
            this.total = total + BONUS; 
        else 
            this.total = total; 
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Grade:"  + grade + "    total hours " + total;
    }
    
    
    
}
