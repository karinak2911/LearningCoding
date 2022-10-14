/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supp2022v2;

/**
 *
 * @author Karinak
 */
public class ResearchPaper {
    private String title; 
    private String department; 
    private boolean meetsDeptRequirements; 
    private String reqCode; 
    private String studentID; 
    public static final int DEANMINPAGES = 200; 

    public ResearchPaper(String title, String department, boolean meetsDeptRequirements, String reqCode, String studentID) {
        this.title = title;
        this.department = department;
        this.meetsDeptRequirements = meetsDeptRequirements;
        this.reqCode = reqCode;
        this.studentID = studentID;
    }

    public String getTitle() {
        return title;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isMeetsDeptRequirements() {
        return meetsDeptRequirements;
    }

    public String getStudentID() {
        return studentID;
    }
    
    public String toString(){ 
        return "Title: " + title + "\nAuthor: " + studentID + "\nMeets " + department + "'s requiremnts: " + meetsDeptRequirements; 
    }
    
    public boolean onDeansList(){ 
//        int lengthOfRQ = reqCode.length(); //this is the total number of charactes and needs to be -1 for positions
//  
//        char fieldResearch = reqCode.charAt(lengthOfRQ - 1); 
//        char peeReivewed = reqCode.charAt(lengthOfRQ- 2); 
//        String pagesString = reqCode.substring(0, lengthOfRQ -2);
//        int pages = Integer.parseInt(pagesString);
//        if((pages > DEANMINPAGES) && (Character.compare(peeReivewed, 'T') == 0) && ((Character.compare(fieldResearch, 'T') == 0)) && meetsDeptRequirements)
//            return true; 
//        else 
//            return false; 

        int pages = Integer.parseInt(reqCode.substring(0, reqCode.length() - 2));
        boolean peerReviewed = reqCode.charAt(reqCode.length() - 2)
                == 'T';
        boolean fieldResearch = reqCode.charAt(reqCode.length() - 1)
                == 'T';

        if(pages > DEANMINPAGES && peerReviewed && fieldResearch && this.isMeetsDeptRequirements())
            return true; 
        else 
            return false; 
    }
    
    
}
