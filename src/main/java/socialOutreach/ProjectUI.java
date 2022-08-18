/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socialOutreach;

/**
 *
 * @author Karinak
 */
public class ProjectUI {
    public static void main(String[] args) {
        Project p = new Project("Collect Old Clothes", "Indoor", 12); 
        p.sort();
        System.out.println(p.correctNumbers());
        System.out.println(p.createGradeArray("11;90;8;72;12;13;10;34;9;53"));
    }

}
