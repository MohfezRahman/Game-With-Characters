/* Class:Car
 * *@author Mohfez Rahman * 
 * @version 1.0 
 * * Course: ITEC 2150 Spring 2020 
 * * Written: Feb 11, 2020 * 
 * * This class – now describe what the class
 * does: This program is This program has attributes of Character class, which
 * will be using the child classes of Human, Robot, Animal's attributes then 
 * display the output by using toString to the main class.
 */
public class Character {
	private String name;
	private int strength;

	public Character() {
		strength = 15;
		name = "TBD";
	}

	/**
	 * @param name
	 * @param strength
	 */
	public Character(String name, int strength) {
		this.name = name;
		this.strength = strength;
	}

	/**
	 * @return get the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return get the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {

		// if statement to check the strength for Character
		if (strength >= 0 && strength <= 18) {
			this.strength = strength;
		}

		// otherwise invalid
		else {
			System.out.println("Error!!!...Invalid input. 15 will be the default Strength.");

		}

	}

	// method that is out of the range so, no return statement in this
	public void hit(int strengthPoint) {
		this.strength -= strengthPoint;
	}

	// method to refillStrength
	public void refillStrength() {
		this.strength += 5;
	}

	@Override
	public String toString() {
		return "Character name = " + name + ",   Strength = " + strength + "";
	}

}
