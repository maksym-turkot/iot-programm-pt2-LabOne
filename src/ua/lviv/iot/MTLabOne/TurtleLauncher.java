/* 
 * IoT-2019-MaxTur-LabOne 1.00 2020/01/24
 * 
 * This software is a confidential information 
 * and an intellectual property of Maksym Turkot.
 */
package ua.lviv.iot.MTLabOne;

/**
 * The TurtleLauncher class serves as an executional hub,
 * where all key actions such as object creation and parameter
 * setting take place.
 * 
 * @version 1.00 24 Jan 2020
 * @author Maksym Turkot
 */
public class TurtleLauncher {
	/*
	 * This class involves two methods: main() and makeTurtleArray().
	 * 
	 * The makeTurtleArray completes tasks 14 and 15:
	 * creates and outputs four objects.
	 * 
	 * The main() method creates objects using different constructors
	 * and outputs their fields.
	 * 
	 * Also, setLifespanInYears(), printStaticLifespanInYears(), and
	 * printLifespanInYears() are called from the Turtle class in their
	 * own legal ways.
	 * 
	 * Lastly, the makeTurtleArray() is called.
	 */
	
	/** 
	 * These next two fields are completely useless. They were created
	 * because the fourth subtask of the Lab1 Task directed to do so: 
	 * "create two protected fields in each class".
	 */
	@Deprecated
	protected String causeTaskFourSaidSo;
	@Deprecated
	protected int uselessVariable;

	/**
	 * The makeTurtleArray() method executes tasks 14 and 15:
	 * by creating an array of Turtle objects.
	 */
	public static void makeTurtleArray() {
		/*
		 * Utilizes a do-while construction to create four objects
		 * and a for-each one to output them.
		 */

		// Getting of the constant variable from Turtle class
		int NUMBER_OF_OBJECTS = Turtle.NUMBER_OF_OBJECTS;
		
		// Declaration of an array
		Turtle[] arrayOfTurtles = new Turtle[NUMBER_OF_OBJECTS];
		int arrayIndex = 0;

		// Creation of objects
		do {
			arrayOfTurtles[arrayIndex] = new Turtle();
			arrayIndex++;
		} while (arrayIndex < NUMBER_OF_OBJECTS);
		
		// Output of objects
		for (Turtle outputIndex : arrayOfTurtles) {
			outputIndex.toString();
			System.out.println(outputIndex.toString());
		}
	}

	/** 
	 * The main() method. All output commands as well as objects'
	 * generations take place there.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Operations outline:
		 * 
		 * Static value of lifespanInYears is set;
		 * Four objects created with different constructors;
		 * Output of objects' fields;
		 * Call of methods to output static lifespanInYears;
		 * Call of the makeTurtleArray method.
		 */
		
		// Set static value for setLifespanInYears
		Turtle.setLifespanInYears(69);

		// Creation of four objects follows
		Turtle DefaultTurtle = new Turtle();

		Turtle PelomedusaTurtle = new Turtle("Pelomedusa subrufa", 30.2, 400, 'M');

		Turtle CarettochelysTurtle = new Turtle("New Guinea",
				"Carettochelys insculpta", 35.0, 350, 'F', true);

		Turtle DermatemysTurtle = new Turtle("Central America", false, 
				"Dermatemys mawii", 29.2, 22000, 'M', true);
		
		/* Output streams */
		System.out.println("DefaultTurtle:       " + DefaultTurtle);
		System.out.println("PelomedusaTurtle:    " + PelomedusaTurtle);
		System.out.println("CarettochelysTurtle: " + CarettochelysTurtle);
		System.out.println("DermatemysTurtle:    " + DermatemysTurtle);

		System.out.println("");
		System.out.println("*** STATIC FIELD OUTPUT ***");
		System.out.println("");

		// Use of static method
		System.out.println("Static method:     "
			+ Turtle.printStaticLifespanInYears());

		// Use of non-static method via DefaultTurtle object
		System.out.println("Non-static method: " 
			+ DefaultTurtle.printLifespanInYears());

		System.out.println("");
		System.out.println("*** OBJECT ARRAY OUTPUT ***");
		System.out.println("");

		//Execution of subtasks 14 and 15
		makeTurtleArray();
	}

}
