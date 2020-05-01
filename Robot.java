/* Class:Robot
 * *@author Mohfez Rahman * 
 * @version 1.0 
 * * Course: ITEC 2150 Spring 2020 
 * * Written: Feb 11, 2020 * 
 * * This class – now describe what the class
 * does: This program is This program has attributes of Robot class, by using the 
 * parent class Character's attributes and Robot's attributes then 
 * display the output by using toString to the main class.
 */
public class Robot extends Character {
	private String weapon;
	private int magicAmount;

	// default constructor
	public Robot() {
		super("", 0);
		magicAmount = 0;
		weapon = "Fire";
	}

	/**
	 * @param weapon
	 * @param magicAmount
	 */
	public Robot(String name, int strength, String weapon, int magicAmount) {
		super(name, strength);
		this.weapon = weapon;
		this.magicAmount = magicAmount;
	}

	/**
	 * @return get the weapon
	 */
	public String getWeapon() {
		return weapon;
	}

	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(String weapon) {

		// if statement to check the weapon for Robot
		if (weapon.equalsIgnoreCase("Fire") || weapon.equalsIgnoreCase("Ice")) {
			this.weapon = weapon;

			// otherwise invalid
		} else {
			System.out.println("Error!!!...Invalid input. Fire will be the default weapon for Robot.");
		}
	}

	/**
	 * @return the magicAmount
	 */
	public int getMagicAmount() {
		return magicAmount;
	}

	/**
	 * @param magicAmount the magicAmount to set
	 */
	public void setMagicAmount(int magicAmount) {

		// if statement to check the magicPower for Robot
		if (magicAmount >= 0 && magicAmount <= 100) {
			this.magicAmount = magicAmount;

			// otherwise invalid
		} else {
			System.out.println("Error!!!...Invalid input. '0' will be the default Magic Power for Robot.");

		}
	}

	@Override
	public String toString() {
		return "Robot  Weapon = " + weapon + ",   Magic Amount = " + magicAmount + ", " + " " + super.toString();
	}

}
