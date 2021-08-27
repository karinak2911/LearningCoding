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
public class LogTest {
    public static void main(String[] args) {
        Log l = new Log("Karina" , "karina@student.stbendicts.co.za", 78); 
        l.changeAlumni();
        System.out.println(l.getEmail());
    }
}
