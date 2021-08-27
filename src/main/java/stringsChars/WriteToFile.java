/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;
import java.io.*; 
import javax.swing.*; 


/**
 *
 * @author CLLB19
 */
public class WriteToFile {
    public static void main(String[] args) throws IOException{ 
        
        PrintWriter outFile = new PrintWriter (new FileWriter("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Data.txt"), true); 
        
        String line = JOptionPane.showInputDialog("Enter a line of text - STOP to exit"); 
        
        while(!line.equals("STOP")){ 
            outFile.println(line); 
            line = JOptionPane.showInputDialog("Enter a line of text - STOP to exit"); 
        }
        
        outFile.close();

    }
    
}
