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
public class NamesAndAgesUI {
    public static void main(String[] args) {
         NamesAndAges groupA = new NamesAndAges(); 
    groupA.PrintArr();
    groupA.ImprovedBubbleSort();
        System.out.println("Sorted alphabetically: ");
    groupA.PrintArr();
    int samPos = groupA.BinarySearch("Sam"); 
        System.out.println("Sam is at position: " + samPos);
        groupA.addElement("Gary", 35);
        System.out.println("Adding Gary: ");
        groupA.PrintArr();
        groupA.deleteElement("Gia");
        System.out.println("Deleting Gia: ");
        groupA.PrintArr();
        
        System.out.println(groupA);
    
    }
   
}
