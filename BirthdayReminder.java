package Assign4;
import java.util.Scanner;
public class BirthdayReminder {

	public static void main(String[] args) {
		
	       Scanner input = new Scanner(System.in);
		  
	       String SentinVal = "ZZZ";
	       final int size = 10;
	       int count = 0;
	       String[] names = new String[size];
	       String[] DOBArr = new String[size];
	       String name = null;
	       String dateOfBirth = null;
	       boolean errCheck = true;
	       boolean flag = false;

	       System.out.println("Enter name or enter ZZZ " +  "to quit");

	       name = input.nextLine();

	       while(!name.equals(SentinVal) && count < 10)

	       {

	           System.out.println("Enter date of birth " +  "(mm-dd-yyyy)");
	           dateOfBirth=input.nextLine();
	           names[count] = name;
	           DOBArr[count] = dateOfBirth;
	           System.out.println("Enter name or enter ZZZ to quit");
	           name=input.nextLine();
	           count++;
	       }
	       System.out.printf("Count of names inputed: %d%n",count);
	       System.out.println("The names you entered are:");
	       for(int i = 0; i < count; i++)  
	       {
	           System.out.println(names[i]);
	       }
	       
	       while(errCheck)
	       {
	           System.out.println("Enter name to display date of birth or enter ZZZ to quit");
	           name = input.nextLine();
	           if(name.equals(SentinVal))
	               errCheck = false;
	           else
	           {
	               for(int i = 0; i < count && !flag; i++)
	               {
	                   if(names[i].equals(name))
	                   {
	                       flag = true;
	                       dateOfBirth = DOBArr[i];
	                   }
	               }
	               if(flag)
	               {
	                   System.out.printf("Date of Birth of %s is %s%n",name,dateOfBirth);
	               }
	               else
	               {
	                   System.out.printf("Date Of Birth of %s was not entered%n",name);
	               }
	           }
	           flag = false;
	       }
	       input.close();
	}

}
