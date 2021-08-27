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
public class Line2 {
    public int size; 
    public char pattern;
    
    public Line2(){ 
        size = 2; 
        pattern = '*'; 
    }
    
    public Line2(int len, char patt){ 
        len = size; 
        patt = pattern; 
    }
    
    public void draw(){ 
        for(int i = 0; i < size; i++){ 
            System.out.print(pattern);
            System.out.println("");
        }
    }
}
