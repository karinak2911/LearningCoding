/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;
import java.io. *; 
  import javax.swing.*; 
import java.util.*; 
/**
 *
 * @author CLLB19
 */
public class Practice {
     public static void main (String[] args) throws IOException{ 
         Scanner scStr = new Scanner(new File("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Details.txt")); 
         while(scStr.hasNext()){
         System.out.println(scStr.next());
         } 
         scStr.close();
     }
}
