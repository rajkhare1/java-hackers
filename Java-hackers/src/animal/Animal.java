package animal;

public abstract class Animal {

	private int age;

	public Animal(int age) {
		this.age = age;
		System.out.println("An animal has been created!");
	}

	public abstract void eat();

	public void sleep() {
		System.out.println("An animal is sleeping");
	}

	public int getAge() {
		return this.age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Cat c = new Cat();
		d.eat();
		c.eat();
		d.sleep();
		c.sleep();
		
		// Casting 
		Object dog = new Dog();
		Dog realDog =  (Dog) dog;
		realDog.ruff();
		
		Object str = "SiaKhare"; 
		String realS = (String) str;
		realS.getBytes();
		
		// What happens when
		Dog doggy = new Dog();
		Cat cat = new Cat();
		if(cat instanceof Animal) {
			Animal animal = (Animal)cat;
			animal.sleep();
			
		}
		doggy.sleep();

	}

}
