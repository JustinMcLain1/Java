package Assign5;

public class DemoHorses {

	public static void main(String[] args) {
		
		Horse horse = new Horse(); 
		horse.setName("Old Paint");
		horse.setBirthYear(2009);
		horse.setColor("brown");
		
		RaceHorse raceHorse = new RaceHorse();
		raceHorse.setName("Champion");
		raceHorse.setBirthYear(2011);
		raceHorse.setColor("black");
		raceHorse.setNumOfRaces(4);
		
		System.out.println(horse.getName()+" is "+horse.getColor()+" and was born in "+ horse.getBirthYear()+".");
		
		System.out.println(raceHorse.getName()+" is "+raceHorse.getColor()+" and was born in "+raceHorse.getBirthYear()+".");
		System.out.println(raceHorse.getName()+" has been in "+raceHorse.getNumOfRaces()+" races.");
		
	}

}
 