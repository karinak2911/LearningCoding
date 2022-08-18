/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import it.Gogga;
import java.awt.Color;

/**
 *
 * @author Karinak
 */
public class GoggaUpgraded extends Gogga{
    
    public GoggaUpgraded(){ 
        super(); 
        setColor(Color.pink);
 
    }
    
    public void move(int num){ 
        for (int i = 0; i < num; i++)
            move(); 
    }
    
    public void drawSquare(int x){ 
        for(int i = 0; i < 4; i++){ 
        move(x);
       turnLeft();
        } 
        
    }
    
    public void drawRectangle(int x, int y){ 
         for(int i = 0; i < 2; i++){ 
             move(x); 
             turnLeft();
             move(y); 
             turnLeft(); 
         }
    }
    
    
}
