/*
 Door Access Control
Write a program that simulates an access control system. A person is allowed access if they have both a valid ID and a valid access card, or if they are an admin.
Requirements:
   Use logical operators &&, ||, and !.
 */



package Java_Assignments;
import java.util.Scanner;  
public class Door {

	    public static void main(String[] args) {  
	        Scanner scanner = new Scanner(System.in);  

	          
	        System.out.print("Do you have a valid ID? (true/false): ");  
	        boolean hasValidID = scanner.nextBoolean();  

	        System.out.print("Do you have a valid access card? (true/false): ");  
	        boolean hasValidAccessCard = scanner.nextBoolean();  

	        System.out.print("Are you an admin? (true/false): ");  
	        boolean isAdmin = scanner.nextBoolean();  

	        
	        boolean hasAccess = (hasValidID && hasValidAccessCard) || isAdmin;  

	       
	        if (hasAccess) {  
	            System.out.println("Access granted.");  
	        } else {  
	            System.out.println("Access denied.");  
	        }  

	        scanner.close();  
	    }  
	}
