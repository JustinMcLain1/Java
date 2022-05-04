package Assign4;
import java.util.Scanner;
public class CarCareChoice {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

		 System.out.println("Cody’s Car Care Shop");

		 System.out.println("Available services: oil change, tire rotation, battery check, and brake inspection");

		    System.out.print("Choose your service: ");

		    String service = input.nextLine();

		    if (service.equals("oil change")) {
			       System.out.println("Your choice is: " + service + ". Its price is: $25");
		    }
		    else if (service.equals("tire rotation")) {
			       System.out.println("Your choice is: " + service + ". Its price is: $22");
		    }
		    else if (service.equals("battery check")) {
			       System.out.println("Your choice is: " + service + ". Its price is: $15");
		    }
		    else if (service.equals("brake inspection"))
		    {
			       System.out.println("Your choice is: " + service + ". Its price is: $5");	
		    }
		    else
		    {
		        System.out.println("Invalid entry!");	
		    }
		    input.close();
		}
	
}
