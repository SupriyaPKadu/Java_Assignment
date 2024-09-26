/*
Exam Grading System
Write a program that determines whether a student passes an exam based on three subjects. A student passes if the average score is at least 60, and none of the individual scores is below 40.
Requirements:
•    Use logical operators && and || to combine conditions.

*/

package Java_Assignments;
import java.util.Scanner;  
public class Exam {
 
	    public static void main(String[] args) {  
	        Scanner scanner = new Scanner(System.in);  

	        
	        System.out.print("Enter score for subject 1: ");  
	        int score1 = scanner.nextInt();  

	        System.out.print("Enter score for subject 2: ");  
	        int score2 = scanner.nextInt();  

	        System.out.print("Enter score for subject 3: ");  
	        int score3 = scanner.nextInt();  

	        
	        double averageScore = (score1 + score2 + score3) / 3.0;  

	        
	        boolean isPassing = averageScore >= 60 && score1 >= 40 && score2 >= 40 && score3 >= 40;  

	        
	        if (isPassing) {  
	            System.out.println("You passed the exam.");  
	        } else {  
	            System.out.println("You did not pass the exam.");  
	        }  

	        scanner.close();  
	    }  
	}
