import java.util.Arrays;
import java.util.Scanner;

public class Cherisma_p3 {
		public static void main(String[] args) {
			 Scanner scnr = new Scanner (System.in);
			 //set topics
			 String[] topics = new String[5];
			 
			 topics[0] = "Sports";
			 topics[1] = "Religious";
			 topics[2] = "Social";
			 topics[3] = "Educational";
			 topics[4] = "Political";
			 
			 int peoples;
			 
			 System.out.print ("How many individuals is willing to take part of of this poll.\n");
			 
			 peoples = scnr.nextInt();
			 
			 int[][] userResponses = new int[5][11];
			 
			 int i=0;
			 int j,n;
			 //loops users to vote individually
			 while (i<peoples)
			 {
				 //Gets user ratings
				 for(j=0; j<topics.length; j++)
				 {
					 System.out.print("Out of ten, where ten is the most important please rate this topic:" + topics[j] + "\n");
					 n = scnr.nextInt();
					 userResponses[j][n] = userResponses[j][n]+1;
				 }
				 i++;
			 }
			 
			   int avgRating[] = new int[topics.length];

	           String maxTopic= "" , minTopic= "" ;

	           int max = 0 , min= 0;
	           
	           //loops to find average and totals
	           
	           for(i=0;i<userResponses.length;i++)

	           {

	                  avgRating[i] = 0;

	                  for(j=0;j<userResponses[i].length;j++)

	                         avgRating[i] += (userResponses[i][j]*(j));

	                 

	                  if(i == 0) 

	                  {

	                         max = avgRating[i];

	                         min = avgRating[i];

	                         maxTopic = topics[i];

	                         minTopic = topics[i];

	                  }else

	                  {

	                         if(avgRating[i] > max)

	                         {

	                               maxTopic = topics[i];

	                               max = avgRating[i];

	                         }

	                        

	                         if(avgRating[i] < min)

	                         {

	                               minTopic = topics[i];

	                               min = avgRating[i];

	                         }

	                  }

	                 

	                  avgRating[i] = avgRating[i]/peoples;

	           }
	          //Output topics in a tubular report
	           
	           System.out.printf("\n%-20s","");

	           for(i=0;i<10;i++)

	                  System.out.printf("%-10d",(i));

	           System.out.printf("%20s","Average");

	           System.out.println();

	           for(i=0;i<userResponses.length;i++)

	           {

	                  System.out.printf("\n%-20s",topics[i]);

	                  for(j=0;j<userResponses[i].length;j++)

	                         System.out.printf("%-10d",userResponses[i][j]);

	                  System.out.printf("%20d%s",avgRating[i], "\n");

	           }

	          

	           // summarize the table
	           System.out.println("Highest Topic : "+ maxTopic +" Lowest Topic : "+ minTopic);

	           System.out.println("Highest Points : "+ max +" Lowest points:"+ min);

	          
			 
			
		}
	  
}
