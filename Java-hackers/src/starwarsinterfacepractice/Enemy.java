package starwarsinterfacepractice;

public class Enemy implements Character {
	
	public String weapon = "lightsaber";
	public void attack() {
		System.out.println("The eneny attacks YOU!");
	}
	
	public void heal() {
		System.out.println("The enemy heals himself");
	}
	
	public void weaponDraw() {
		System.out.println("draw out weapon");
	}

	@Override
	public String getWeapon() {
		return this.weapon;
	}

}
