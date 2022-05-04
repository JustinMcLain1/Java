package Assign4;
import java.util.Scanner;
public class CarCareChoice2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean matches = false;
	    String[] items = {"oil change", "tire rotation", "battery check", "break inspection"};
	    
	    int[] cost = {25,22,15,5};
	    int matchVal = 0;
	    int x;
	    
	    String menu = "Enter selection: ";
	    String item ="";
	    String userItems = "";
	    
	    for(x = 0; x <items.length; ++x) {
	    	menu +="\n" + items[x];
	    }
	    
	    System.out.println(menu);
	    String select = input.nextLine();
	    
	    for(x=0;x < items.length;x++) {
	    	for(int i =0;i<3;i++) {
	    		item += items[x].charAt(i);
	    		userItems += select.charAt(i);
	    	}
	    	if(userItems.equals(item)) {
	    		matches = true;
	    		matchVal = x;
	    	}
	    	item = "";
	    	userItems = "";
	    }
	    if(matches) {
	    	System.out.println(select + "price is $ " + cost[matchVal]);
	    }
	    else {
	    	System.out.println("Invalid Entry");
	    }
	    input.close();
	}

}
