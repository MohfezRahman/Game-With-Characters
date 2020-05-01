/* Class:Human
 * *@author Mohfez Rahman * 
 * @version 1.0 
 * * Course: ITEC 2150 Spring 2020 
 * * Written: Feb 11, 2020 * 
 * * This class – now describe what the class
 * does: This program is This program has attributes of Human class, by using the 
 * parent class Character's attributes and Human's attributes then 
 * display the output by using toString to the main class.
 */
public class Human extends Character {

	private String weapon;
	private int magicAmount;

	/// default constructor
	public Human() {
		super("", 0);
		magicAmount = 0;
		weapon = "Sword";
	}

	/**
	 * @param weapon
	 * @param magicAmount
	 */
	public Human(String name, int strength, String weapon, int magicAmount) {
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

		// if statement to check the weapon for Human
		if (weapon.equalsIgnoreCase("Sword") || weapon.equalsIgnoreCase("Dagger")) {
			this.weapon = weapon;

			// otherwise invalid
		} else {
			System.out.println("Error!!!...Invalid input. Sword will be the default weapon for Human.");
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

		// if statement to check the magicPower for Human
		if (magicAmount >= 0 && magicAmount <= 50) {
			this.magicAmount = magicAmount;

			// otherwise invalid
		} else {
			System.out.println("Error!!!...Invalid input. '0' will be the default Magic Power for Human.");

		}
	}

	@Override
	public String toString() {
		return "Human  Weapon = " + weapon + ",  Magic Amount = " + magicAmount + ", " + super.toString();
	}

}
