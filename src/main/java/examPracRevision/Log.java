/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examPracRevision;

import java.util.Scanner;

/**
 *
 * @author CLLB19
 */
public class Log {
    private String name; 
    private String email; 
    private int noOfPages; 
    
    public Log(String name, String email, int noOfPages){ 
        this.name = name.toUpperCase(); 
        this.email = email; 
        this.noOfPages = noOfPages; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
    
    public String getSurname(){ 
        String firstname; 
        String surname = ""; 
        Scanner sc = new Scanner(this.name); 
        sc.useDelimiter(" "); 
        while(sc.hasNext()){ 
            firstname = sc.next(); 
            surname = sc.next(); 
        }
        return surname; 
    }
    
    public void changeAlumni(){ 
 
        String domain; 
        String studentname;
        if(this.email.contains("student")){ 
            Scanner sc = new Scanner(this.email); 
            sc.useDelimiter("@"); 
            while(sc.hasNext()){ 
                studentname = sc.next(); 
                domain = sc.next(); 
                Scanner sd = new Scanner(domain); 
                sd.useDelimiter("[.]"); 
               
                this.email = studentname + "@" + "alumni.stbenedicts.co.za";
            }
        }
    }
    
    public String toString(){ 
        return name + "\t" + email + "\t" + noOfPages; 
    }
}
