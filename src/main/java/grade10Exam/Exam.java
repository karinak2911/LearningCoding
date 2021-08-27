package grade10Exam;



import javax.swing.JOptionPane;

public class Exam {
    
    public static void main (String[] args){
    int num1, num2; 
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Results:"); 
        
        
        if (num1<num2)
            System.out.println("The first number is smaller " + num1);
        else if (num2==num1)
            System.out.println("They are equal");
        else 
            System.out.println(num2); 
        
        System.out.println("The square root of the first number is " + Math.sqrt(num1));
        
        if(num2% 2 ==0)
            System.out.println("The second number is even");
        else 
            System.out.println("The second number is odd");
        
        
        int time = 18; 
        String timeOfDay; 
        
        if(time >= 5 && time < 12) 
            timeOfDay = "morning"; 
        else if (time >= 12 && time < 20)
            timeOfDay = "daytime";
        else 
            timeOfDay = "nighttime"; 
        
        System.out.println(timeOfDay);
        
        int dayOfWeek = 1; 
        String schedule; 
        switch(dayOfWeek){ 
            
            case 1: 
               schedule= "Gym in the morning"; 
                break;
                
            case 2: 
                schedule = "Class after work"; 
                break; 
                
            case 3: 
                schedule = "Meetings all day"; 
                break; 
                
            case 4: 
                schedule = "Work from home"; 
                break; 
                
            case 5: 
                schedule = "Game night after work"; 
                break; 
                
            default: 
                schedule = "Free!"; 
                break; 
        }
        
        
        int bankBalance = 500;
        bankBalance = bankBalance + 250; 
        bankBalance = bankBalance - 100; 
        System.out.println(bankBalance);


 
        
        
        String firstName= "Karina"; 
        String lastName = "Krishnaswamy"; 
        String fullName=firstName + " " + lastName; 
        
        int firstNameLetters = firstName.length(); 
        int lastNameLetters = lastName.length(); 
        int fullNameLetters = firstNameLetters + lastNameLetters; 
        
        System.out.println("Hello, my name is " + fullName);
        System.out.println("There are " + fullNameLetters + " letters in my name");
        
       
       
       
        double fahrenheit = 30; 
        double celcius = (fahrenheit - 32) * 5 / 9; 
        System.out.println(celcius);
        
        
       for(int i= 0; i<5; i++)
           System.out.println(firstName);
        
        
    }
} 
