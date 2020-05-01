/* Class:Animal
 * *@author Mohfez Rahman * 
 * @version 1.0 
 * * Course: ITEC 2150 Spring 2020 
 * * Written: Feb 11, 2020 * 
 * * This class – now describe what the class
 * does: This program has attributes of Animal class, by using the 
 * parent class Character's attributes and Animal's attributes then 
 * display the output by using toString to the main class.
 */
public class Animal extends Character {
	private String weapon;
	private int magicAmount;

	// default constructor
	public Animal() {
		super("", 0);
		magicAmount = 100;
		weapon = "Horn";
	}

	/**
	 * @param weapon
	 * @param magicAmount
	 */
	public Animal(String name, int strength, String weapon, int magicAmount) {
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

		// if statement to check the weapon for Animal
		if (weapon.equalsIgnoreCase("Horn") || weapon.equalsIgnoreCase("Charm")) {
			this.weapon = weapon;

			// otherwise invalid
		} else {
			System.out.println("Error!!!...Invalid input. Horn will be the default weapon for Animal.");

		}
	}

	/**
	 * @return get the magicAmount
	 */
	public int getMagicAmount() {
		return magicAmount;
	}

	/**
	 * @param magicAmount the magicAmount to set
	 */
	public void setMagicAmount(int magicAmount) {

		// if statement to check the magicPower for Animal
		if ((magicAmount >= 100 && magicAmount <= 500)) {
			this.magicAmount = magicAmount;
		}
		// otherwise invalid
		else {
			System.out.println("Error!!!...Invalid input. '100' will be the default Magic Power for Animal.");

		}
	}

	@Override
	public String toString() {
		return "Animal Weapon = " + weapon + ",  Magic Amount = " + magicAmount + ", " + super.toString() + "";
	}

}
