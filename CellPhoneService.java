
import java.util.Scanner;
public class CellPhoneService {

	public static void main(String[] args) {
		int minutes;
		int text;
		int data;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the maximum monthly value for talked minutes: ");
		minutes = input.nextInt();
		System.out.println("Please enter the maximum monthly texting: ");
		text = input.nextInt();
		System.out.println("Please enter the maximum monthly data: ");
		data = input.nextInt();
		input.close();
		
		if(minutes >= 500 && text >= 100 && data >= 3) {
			System.out.println("Accept plan F at $87 per month.");
		}
		else if(minutes >=500 && text >= 100 && data < 3 && data > 0) {
			System.out.println("Accept plan E at $79 per month.");
		}
		else if(minutes >=500 && text >= 101 && data == 0) {
			System.out.println("Accept plan D at $70 per month.");
		}
		else if(minutes >=500 && text < 101 && data == 0) {
			System.out.println("Accept plan C at $61 per month.");
		}
		else if(minutes <= 499 && text > 0 && data == 0) {
			System.out.println("Accept plan B at $55 per month.");
		}
		else {
			//for any use with no data or text and less than 500 minutes
			System.out.println("Accept plan A at $49 per month.");
		}

	}

}
