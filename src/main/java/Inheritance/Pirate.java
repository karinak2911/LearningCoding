/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Karinak
 */
public class Pirate {
    protected String surname, firstName, deck, job; 
    protected int grog, limbs; 

    public Pirate(String surname, String firstName, String deck, String job, int grog, int limbs) {
        this.surname = surname;
        this.firstName = firstName;
        this.deck = deck;
        this.job = job;
        this.grog = grog;
        this.limbs = limbs;
    }

    public String getDeck() {
        return deck;
    }

    public String getJob() {
        return job;
    }

    public int getLimbs() {
        return limbs;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }

    public void setJob(String job) {
        this.job = job;
    }

   public String getName(){ 
       return this.surname + " " + this.firstName.charAt(0) + "."; 
   }
   
   public int grogToMilli(){ 
       return (this.grog * 350); 
   }
    
    @Override
   public String toString(){ 
       return "Name: " + this.getName() + "\n" + "Deck: " + this.deck + "\n" + "Job: " + this.job + "\n" + "Flagons: " + this.grog + "\n" + "Limbs: " + this.limbs; 
   }
    
    
}
