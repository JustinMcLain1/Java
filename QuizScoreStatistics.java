package Assign3;
import java.util.Scanner;
public class QuizScoreStatistics {

	   public static void main(String[] args)  {

	       //This creates a Scanner Object

	       Scanner input=new Scanner(System.in);

	       //This declares and initializes all integer variables

	       float score; 
	       int count =0; 
	       float sum = 0;
	       float max = Integer.MIN_VALUE; 
	       float min = Integer.MAX_VALUE;

	       float average =0;

	       do{
	           System.out.print("Enter a Score: ");
	           score =input.nextFloat();

	           //Inputs less than 0 or greater than 10 are invalid

	           if (score < 0 || score >10 ){

	               System.out.println("Invalid input");

	           }

	           //For valid inputs

	           else{ 
	               count++;
	               sum+=score;
	               if(score > max){
	                   max = score;
	               }
	               if(score < min){
	                   min = score;
	               }
	           }
	       }

	       while(score != 99);
	       average= sum/count;
	       System.out.println("The total scores entered was:"+count);
	       System.out.printf("The Lowest score was: %.1f%n",min);
	       System.out.printf("The Highest score was: %.1f%n" ,max);
	       System.out.printf("The Average of the scores was: %.1f%n",average);
	       input.close();
	}

}
