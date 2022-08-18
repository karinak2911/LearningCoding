/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Karinak
 */
public class PirateMedCondition extends Pirate {
    
    private String med; 

    public PirateMedCondition(String surname, String firstName, String deck, String job, int grog, int limbs, String med) {
        super(surname, firstName, deck, job, grog, limbs);
        this.med = med;
    }
    
    @Override
  public int grogToMilli(){ 
      return (this.grog * 350) + 500; 
  }
  
  
  
    
}
