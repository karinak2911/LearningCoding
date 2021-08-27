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
public class CShape {
    
    public Line2 shortLine; 
    public Line2 longLine; 
    
    public CShape(){ 
        shortLine = new Line2(2, '^');  
        longLine = new Line2(10, '*'); 
    }
    
    public void drawC(){ 
        longLine.draw(); 
        for(int i = 0; i <4; i++){ 
            shortLine.draw();
        }
        longLine.draw();
        
    }
}
