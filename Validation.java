/*
 Validating Age and Income
Write a program that checks if a person is eligible for a loan based on their age and income.
Requirements:
•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
•    Use logical && to combine these conditions.
 */
package Java_Assignments;
import java.util.Scanner;
public class Validation {

	    public static void main(String[] args) {  
	        Scanner scanner = new Scanner(System.in);  

	        System.out.print("Enter your age: ");  
	        int age = scanner.nextInt();  

	        System.out.print("Enter your income: ");  
	        double income = scanner.nextDouble();  

	        if (isEligibleForLoan(age, income)) {  
	            System.out.println("You are eligible for a loan.");  
	        } else {  
	            System.out.println("You are not eligible for a loan.");  
	        }  

	        scanner.close();  
	    }  

	    public static boolean isEligibleForLoan(int age, double income) {  
	        return (age >= 18 && age <= 60) && (income > 25000);  
	    }  
	}
