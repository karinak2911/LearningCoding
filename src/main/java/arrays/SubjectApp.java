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
public class SubjectApp {
    public static void main(String[] args) {
        Subject english = new Subject();
        english.PrintArr();
        english.SelectionSort();
        
       //english.ImprovedSelectionSort();
        
       //english.BubbleSort();
       
        //english.ImprovedBubbleSort();
        english.PrintArr();
        
        System.out.println(english.LinerSearch(7));
        System.out.println(english.BinarySearch(90));
         
    }
    
}
