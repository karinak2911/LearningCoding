/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author CLLB19
 */
public class NamesUI {
    public static void main(String[] args) {
        Names n = new Names(); 
        n.printArray();
        n.BubbleSort();
        System.out.println("The sorted array is: ");
        n.printArray();
        int johnPos = n.FindName("John"); 
        System.out.println("John is at: " + johnPos);
    
    }
    
    
}
