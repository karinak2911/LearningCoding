/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suppPaper2022;

/**
 *
 * @author Karinak
 */
public class ResearchPaper {

    private String title;
    private String department;
    private boolean meetsDeptRequirments;
    private String reqCode;
    private String studentID;
    public static int DEANMINPAGES = 200;

    public ResearchPaper(String title, String department, boolean meetsDeptRequirments, String reqCode, String studentID) {
        this.title = title;
        this.department = department;
        this.meetsDeptRequirments = meetsDeptRequirments;
        this.reqCode = reqCode;
        this.studentID = studentID;
    }

    public String getTitle() {
        return title;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isMeetsDeptRequirments() {
        return meetsDeptRequirments;
    }

    public String getReqCode() {
        return reqCode;
    }

    public String getStudentID() {
        return studentID;
    }

    public String toString() {
        return "Title: " + this.title + "\nAuthor: " + this.studentID + "\nMeets " + this.department + "'s requirments: " + this.meetsDeptRequirments;
    }

    public boolean onDeansList() {

        int pages = Integer.parseInt(reqCode.substring(0, reqCode.length() - 2));
        boolean peerReviewed = reqCode.charAt(reqCode.length() - 2)
                == 'T';
        boolean fieldResearch = reqCode.charAt(reqCode.length() - 1)
                == 'T';

        if(pages > DEANMINPAGES && peerReviewed && fieldResearch && this.meetsDeptRequirments)
            return true; 
        else 
            return false; 
                   
    }
}
