/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 *
 * @author Karinak
 */
public class Practice {
    public static void main(String[] args) {
        String date1 = "29-11-2004"; 
        DateTimeFormatter informatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter outformatter = DateTimeFormatter.ofPattern("dd MMMM yy"); 
        
        LocalDate in = LocalDate.parse(date1, informatter);
     
        
        System.out.println(in.format(outformatter));
        
        
        
    }
}
