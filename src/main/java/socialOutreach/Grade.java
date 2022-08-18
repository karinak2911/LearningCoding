/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socialOutreach;

/**
 *
 * @author Karinak
 */
public class Grade {
    private int grade; 
    private double total; 
    private static final int LIMIT = 20; 
    private static final int BONUS = 10; 

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

    public void setTotal(double total) {
        this.total = total;
    }
    
    public String toString(){ 
        return "Grade: " + grade + "    total hours: " + total; 
    }
}
