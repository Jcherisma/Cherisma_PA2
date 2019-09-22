import java.util.Scanner;

public class p2_Cherisma {
	 public static void main(String[] args) {
		 Scanner scnr = new Scanner (System.in);
		 
		 double BMI;
		 double weightInPounds;
		 double weightInKilos;
		 double heightInInches;
		 double heightInMeters;
		 String userChoice;
		 
		  System.out.print ("Which kind of BMI fomula would you like to use, Metric or the Imperial system?\n");
	 
		  userChoice = scnr.next();
		  
		  if (userChoice.equals("Metric"))
		  	{
			System.out.print ("Can you please enter your weight in kilos?\n");  
			weightInKilos = scnr.nextDouble();
			
			System.out.print ("Can you please enter your height in meters?\n"); 
			heightInMeters = scnr.nextDouble();
			
			BMI = (weightInKilos/(Math.pow(heightInMeters, 2)));
			
			System.out.print ("Your BMI using the metric formula is:" + BMI + ".\n");
			}
		  else
		  	{
			  System.out.print ("Can you please enter your weight in pounds?\n");  
				weightInPounds = scnr.nextDouble();
				
				System.out.print ("Can you please enter your height in inches?\n"); 
				heightInInches = scnr.nextDouble();
				
				BMI = ((703* weightInPounds)/(Math.pow(heightInInches,2)));
				
				System.out.print ("Your BMI using the imperial system is:" + BMI + ".\n");
			 
			  
		  	}
		  System.out.print("You are underweight if your BMI is under 18.5.\n");
		  System.out.print("Your weight is normal if it is between 18.5 and 24.9.\n");
		  System.out.print("You are overweight if your BMI is between 25 and 29.9.\n");
		  System.out.print("You are considered obese if your BMI is 30 or greater.\n");
	 }
	 
}
