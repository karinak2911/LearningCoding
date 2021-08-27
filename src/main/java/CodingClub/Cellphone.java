/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingClub;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author CLLB19
 */
public class Cellphone {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter Minutes in the daytime, evening and weekends");
        
        Scanner in = new Scanner (input);
        int daytime = in.nextInt();
        int evening = in.nextInt();
        int weekends = in.nextInt();
        in.close();
        
        int dayCount, eveCount, weCount, extra;
        
        //handles dayTime
        if(daytime <= 100){
            dayCount = 0;
        }
        else {
            extra = daytime - 100;
            dayCount = extra * 80;
            System.out.println(dayCount);
        }
        
        eveCount = evening * 70;
        weCount = weekends * 50;
        int sum = dayCount + eveCount + weCount;
        
        System.out.println("The total cost is: " + sum + "c");
        
    }
}
