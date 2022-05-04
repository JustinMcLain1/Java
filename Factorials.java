package Assign3;

public class Factorials {

	public static void main(String[] args) {
		 int result = 1;
		  for(int i = 1; i <= 10; ++i) {
		      result = result * i;
		      System.out.printf("Factorial of %d is %d%n",i,result);
		  }
	}

}
