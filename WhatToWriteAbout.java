import java.util.*;
public class WhatToWriteAbout {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner (System.in);
		//Random generater only shows last choice. Need to figure out how to limit the choice
		System.out.println("Welcome to What to Write About!");
		System.out.println("This program is meant to help you out when you don't know what to write about.");
		int go = 0;
		
		while(go < 1) {
			//Option Menu
			System.out.println("Please choose a topic.");
			System.out.println("Press 1 for Science Fiction");
			System.out.println("Press 2 for Historical Fiction");
			System.out.println("Press 3 for Fantasy");
			System.out.println("Press 4 for Super Hero");
			System.out.println("Press 5 for Mythology");
			
			//For choice and random number
			int choice = keyboard.nextInt();
			
			//What the user chooses
			if (choice == 1) {
				System.out.println(Science());
			}
			else if (choice == 2) {
				System.out.println(History());
			}
			else if (choice == 3) {
				System.out.println(Fantasy());
			}
			else if (choice == 4) {
				System.out.println(Hero());
			}
			else if (choice == 5) {
				System.out.println(Myth());
			}
			
			System.out.println();
			
			System.out.println("Would you like to do more with this list? 1 for yes and 2 for no.");
	        int dg = keyboard.nextInt();
	        if(dg == 1) {
	            go=0;
	            System.out.println();
	        }
	        else{
	        	System.out.println();
	        	System.out.println("Thanks for playing and I hope your meal tastes fantastic!");
	            go++;
	        }
		}
	}
	
	//Science Fiction
	public static String Science () {
		Random ran = new Random();
		int number = ran.nextInt((10 - 1) + 1)+1;
		String idea = "";
		if(number == 1) {
			idea = "Elements";
		}
		else if(number == 2) {
			idea = "Experiments";
		}
		else if(number == 3) {
			idea = "Rebels";
		}
		else if(number == 4) {
			idea = "Secret Lab";
		}
		else if(number == 5) {
			idea = "Space Ship";
		}
		else if(number == 6) {
			idea = "Intergalatic Exploration";
		}
		if(number == 7) {
			idea = "On Another Planet";
		}
		else if(number == 8) {
			idea = "Aliens Invade Earth";
		}
		else if(number == 9) {
			idea = "Man Made Monsters";
		}
		else if(number == 10) {
			idea = "Other Dimenstions";
		}
		return idea;
	}
	
	//Historical Fiction
	public static String History () {
		Random ran = new Random();
		int number = ran.nextInt((10 - 1) + 1)+1;
		String idea = "";
		if(number == 1) {
			idea = "Future";
		}
		else if(number == 2) {
			idea = "Past";
		}
		else if(number == 3) {
			idea = "1800 AC";
		}
		else if(number == 4) {
			idea = "1900 AC";
		}
		else if(number == 5) {
			idea = "1600 AC";
		}
		else if(number == 6) {
			idea = "1700 AC";
		}
		if(number == 7) {
			idea = "Famous Events";
		}
		else if(number == 8) {
			idea = "2100";
		}
		else if(number == 9) {
			idea = "3000";
		}
		else if (number == 10){
			idea = "2000 BCE";
		}
		return idea;
	}
	
	//Fantasy
	public static String Fantasy () {
		Random ran = new Random();
		int number = ran.nextInt((10 - 1) + 1)+1;
		String idea = "";
		if(number == 1) {
			idea = "Elves";
		}
		else if(number == 2) {
			idea = "Werewolves";
		}
		else if(number == 3) {
			idea = "Vampires";
		}
		else if(number == 4) {
			idea = "Dragons";
		}
		else if(number == 5) {
			idea = "Fairies";
		}
		else if(number == 6) {
			idea = "Sirens";
		}
		if(number == 7) {
			idea = "Dwarves";
		}
		else if(number == 8) {
			idea = "Giants";
		}
		else if(number == 9) {
			idea = "Magic";
		}
		else if (number == 10){
			idea = "Demons";
		}
		return idea;
	}
	
	//Super Hero
	public static String Hero () {
		Random ran = new Random();
		int number = ran.nextInt((10 - 1) + 1)+1;
		String idea = "";
		if(number == 1) {
			idea = "Speed";
		}
		else if(number == 2) {
			idea = "Teleportation";
		}
		else if(number == 3) {
			idea = "Healing";
		}
		else if(number == 4) {
			idea = "Aliens VS Super Heroes";
		}
		else if(number == 5) {
			idea = "Strength";
		}
		else if(number == 6) {
			idea = "Flight";
		}
		if(number == 7) {
			idea = "Creation";
		}
		else if(number == 8) {
			idea = "Magic";
		}
		else if(number == 9) {
			idea = "Invisiblity";
		}
		else if (number == 10) {
			idea = "Shape Shifter";
		}
		return idea;
	}
	
	//Mythology
	public static String Myth () {
		Random ran = new Random();
		int number = ran.nextInt((10 - 1) + 1)+1;
		String idea = "";
		if(number == 1) {
			idea = "Norse";
		}
		else if(number == 2) {
			idea = "Egyptian";
		}
		else if(number == 3) {
			idea = "Greek";
		}
		else if(number == 4) {
			idea = "Roman";
		}
		else if(number == 5) {
			idea = "Mayan";
		}
		else if(number == 6) {
			idea = "Japanese";
		}
		if(number == 7) {
			idea = "Chinese";
		}
		else if(number == 8) {
			idea = "Celtic";
		}
		else if(number == 9) {
			idea = "Indian";
		}
		else if (number == 10){
			idea = "Native American";
		}
		return idea;
	}
}
