/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;
import javax.swing.JOptionPane;

/**
 *
 * @author Navi
 */
public class SwopChars {
    public static void main (String[] args){ 
      
      String input1 = JOptionPane.showInputDialog("Enter the first word:"); 
      String input2 = JOptionPane.showInputDialog("Enter the first second:"); 
      
      String output1 = input2.charAt(0) + input1.substring(1); 
      String output2 = input1.charAt(0) + input2.substring(1); 
      
      System.out.println(output1);
      System.out.println(output2);
      
    
    } 
}
