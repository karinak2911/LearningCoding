/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examPracRevision;

/**
 *
 * @author CLLB19
 */
public class PersonManagerUI {
    public static void main(String[] args) {
        PersonManager pm = new PersonManager("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\examPracRevision\\Log.txt"); 
        //pm.addPerson();
        pm.displayPeople();
        pm.highestBmi();
    }
    
}
