/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 *
 * @author Karinak
 */
public class StudentTest {
    public static void main(String[] args) throws FileNotFoundException {
        //new scanner for file 
        Scanner sc = new Scanner(new FileInputStream("data\\Student.json")); 
        // creates string for json object 
        String studentJSON = ""; 
        while(sc.hasNext()){ 
            //populates string with whole object 
            studentJSON += sc.nextLine(); 
        }
        Student[] s = parseStudents(studentJSON); 
        System.out.println(Arrays.toString(s));
        
//        
    }
    
    
    public static Student parseStudent(String studentInJSON){
        JSONObject job = new JSONObject(studentInJSON); 
        
        int id = job.getInt("id"); 
        String firstName = job.getString("firstName"); 
        String lastname = job.getString("lastname"); 
        int classID = job.getInt("classID"); 
        
        return new Student(id, firstName, lastname, classID); 
    }
    
    public static Student[] parseStudents(String studentInJSON){ 
        JSONArray jarr = new JSONArray(studentInJSON); 
        Student[] sarr = new Student[jarr.length()]; 
        for(int i = 0; i < jarr.length() ; i++){ 
            JSONObject job = jarr.getJSONObject(i); 
             int id = job.getInt("id"); 
        String firstName = job.getString("firstName"); 
        String lastname = job.getString("lastname"); 
        int classID = job.getInt("classID"); 
        
        sarr[i] = new Student(id, firstName, lastname, classID); 
        }
        return sarr; 
    }
}
