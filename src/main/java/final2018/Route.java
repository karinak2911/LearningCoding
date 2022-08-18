/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2018;

/**
 *
 * @author Karinak
 */
public class Route {
    private char routeCode; 
    private boolean isCircular; 
    private Stop[] stops; 

    public Route(char routeCode, boolean isCircular) {
        this.routeCode = routeCode;
        this.isCircular = isCircular;
    }

    public void setStops(Stop[] stops) {
        this.stops = stops;
    }
    
    public Stop getStopAt(int num){ 
        if(this.stops == null)
            return null; 
        else if(num > stops.length)
            return null; 
        
        Stop s = stops[num]; 
        return s; 
        
    }
    
    public String toString(){ 
        String out = ""; 
        if(this.getStopAt(0) == null){ 
            out = this.routeCode + " - Invalid"; 
            return out; 
        } 
        else if(this.isCircular){ 
            out += this.routeCode + " - Circular\n"; 
            for(int i = 0; i < this.stops.length; i++){ 
                if(stops[i] == null)
                    break; 
                int j = i + 1; 
                out += " - > " + j + " "+ stops[i].toString() + "\n";          
            }
            out += " - > 1 " + " "+ stops[0].toString() + "\n";     
            return out; 
        }
        else{ 
            out += this.routeCode + " - Linear\n"; 
            for(int i = 0; i < this.stops.length ; i++){ 
                if(stops[i] == null){ 
                    out += this.descLinear(i); 
                    break; 
                } 
                int j = i + 1; 
                out += " - > " + j  + " "+ stops[i].toString() + "\n";         
               
            }
              return out; 
        } 
   
    } 
    
    private String descLinear(int index){ 
        String out = ""; 
        for(int i = index - 2; i >= 0; i--){ 
            out += " - > " + (i+1) + " "+ stops[i].toString() + "\n";       
        }
        return out; 
    }

    public char getRouteCode() {
        return routeCode;
    }
    
    
}
