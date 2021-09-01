/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayOfObjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karinak
 */
public class FriendArray {
    
    private Friend [] friends = new Friend[20];
    private int size; 
    
    public FriendArray() { 
        String filename = "data//friends.txt";
        try{ 
            File f = new File(filename); 
            Scanner sc = new Scanner(f);
            String name, d, line;
            while(sc.hasNext()){
                line = sc.nextLine();
                Scanner sc2 = new Scanner (line).useDelimiter("#");
                name = sc2.next();
                d = sc2.next();
                friends[size] = new Friend(name, d);
                size++;
            } 
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(FriendArray.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
               
    }
    
    public Friend getFriend(int pos){ 
        return friends[pos]; 
    } 
    
    public void sort(){ 
        for (int i = 0 ; i < size - 1; i++){ 
            for(int j = i + 1; j < size; j++){ 
                if(friends[i].compareTo(friends[j])> 0){ 
                    Friend temp = friends [j]; 
                    friends [j] = friends [i]; 
                    friends [i] = temp; 
                }
            }
        }
    }
    
    
    public int search (String name){ 
        for (int i = 0; i < size; i++){ 
            if(name.equalsIgnoreCase(friends[i].getName())){ 
                return i;
            }
        }
        return -1;
    }
    
    
    @Override
    public String toString(){ 
        String output = ""; 
       for(int i = 0; i < size; i++){ 
           output += friends[i].toString() + "\n"; 
       } 
       return output; 
    }
    }
    

