import java.util.Scanner;

public class ShadyRestRoom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter your room type (1. Queen, 2. King, 3. King With Pullout): ");
		int roomNumber = input.nextInt();
		int valid = roomNumber;
        switch (valid){
        case 1:
            System.out.printf("Option: %d Selected%n",valid);
            double r1 = 125;
            System.out.printf("$%.2f for queen",r1);

            break;
        case 2:
            System.out.printf("Option: %d Selected%n",valid);
            double r2 = 139;
            System.out.printf("$%.2f for king",r2);

            break;
        case 3:
            System.out.printf("Option: %d Selected%n",valid);
            double r3 = 165;
            System.out.printf("$%.2f for suite with king bed and a pullout couch.",r3);

            break;
        default:
        	int price = 0;
            System.out.println("You selected an invalid option");
            System.out.printf("Price is $%d ",price);
    }
	input.close();
	

	}

}
