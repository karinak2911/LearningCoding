/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Karinak
 */
public class ScoresUI {
    public static void main(String[] args) {
        Scores netball = new Scores(); 
        netball.PrintArr();
        System.out.println("");
        netball.ImprovedBubbleSort();
        netball.PrintArr();
        System.out.println("");
        netball.removeDuplicates();
        netball.PrintArr();
        
    }
}
