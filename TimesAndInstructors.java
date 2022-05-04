package Assign4;
import java.util.Scanner;
public class TimesAndInstructors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String courseName;
		boolean i=false;
		String[][] course = {{"CIS101","Mon 9 am" ,"Farrell"},
				{"CIS210","Mon 11 am","Patel"},
                {"MKT100","Tues 8:30 am","Wong"},
                {"ACC150","Tues 6 pm","Deitrich"},
                {"CIS101","Fri 1 pm","Lennon"}};
		
		   System.out.println("Enter a course: ");
	        courseName = input.nextLine();

	        for (int x = 0; x<course.length;x++){
	            if (courseName.equals(course[x][0])){
	                System.out.println("Course: "+course[x][0]+" Time: "+course[x][1]+" Instructor: "+course[x][2]);
	                i = true;
	            }

	        }
	        if (!i) {
	            System.out.println("Invalid Entry: No Such course");
	    	}
			input.close();
		}			
}
