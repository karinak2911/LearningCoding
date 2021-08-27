/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidayPrac;

/**
 *
 * @author CLLB19
 */
public class RegistrationApp {
    public static void main(String[] args) {
		RegistrationManager r = new RegistrationManager("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Information.txt");
		r.addStudent();
                r.viewStudents();
	}
}

