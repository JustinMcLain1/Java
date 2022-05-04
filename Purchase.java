package Assign3;

public class Purchase {
	
	private int invoiceNumber;
	private double SaleAmount;
	private double salesTax;
	private final double TAX_RATE = 0.05;
	
	public void setInvoiceNumber(int InvoiceNumber) {
		this.invoiceNumber = InvoiceNumber;
	}
	
	public void setSaleAmount(double SaleAmount) {
		this.SaleAmount = SaleAmount;
		this.salesTax = this.TAX_RATE * SaleAmount;
	}
	
	public void DisplayDetails() {
		System.out.println("Invoice#: " + this.invoiceNumber);
		System.out.printf("Sale Amount: $%.2f%n",this.SaleAmount);
		System.out.printf("Sales Tax: $%.2f%n",this.salesTax);
	}
	
}
