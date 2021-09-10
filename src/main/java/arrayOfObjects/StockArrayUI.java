/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayOfObjects;

/**
 *
 * @author Karinak
 */
public class StockArrayUI {
    public static void main(String[] args) {
        StockArray items = new StockArray(); 
        System.out.println(items.toString());
        System.out.println(items.search("yui789hjhj"));
        items.adjustStock("wyoqiwuw", 9);
        items.adjustStock("wyoqiwuw", -9);
        
    }
    
}
