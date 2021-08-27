/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author CLLB19
 */
public class ReadNames2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Names.txt"));
        String output = ""; 
        
       

        while (file.hasNext()) {
            String line = file.nextLine();
            Scanner lineScanner = new Scanner(line);
            
            while (lineScanner.hasNext()) {
                String name = lineScanner.next();

                if (lineScanner.hasNext()) {
                    output += name.charAt(0);
                } else {
                    output += " ";
                    output += name;
                }
            }

            System.out.println(output);
            output = ""; 

        }

    }
}
