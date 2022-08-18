/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2018;

/**
 *
 * @author Karinak
 */
public class Stop {

    private String stopName;
    private String routeCodes;
    private int stopType;

    public static final int STOPTYPE_CAFE = 1;
    public static final int STOPTYPE_SHELTER = 2;
    public static final int STOPTYPE_EXPRESS = 3;
    public static final int STOPTYPE_OTHER = 4;

    public Stop(String inStopName, String inRouteCodes, int inStopType) {
        this.stopName = inStopName;
        this.routeCodes = inRouteCodes;
        if(inStopType == STOPTYPE_CAFE || inStopType == STOPTYPE_SHELTER || inStopType == STOPTYPE_EXPRESS)
            this.stopType = inStopType;
        else 
            this.stopType = STOPTYPE_OTHER; 
    }
    
    public String getStopTypeName(){ 
        String out = ""; 
        
        if(stopType == STOPTYPE_CAFE)
            out = "cafe"; 
        else if(stopType == STOPTYPE_EXPRESS)
            out = "express"; 
        else if(stopType == STOPTYPE_SHELTER)
            out = "shelter"; 
        else
            out = "other"; 
        
        return out; 
    }

    
    public boolean isPartOfRoute(char c){ 
        for(int i = 0; i < routeCodes.length(); i++){ 
            if(c == routeCodes.charAt(i)){ 
                return true; 
            }
        }
        return false; 
    }
    
    public String toString(){ 
        return this.getStopTypeName() + "\t" + this.stopName; 
    }
}
