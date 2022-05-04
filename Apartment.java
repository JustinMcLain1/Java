package Assign3;

public class Apartment {
	/* 
	this holds 
	apartment Number
	bedroom number
	number of baths
	rent amount
	*/
	
	int aptNumber;
	int bedrooms;
	double bathrooms;
	double rentCost;
	
	public Apartment(int num, int bdrms, double bths, double rent) {
		aptNumber = num;
		bedrooms = bdrms;
		this.bathrooms = bths;
		this.rentCost = rent;
	}
	
		public int getAptNumber() {
			return aptNumber;
		}
		
		public int getBedrooms() {
			return bedrooms;
		}
		public double getBaths() {
			return bathrooms;
		}
		public double getRent( ) {
			return rentCost;
		}
	
}
	
