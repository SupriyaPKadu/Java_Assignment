/*
 Logical NOT (!) for Negation
Write a program that determines whether a number is not between 10 and 20 (inclusive).
Requirements:
•    Use logical ! to negate conditions.
 */
package Java_Assignments;
import java.util.Scanner;
public class Negation {

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter a number: ");  
        int number = scanner.nextInt();  
        
         
        if (!(number >= 10 && number <= 20)) {  
            System.out.println(number + " is not between 10 and 20.");  
        } else {  
            System.out.println(number + " is between 10 and 20.");  
        }  

        scanner.close();  
    }  
}
	

