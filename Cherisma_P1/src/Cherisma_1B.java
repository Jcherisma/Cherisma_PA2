import java.util.Scanner;

	public class Cherisma_1B {

		public static void main(String[] args) {
			 Scanner scnr = new Scanner (System.in);
			 
		
		
		int [] userNum = new int [4];
		 int i;
		 
		 System.out.print ("May you please enter four single digits?\n");
		 
		 for (i=0; i<userNum.length; i++)
		 {
			 userNum[i] = scnr.nextInt();
			
		 }
		
		 
		 for (i=0; i<userNum.length; i++)
		 {
			 userNum[i]= ((userNum[i]+3)%10);
					 
		 }
		 
		 
		 
		 int temp = userNum[0];
		 userNum[0] = userNum[2];
		 userNum[2] = temp;
		 
		 temp = userNum[1];
		 userNum[1] = userNum[3];
		 userNum[3] = temp;
		 
		 System.out.print("Your four digit is:" + userNum[0] + userNum[1] + userNum[2] + userNum[3] + "\n");
		} 
}
