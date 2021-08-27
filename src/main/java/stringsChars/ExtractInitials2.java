/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author CLLB19
 */
public class ExtractInitials2 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter your full name");
        String output = "";
        String temp = "";

        Scanner scStr = new Scanner(input);
        while (scStr.hasNext()) {
            temp = scStr.next();

            if (scStr.hasNext()) {
                output += temp.charAt(0);
            } else {
                output += " ";
                output += temp;
            }
        }

        System.out.println(output);
    }

}
