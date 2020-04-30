package starwarsinterfacepractice;

import java.util.Random;

public class StarWarsInterfacePractice {
	
	public static Character summonCharacter() {
		Random rand = new Random();
		if(Math.abs(rand.nextInt()) % 2 == 0) {
			return new Enemy();
		} else {
			return new Hero();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enemy darthVedor = new Enemy();
		Hero obinWanKenobi = new Hero();
		darthVedor.attack();
		obinWanKenobi.attack();
		darthVedor.heal();
		obinWanKenobi.heal();
		System.out.println("Ememy weapon: "+ darthVedor.getWeapon());
		System.out.println("Hero weapon: "+ obinWanKenobi.getWeapon());
		Character spy = summonCharacter();
		spy.attack();
		spy.heal();
		

	}

}
