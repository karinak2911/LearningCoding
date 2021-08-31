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
public class FriendUI {
    public static void main(String[] args) {
        Friend f = new Friend("jOHN", "2003-09-13");
        System.out.println(f.getAge()); 
        System.out.println(f);
    }
}
