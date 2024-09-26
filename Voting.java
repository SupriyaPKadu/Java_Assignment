/*
 Voting Eligibility
Write a program that checks if a person is eligible to vote. A person can vote if they are a citizen and their age is 18 or above.
Requirements:
•    Use logical && to combine conditions, and ! to negate conditions if necessary.
 */
package Java_Assignments;
import java.util.Scanner; 
public class Voting {

 
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

       
        System.out.print("Are you a citizen? (true/false): ");  
        boolean isCitizen = scanner.nextBoolean();  

        System.out.print("Enter your age: ");  
        int age = scanner.nextInt();  

        
        boolean isEligibleToVote = isCitizen && (age >= 18);  

        
        if (isEligibleToVote) {  
            System.out.println("You are eligible to vote.");  
        } else {  
            
            if (!isCitizen) {  
                System.out.println("You are not eligible to vote because you are not a citizen.");  
            } else {  
                System.out.println("You are not eligible to vote because you are under 18.");  
            }  
        }  

        scanner.close();  
    }  
}
	
