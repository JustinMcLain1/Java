package Assign3;
import java.util.Scanner;
public class CreatePurchase {

	public static void main(String[] args) {
		
		Purchase purchase = new Purchase();
		
		Scanner input = new Scanner(System.in);
		
		int InvoiceNumber;
		double SaleAmount;
		do {
			
			System.out.print("enter a invoice number between 1000 and 8000: ");
			InvoiceNumber = input.nextInt();
		}while(InvoiceNumber < 1000 || InvoiceNumber > 8000);
		
		do {
			System.out.print("enter a positive sale amount greater than 0:" );
			SaleAmount = input.nextDouble();
		}while(SaleAmount <= 0); 
		
		purchase.setInvoiceNumber(InvoiceNumber);
		purchase.setSaleAmount(SaleAmount);
		purchase.DisplayDetails();
		input.close();
	}
	
}
