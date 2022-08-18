/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2018;

import java.io.FileNotFoundException;

/**
 *
 * @author Karinak
 */
public class TourUI {
    public static void main(String[] args) throws FileNotFoundException {
        TourManager tm = new TourManager(); 
        Route r = new Route('R', true); 
        System.out.println(tm.getRouteCodeWith('R', true)); 
        Route p = new Route('Y', false); 
        System.out.println(tm.getRouteCodeWith('Y', false)); 
        System.out.println(tm.stopsInCommon(r, p));
    }
}
