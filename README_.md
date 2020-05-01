# Game-With-Characters


In this program we are going to utilize multiple classes to demonstrate inheritance and polymorphism.   We will be creating a base class for our game character.  The base class will be named Character.  We will have derived classes (classes that inherit from Character) of Human, Robot, and Animal. ( create character class)

Character will have the following attributes:
•	Name 
•	strength – range 0 to 18
You will need to provide a default constructor that initializes these attributes as follows:
•	strength – 15
•	Name – “TBD”
You will need to provide a getter and setter for each of these variables.   When the attribute has a range, the setter method should not allow a value outside that range.  For example, if the setStrength(points) is called with points = -1, the attribute should NOT be changed.  The variables should be private.  Please provide a toString method which will return a String containing the values in these variables.

Character will also have a method public void hit(int strengthPoints) that deletes strengthPoints from strength.  A second method public void refillStrength()  will add 5 to strength.

In your Human, Robot and Animal classes you will need variables to hold the weapon, and magic values.  Values will be as follow:
	Weapon	Magic Amount
Human	Sword or Dagger	0-50
Robot	Fire or Ice	0-100
Animal	Horn or Charm	100-500
You will need to provide getters and setters for each of these private variables. Again, they should not allow values not in the table.  You also need to provide a constructor for all of the variables, both the ones in the derived class and the ones in the base class.  
Please provide a toString() method that returns the type of character, the name, the weapon, the magic amount and the strength, call the toString() from the base class.

Create a driver class that allows the user to create a random set of characters.  These should be of type Human, Robot and Animal.  These should be stored in an ArrayList of Character.    You should prompt the user for entries and create three characters of each class type and store them in the ArrayList.  Once you have added the three characters. Print the characters from the ArrayList using your toString methods.

Then, refill one character’s (your choice) strength and hit another with a 5 point hit.  Then reprint the character info.






