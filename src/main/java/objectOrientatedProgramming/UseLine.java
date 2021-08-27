/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrientatedProgramming;

/**
 *
 * @author CLLB19
 */
public class UseLine {
    public static void main(String[] args){ 
        Line steve = new Line(10); 
        steve.drawLine(); 
        System.out.println("Steve's length is " + steve.getLength());
        steve.setLength(15); 
        steve.drawLine();
        System.out.println("Steve's length is " + steve.getLength());
        
        
        CShape s = new CShape(); 
        s.drawC();
    }
    
}
