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
public class Line {
    public int length = 5; 
    
    public Line(){ 
        
    }
    
    public Line(int len){ 
        length = len; 
    }
    
    public void setLength(int len){ 
        length = len; 
    }
    
    public int getLength(){ 
        return length; 
    }
    
    public void drawLine(){ 
        for(int i = 0; i < length; i++){ 
            System.out.print("*"); 
        }
        System.out.println(""); 
       
    }
    

}
