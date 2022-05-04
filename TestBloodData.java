package TestBloodData;

public class TestBloodData {

	public static void main(String[] args) {

	    BloodData blood = new BloodData(); //test default constructor
	    System. out .println( "Blood Type: " + blood.getBloodType()); 
	    System. out .println( "RH Factor: " + blood.getRhFactor()); 

	    
	    BloodData test002 = new BloodData(); //test set method
	    test002.setBloodType( "A" ); 
	    test002.setRhFactor( '-' ); 

	    System. out .println(); 
	    System. out .println( "Blood Type: " + test002.getBloodType()); //test get method
	    System. out .println( "RH Factor: " + test002.getRhFactor()); 
	    System. out .println(); 
	    
	    BloodData test003 = new BloodData( "AB" , '+' ); 
	    System. out .println( "Blood Type: " + test003.getBloodType()); 
	    System. out .println( "RH Factor: " + test003.getRhFactor());

	}

}
