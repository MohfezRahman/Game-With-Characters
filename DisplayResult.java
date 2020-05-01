import java.util.ArrayList;

public class DisplayResult {
	
	//main method
	public static void main(String[] args) {
		System.out.println();
		Human human1 = new Human("Bob", 10, "Sword", 40);
		Robot robot1 = new Robot("GERTY", 20, "Fire", 70);
		Animal animal1 = new Animal("Lion", 100, "Charm", 300);
		
		//ArrayList for Character
		ArrayList<Character> characters = new ArrayList<Character>();
		characters.add(human1);
		characters.add(robot1);
		characters.add(animal1);
		
		//output by using toString
		System.out.println(human1.toString());
		System.out.println(robot1.toString());
		System.out.println(animal1.toString());
	}

}
