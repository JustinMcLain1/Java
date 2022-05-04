package Assign3;
import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		int val;
		int smallest;
		int largest = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number(-99 to stop):");
		
		val = input.nextInt();
		
		smallest = val;
		
		while(val != -99)
		{
			System.out.print("Enter an integer(-99 to stop):");
			val = input.nextInt();
			if(val != -99) {
				if(val > smallest) {
					largest = val;
				}
				else {
					smallest = val;
				}
			}
		}
		System.out.printf("The smallest number was: %d%nThe largest number was: %d", smallest,largest);
		input.close();
	}

}
