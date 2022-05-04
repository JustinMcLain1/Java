
public class Billing {
	
	
	public static double computeBill(double photoBookPrice) {
		double bill = photoBookPrice + (0.08f * photoBookPrice);
		return bill;
		
	}
	
	 public static double computeBill(double photoBookPrice, int quantity) {
		 double bookBought = (photoBookPrice * quantity);
		 double bill = (bookBought * 0.08f) + bookBought;
		 return bill;
	}
	
	public static double computeBill(double photoBookPrice, int quantity, double coupon) {
		double bookBought = ((photoBookPrice * quantity) - coupon);
		double bill = (bookBought * 0.08f) + bookBought;
		return bill;
	}
	
	public static void main(String[] args) {
		
        final double test1 = 19.99;
        final double test2 = 45.50;
        final double test3 = 12.00;
        final int quantity1 = 2;
        final int quantity2 = 4;
        double bill;

        bill = computeBill(test1);

        System.out.printf("The total for a photobook that cost $%.2f is $%.2f%n",test1,bill);

        bill = computeBill(test2, quantity1);
        System.out.printf("The total for %d photobooks that cost $%.2f is $%.2f%n", quantity1,test2,bill);

        bill = computeBill(test3, quantity2, 20.00);
		System.out.printf("The total for %d photobooks that cost $%.2f with a $20 dollar coupon is $%.2f%n", quantity2,test3,bill);
	}

}
