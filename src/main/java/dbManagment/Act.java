/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbManagment;

/**
 *
 * @author Karinak
 */
public class Act {
    private int Actnum; 
    private String actName; 
    private String category; 
    private double soponserShipAmount; 
    private boolean propsNeeded; 

    public Act(int Actnum, String actName, String category, double soponserShipAmount, boolean propsNeeded) {
        this.Actnum = Actnum;
        this.actName = actName;
        this.category = category;
        this.soponserShipAmount = soponserShipAmount;
        this.propsNeeded = propsNeeded;
    }

    public int getActnum() {
        return Actnum;
    }

    public void setActnum(int Actnum) {
        this.Actnum = Actnum;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getSoponserShipAmount() {
        return soponserShipAmount;
    }

    public void setSoponserShipAmount(double soponserShipAmount) {
        this.soponserShipAmount = soponserShipAmount;
    }

    public boolean isPropsNeeded() {
        return propsNeeded;
    }

    public void setPropsNeeded(boolean propsNeeded) {
        this.propsNeeded = propsNeeded;
    }
}
