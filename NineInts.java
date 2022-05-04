package Assign4;

public class NineInts {

	public static void main(String[] args) {
		
		final int integerNum = 9;
		int[] integers = {3, 6, 1, 4, 7, 9, 2, 8, 0};
		
		for (int i = 0 ; i < integerNum-1; ++i)
			for (int j=0 ; j < integerNum-1; ++j)
				if (integers[j] > integers[j+1])
				{
					int org = integers[j];
					integers[j]= integers [j+1];
					integers[j+1]=org;
				}
		System.out.print("integers from first to last: ");
		for (int x=0; x<= integerNum-1; x++ )
			System.out.print(integers[x]);
		System.out.print(" integers from last to first: ");
		for (int n=0; n<= integerNum-1; n++ )
			System.out.print(integers[integerNum-(1+n)]);

	}

}
