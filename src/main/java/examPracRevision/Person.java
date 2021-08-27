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
public class Person {
    private String name; 
    private int age; 
    private double weight; 
    private int height; 

    public Person(String name, int age, double weight, int height) {
        this.name = name;
        this.setAge(age);
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0)
            this.age = age;
        else 
            this.age = -1; 
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public double getBmi(){ 
        double heightM = this.height / 100; 
        double bmi = this.weight / (heightM * heightM); 
        return bmi; 
    }

  
    public String logString() {
        return this.name + "#" + this.age + "#" + this.weight + "#" + this.height;
    }
    
    public String toString(){ 
        return this.name.toUpperCase() + "\t" + this.age + "\t" + this.weight + "\t" + this.height; 
    }
    
    
    
    
}
