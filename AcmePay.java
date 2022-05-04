import java.util.Scanner;

public class AcmePay {
	
	public static void main(String[] args) {
		
		double shiftOne = 17;
		double shiftTwo = 18.50;
		double shiftThree = 22;
		int hoursWorked = 0;
		int overTime = 0;
		int retirement;
		double overPay = 0;
		double deductionPay = 0;
		double netPay = 0;
		double total_pay = 0;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your shift Number");
		int shiftNum = input.nextInt();
		
        System.out.println("Enter enter of hours worked: ");
        hoursWorked = input.nextInt();

		
		if(shiftNum == 1) {
			if(hoursWorked > 40) {
				double regPay = 40 * shiftOne;
				overTime = hoursWorked - 40;
				overPay = (overTime * (shiftOne* 1.5f));
				total_pay = overPay + regPay;
				
			}
			else {
				total_pay = hoursWorked * shiftOne;

			}
			
            System.out.println("Hours worked: "+hoursWorked);
            System.out.println("Shift: "+shiftNum);
            System.out.printf("Hourly Pay: $%.2f%n",shiftOne);
            System.out.printf("Over Time Pay: $%.2f%n",overPay);
            System.out.printf("Total of regular and (if any) overtime pay: $%.2f%n",total_pay);
            System.out.println("Retirement deduction: $0.00");
            System.out.printf("Net total Pay: $%.2f%n",total_pay);
		}
		
		if(shiftNum == 2) {
			System.out.println("Do you elect for the retirement plan? 1(yes), 2(no): ");
			retirement = input.nextInt();
			
			if(retirement == 1) {
				if(hoursWorked > 40) {
					double regPay = 40 * shiftTwo;
					overTime = hoursWorked - 40;
					overPay = (overTime * (shiftTwo* 1.5f));
					total_pay = overPay + regPay;
					deductionPay = total_pay*0.03;
					netPay = total_pay - deductionPay;
				}
				else {
					total_pay = hoursWorked * shiftTwo;
					deductionPay = total_pay*0.03;
					netPay = total_pay - deductionPay;
				}
	            System.out.println("Hours worked: "+hoursWorked);
	            System.out.println("Shift: "+shiftNum);
	            System.out.printf("Hourly Pay: $%.2f%n",shiftTwo);
	            System.out.printf("Over Time Pay: $%.2f%n",overPay);
	            System.out.printf("Total of regular and (if any) overtime pay: $%.2f%n",total_pay);
	            System.out.printf("Retirement deduction: $%.2f%n",deductionPay);
	            System.out.printf("Net total Pay: $%.2f%n",netPay);
			}
			else
			{
				if(hoursWorked > 40) {
					double regPay = 40 * shiftTwo;
					overTime = hoursWorked - 40;
					overPay = (overTime * (shiftTwo* 1.5f));
					total_pay = overPay + regPay;
				}
				else {
					total_pay = hoursWorked * shiftTwo;
				}
	            System.out.println("Hours worked: "+hoursWorked);
	            System.out.println("Shift: "+shiftNum);
	            System.out.printf("Hourly Pay: $%.2f%n",shiftTwo);
	            System.out.printf("Over Time Pay: $%.2f%n",overPay);
	            System.out.printf("Total of regular and (if any) overtime pay: $%.2f%n",total_pay);
	            System.out.println("Retirement deduction: %0.00");
	            System.out.printf("Net total Pay: $%.2f%n",total_pay);
			}
		}
		
		if(shiftNum == 3) {
			System.out.println("Do you elect for the retirement plan? 1(yes), 2(no): ");
			retirement = input.nextInt();
			
			if(retirement == 1) {
				if(hoursWorked > 40) {
					double regPay = 40 * shiftThree;
					overTime = hoursWorked - 40;
					overPay = (overTime * (shiftThree* 1.5f));
					total_pay = overPay + regPay;
					deductionPay = total_pay*0.03;
					netPay = total_pay - deductionPay;
				}
				else {
					total_pay = hoursWorked * shiftThree;
					deductionPay = total_pay*0.03;
					netPay = total_pay - deductionPay;
				}
	            System.out.println("Hours worked: "+hoursWorked);
	            System.out.println("Shift: "+shiftNum);
	            System.out.printf("Hourly Pay: $%.2f%n",shiftThree);
	            System.out.printf("Over Time Pay: $%.2f%n",overPay);
	            System.out.printf("Total of regular and (if any) overtime pay: $%.2f%n",total_pay);
	            System.out.printf("Retirement deduction: $%.2f%n",deductionPay);
	            System.out.printf("Net total Pay: $%.2f%n",netPay);
			}
			else
			{
				if(hoursWorked > 40) {
					double regPay = 40 * shiftThree;
					overTime = hoursWorked - 40;
					overPay = (overTime * (shiftThree* 1.5f));
					total_pay = overPay + regPay;
				}
				else {
					total_pay = hoursWorked * shiftThree;
				}
	            System.out.println("Hours worked: "+hoursWorked);
	            System.out.println("Shift: "+shiftNum);
	            System.out.printf("Hourly Pay: $%.2f%n",shiftThree);
	            System.out.printf("Over Time Pay: $%.2f%n",overPay);
	            System.out.printf("Total of regular and (if any) overtime pay: $%.2f%n",total_pay);
	            System.out.println("Retirement deduction: %0.00");
	            System.out.printf("Net total Pay: $%.2f%n",total_pay);
			}
		}
		
	input.close();	
	}
}
