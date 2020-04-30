package car;

public class Car {

	private int maxSpeed = 100;
	private int minSpeed = 0;

	private double weight = 4079;

	private boolean isTheCarOn = false;
	private char condition = 'A';
	private String nameOfCar = "Lucy";

	private double maxFuel = 16;
	private double currentFuel = 8;
	private double mpg = 26.4;

	int numberOfPeopleInCar = 1;
	int maxNumberOfPeopleInCar = 6;
	
	public Car() {
		
	}

	public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
		maxSpeed = customMaxSpeed;
		weight = customWeight;
		isTheCarOn = customIsTheCarOn;
	}
	
	// getters and setters
	

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getMinSpeed() {
		return minSpeed;
	}

	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isTheCarOn() {
		return isTheCarOn;
	}

	public void setTheCarOn(boolean isTheCarOn) {
		this.isTheCarOn = isTheCarOn;
	}

	public char getCondition() {
		return condition;
	}

	public void setCondition(char condition) {
		this.condition = condition;
	}

	public String getNameOfCar() {
		return nameOfCar;
	}

	public void setNameOfCar(String nameOfCar) {
		this.nameOfCar = nameOfCar;
	}

	public double getMaxFuel() {
		return maxFuel;
	}

	public void setMaxFuel(double maxFuel) {
		this.maxFuel = maxFuel;
	}

	public double getCurrentFuel() {
		return currentFuel;
	}

	public void setCurrentFuel(double currentFuel) {
		this.currentFuel = currentFuel;
	}

	public double getMpg() {
		return mpg;
	}

	public void setMpg(double mpg) {
		this.mpg = mpg;
	}

	public int getNumberOfPeopleInCar() {
		return numberOfPeopleInCar;
	}

	public void setNumberOfPeopleInCar(int numberOfPeopleInCar) {
		this.numberOfPeopleInCar = numberOfPeopleInCar;
	}

	public int getMaxNumberOfPeopleInCar() {
		return maxNumberOfPeopleInCar;
	}

	public void setMaxNumberOfPeopleInCar(int maxNumberOfPeopleInCar) {
		this.maxNumberOfPeopleInCar = maxNumberOfPeopleInCar;
	}

	public void upgradeMaxSpeed() {
       setMaxSpeed(getMaxSpeed() + 10);
	}

	public void printVariables() {
		System.out.println("maxSpeed: " + maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
		System.out.println(nameOfCar);
		System.out.println(numberOfPeopleInCar);
	}
	public void getIn() {
		// if there aren't too many people in the car
		if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
			// tell one person to get out
			numberOfPeopleInCar++;
			System.out.println("Someone got in!");
		}else {
			// otherwise print out the fact the car is full.
			System.out.println("The car is full: "+ numberOfPeopleInCar+" = "+ maxNumberOfPeopleInCar);
		}
	}

	public void getOut() {
		// if there's people in the car
		if (numberOfPeopleInCar > 0) {
			// tell one person to get out
			numberOfPeopleInCar--;
		}else {
			// otherwise no one can get out and we'll print that.
			System.out.println("No one is in the car "+numberOfPeopleInCar );
		}
	}

	public double howManyMilesTillOutOfGas() {
		return currentFuel * mpg;
	}

	public double maxMilesPerFillUP() {
		return maxFuel * mpg;
	}

	public void turnTheCarOn() {
		// If car isn't on...
		if (!isTheCarOn) {
			// turn it on
			isTheCarOn = true;
			System.out.println("The car is turned on!");
		} else {
			// otherwise print out the fact it's on
			System.out.println("The car is already on "+isTheCarOn);
		}
	}

	public static void main(String[] args) {
		Car tommyCar = new Car();
		tommyCar.getOut();
		tommyCar.getOut();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.turnTheCarOn();
		tommyCar.turnTheCarOn();
		
	}

}
