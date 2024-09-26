/*
 Job Application
Write a program that checks if a person is eligible for a job based on their qualifications. A person is eligible if they have a bachelor’s degree or equivalent experience, and they have a clean criminal record.
Requirements:
•    Use logical operators to combine conditions.
 */
package Java_Assignments;
import java.util.Scanner; 
public class Job {

	
       public static void main(String[] args) {  
           Scanner scanner = new Scanner(System.in);  

           
           System.out.print("Do you have a bachelor's degree? (true/false): ");  
           boolean hasBachelorsDegree = scanner.nextBoolean();  
           
           System.out.print("Do you have equivalent experience? (true/false): ");  
           boolean hasEquivalentExperience = scanner.nextBoolean();  
           
           System.out.print("Do you have a clean criminal record? (true/false): ");  
           boolean hasCleanRecord = scanner.nextBoolean();  
           
          
           boolean isEligible = (hasBachelorsDegree || hasEquivalentExperience) && hasCleanRecord;  

           
           if (isEligible) {  
               System.out.println("You are eligible for the job.");  
           } else {  
               System.out.println("You are not eligible for the job.");  
           }  

           scanner.close();  
       }  
   }
	
