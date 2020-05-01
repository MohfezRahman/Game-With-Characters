import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/* Class:Driver
 * *@author Mohfez Rahman * 
 * @version 1.0 
 * * Course: ITEC 2150 Spring 2020 
 * * Written: Mar 10, 2020 * 
 * * This class – now describe what the class
 * does: This program is going to display the classes of Human, Robot, and 
 * Animal by using ArrayLists and it will use test.txt file to read for output then it will 
 * create char2.txt file by using default strength;
 */

public class Driver {

	/*
	 * Main method
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

		// Scanner
		Scanner file;

		// ArrayList created for Character
		ArrayList<Character> characters = new ArrayList<Character>();

		// try and catch block
		try {
			// Scanner to read the file
			file = new Scanner(new File("test.txt"));
			// while loop body
			while (file.hasNextLine()) {

				// array to read line from test.txt file and split with ";"
				String[] line = file.nextLine().split(";");

				// if statement to read human and access Human parameter from test.txt file
				if (line[0].equalsIgnoreCase("human")) {
					characters.add(new Human(line[1], Integer.parseInt(line[2]), line[3], Integer.parseInt(line[4])));

					// else if statement to read Robot and access Robot parameter from test.txt file
				} else if (line[0].equalsIgnoreCase("Robot")) {
					characters.add(new Robot(line[1], Integer.parseInt(line[2]), line[3], Integer.parseInt(line[4])));

					// else if statement to read Animal and access Animal parameter from test.txt
					// file
				} else if (line[0].equalsIgnoreCase("Animal")) {
					characters.add(new Animal(line[1], Integer.parseInt(line[2]), line[3], Integer.parseInt(line[4])));

					// else the program will stop
				} else
					break;
			}
			// catch block
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		// creates char2.txt
		try {
			File myObj = new File("char2.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		// write to new file
		FileWriter fw;
		try {
			fw = new FileWriter("char2.txt");

			for (Character character : characters) {
				
				refill(character);
				
				if(character instanceof Human) {
					Human h = (Human)character;
					fw.write("Human" + ";" + h.getName() + ";" + h.getStrength() + ";" + h.getWeapon() + ";" + h.getMagicAmount()+"\n");
				}
				else if(character instanceof Robot) {
					Robot h = (Robot)character;
					fw.write("Robot" + ";" + h.getName() + ";" + h.getStrength() + ";" + h.getWeapon() + ";" + h.getMagicAmount()+"\n");
				}
				else if(character instanceof Animal) {
					Animal h = (Animal)character;
					fw.write("Animal" + ";" + h.getName() + ";" + h.getStrength() + ";" + h.getWeapon() + ";" + h.getMagicAmount()+"\n");
				}
			
			}

			System.out.println("Writing successful");
			// close the file
			fw.close();
		} catch (IOException e) {
			// catch block
			e.printStackTrace();
		}

	}
	static void refill(Character character) {
		
		character.setStrength(18);
	}

}
