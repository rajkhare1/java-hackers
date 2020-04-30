package madlibs;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {
	
	Scanner scanner = new Scanner(System.in);
	private String story;
	private String name;
	private String adjective1;
	private String adjective2;
	private String noun1;
	private String noun2;
	private String noun3;
	private String adverb;
	private String randomNums;
	Random rand  =  new Random();
	
	// Getters;
	public String getStory() {
		return story;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAdjective1() {
		return adjective1;
	}
	
	public String getAdjective2() {
		return adjective2;
	}
	
	public String getNoun1() {
		return noun1;
	}
	
	public String getNoun2() {
		return noun2;
	}
	
	public String getNoun3() {
		return noun3;
	}
	
	public String getAdverb() {
		return adverb;
	}
	
	public String getRandomNums() {
		return randomNums;
	}
	
	// Setters;
	
   public void setStory(String newStory) {
	   this.story = newStory;
   }
   
   public void setName(String newName) {
	   this.name = newName;
   }
   
   public void setAdjective1(String newAdjective1) {
	   this.adjective1 = newAdjective1;
   }
   
   public void setAdjective2(String newAdjective2) {
	   this.adjective2 = newAdjective2;
   }
   
   public void setNoun1(String newNoun1) {
	   this.noun1 = newNoun1;
   }
   
   public void setNoun2(String newNoun2) {
	   this.noun2 = newNoun2;
   }
   
   public void setNoun3(String newNoun3) {
	   this.noun3 = newNoun3;
   }
   
   public void setAdverb(String newAdverb) {
	   this.adverb = newAdverb;
   }
   
   public void setRandomNums() {
      int num = Math.abs(rand.nextInt()) % 100;
      int index = 0;
      int[] numberHolder = new int[3];
      while(index < numberHolder.length) {
    	  numberHolder[index] = num + index;
    	  index++;
      }
      randomNums = "not "+numberHolder[0]+" , not "+numberHolder[1]+" but "+numberHolder[2] ;
   }
   
   // print instructions to player
   public void printInstructions() {
	   System.out.println("Welcome to the MadLabs game. if you type in words"
	   		+ ", we'll give you a story. Start by typing in a name.");
   }
   
   // get data from player
   public void enterName() {
	   setName(scanner.nextLine());
   }
   
   public void enterNoun1() {
	   System.out.println("Give me a noun!");
	   setNoun1(scanner.nextLine());
   }
   
   public void enterNoun2() {
	   System.out.println("Give me  another noun!");
	   setNoun2(scanner.nextLine());
   }
   
   public void enterNoun3() {
	   System.out.println("Give me the last noun!");
	   setNoun3(scanner.nextLine());
   }
   
   public void enterAdjective1() {
	   System.out.println("I need an adjective.");
	   setAdjective1(scanner.nextLine());
   }
   
   public void enterAdjective2() {
	   System.out.println("I really need an alpaca...just kidding, give me another adjective.");
	   setAdjective2(scanner.nextLine());
   }
   
   public void enterAdverb() {
	  System.out.println("PLEASE! I really want an adverb!");
	   setAdverb(scanner.nextLine());
   }
   
   public void putTogetherTheStory() {
	   String story;
	   int num = Math.abs(rand.nextInt()) % 2;
	   if(num == 0) {
	    story = "jesse and her best friend "+getName()+" went to Disney World today! "
	   		+ "They saw a "+getNoun1()+" in a show at the Magic Kingdom "
	   				+ "and ate a "+getAdjective1()+" feast for dinner. The next day I "
	   						+ "ran "+getAdverb()+" to meet Mickey Mouse in his "+getNoun2()+" "
	   								+ "and that night i gazed at the "+getRandomNums()+" "
	   									+getAdjective2()+ " fireworks shooting from the "+getNoun3()+".";
	   } else {
		   story = "Amanda and her frenemy "+getName()+" went to zoo last summer. "
		   		+ "the saw huge "+getNoun1()+" and a tiny little "+getNoun2()+" . That night they "
		   				+ "decided to climb "+getAdverb()+" into the "+getNoun3()+" to get a closer look. "
		   						+ "The zoo was "+getAdjective1()+" at night, but didn't care...untill "
		   						+getRandomNums()+ " "+getAdjective2()+" apes yelled in their faces, making "
		   								+ "Amanda and "+getName()+" spring all the way back home. ";
	   }
	   setStory(story);
   }
   
   public void play() {
	   enterName();
	   enterNoun1();
	   enterAdjective1();
	   enterAdverb();
	   enterNoun2();
	   enterAdjective2();
	   enterNoun3();
	   setRandomNums();
	   putTogetherTheStory();
	   System.out.println(getStory());
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MadLibs game = new MadLibs();
		game.printInstructions();
		game.play();

	}

}
