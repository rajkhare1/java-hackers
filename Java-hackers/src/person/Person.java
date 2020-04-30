package person;

import static person.HairColor.*;

public class Person {
	
	HairColor haircolor = BROWN;
	
	public static void main(String[] args) {
		Person peterParker = new Person();
		Person spiderMan = peterParker;
		
		peterParker.haircolor = ORANGE;
		
		System.out.println("Hair color of Peter Parker: "+peterParker.haircolor);
		System.out.println("Hair color of Spiderman: "+spiderMan.haircolor);
		

	}

}
