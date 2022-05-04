package Assign3;
import java.util.Scanner;

public class TestApartments {
	
	public static boolean checkApt(Apartment apt, int bdrms, double baths, double rent) {

		if(apt.getBedrooms()>=bdrms && apt.getBaths()>=baths && apt.rentCost<=rent)  
			return true;  
			return false;

		}  

	public static void display(Apartment apt) {

		System.out.println("Apt #" + apt.getAptNumber() + " " + apt.getBedrooms() +" bedrooms, and " + apt.getBaths() + " baths. Rent $" + apt.getRent());  

		} 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Apartment apts[] = new Apartment[5];
		apts[0] = new Apartment(101, 2, 1, 725);
		apts[1] = new Apartment(102, 2, 1.5, 775);
		apts[2] = new Apartment(103, 3, 2, 870);
		apts[3] = new Apartment(104, 3, 2.5, 960);  
		apts[4] = new Apartment(105, 3, 3, 1100);  
		
		int bedrooms;
		double bathrooms;
		double rentCost;
		
		System.out.println("Enter minimum number of bedrooms required: ");
		bedrooms = input.nextInt();
		System.out.println("Enter minimum number of bathrooms required: ");
		bathrooms = input.nextInt();  
		System.out.println("Enter maximum rent willing to pay: ");  
		rentCost = input.nextDouble();  

		System.out.println("\nApartments meeting citeria of\nat least " + bedrooms + " bedrooms, at least " + bathrooms + " baths, and " + " no more than $" + rentCost);
		
		
		boolean aptReal = false;

		for(int i=0; i<apts.length; i++){

			if(checkApt(apts[i], bedrooms, bathrooms, rentCost)){  

				display(apts[i]);

				aptReal = true;  

			}  

		}  

			if(!aptReal){  
				System.out.println("No apartments met your criteria");
			}  
		input.close();
	}
 }
