/* 
 * IoT-2019-MaxTur-LabOne 1.00 2020/01/24
 * 
 * This software is a confidential information 
 * and an intellectual property of Maksym Turkot.
 */
package ua.lviv.iot.MTLabOne;

/** 
 * The Turtle class defines and contains all fields which are used to
 * describe various subjects of turtles; constructors, which 
 * are used to create objects in the TurtleLauncher class; and
 * methods, which grant access to those fields and return the
 * variable values.
 * 
 * @version 1.00 24 Jan 2020
 * @author Maksym Turkot
 */
public class Turtle {
	/* 
	 * This class is where all important fields and most methods
	 * are initialized and defined.
	 * 
	 * It contains all fields corresponding to the task
	 * (a static field, two private fields, 
	 * three given private fields, and two additional private fields);
	 * 
	 * constructors (three with various parameters and a default one);
	 * 
	 * methods, including getters/setters, toString, static variable
	 * output ones, and a values reseter.
	 */
	
	/**
	 * A constant, used in the makeTurtleArray() method in 
	 * TurtleLauncher class.
	 */
	public static final int NUMBER_OF_OBJECTS = 4;
	
	/** 
	 * Static field which will be returned by a static and non-static methods 
	 * printStaticLifespanInYears() and printLifespanInYears() respectively.
	 */
	private static int lifespanInYears;
	
	/**Two protected fields */
	protected String habitatRegion;
	protected boolean landDweller;
	
	/**Three given + two additional private fields */
	private String scientificName;
	private double swimmingSpeedInKmPerHr;
	private int massInGrams;
	private char gender;
	private boolean threatened;

	/** Default constructor */
	public Turtle() {
		//returns default values
		this(null, false, null, 0.0d, 0, '\u0000', false);
	}
	
	/** 
	 * Constructor with six parameters
	 * 
	 * @param habitatRegion
	 * @param landDweller
	 * @param scientificName
	 * @param swimmingSpeedInKmPerHr
	 * @param massInGrams
	 * @param gender
	 * @param threatened
	 */
	public Turtle(String habitatRegion, boolean landDweller, String scientificName,
			double swimmingSpeedInKmPerHr, int massInGrams, char gender,
			boolean threatened) {
		//Sets the values for future use by objects
		this.habitatRegion = habitatRegion;
		this.landDweller = landDweller;
		this.scientificName = scientificName;
		this.swimmingSpeedInKmPerHr = swimmingSpeedInKmPerHr;
		this.massInGrams = massInGrams;
		this.gender = gender;
		this.threatened = threatened;
	}
	
	/** 
	 * Constructor with five parameters 
	 * 
	 * @param habitatRegion
	 * @param scientificName
	 * @param swimmingSpeedInKmPerHr
	 * @param massInGrams
	 * @param gender
	 * @param threatened
	 */
	public Turtle(String habitatRegion, String scientificName,
			double swimmingSpeedInKmPerHr, int massInGrams, char gender,
			boolean threatened) {
		// Calls the constructor with six parameters (above)
		this(habitatRegion, false, scientificName, swimmingSpeedInKmPerHr,
				massInGrams, gender, threatened);
	}

	/** 
	 * Constructor with four parameters
	 * 
	 * @param scientificName
	 * @param swimmingSpeedInKmPerHr
	 * @param massInGrams
	 * @param gender
	 */
	public Turtle(String scientificName, double swimmingSpeedInKmPerHr, 
			int massInGrams, char gender) {
		//Calls the constructor with five parameters (above)
		this(null, scientificName, swimmingSpeedInKmPerHr, massInGrams, gender, false);
	}
	
	/* 
	 * Standard setters/getters for 
	 * String scientificName, double swimmingSpeedInKmPerHr,
	 * int massInGrams, and boolean threatened
	 * 
	 * Ordered in setter/getter pattern.
	 */
	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public double getSwimmingSpeedInKmPerHr() {
		return swimmingSpeedInKmPerHr;
	}

	public void setSwimmingSpeedInKmPerHr(double swimmingSpeedInKmPerHr) {
		this.swimmingSpeedInKmPerHr = swimmingSpeedInKmPerHr;
	}

	public int getMassInGrams() {
		return massInGrams;
	}

	public void setMassInGrams(int massInGrams) {
		this.massInGrams = massInGrams;
	}

	public boolean isThreatened() {
		return threatened;
	}

	public void setThreatened(boolean threatened) {
		this.threatened = threatened;
	}

	/**
	 * A Standard toString() method. Is called by default by
	 * the object upon its use in the main() method 
	 * in the TurtleLauncher class.
	 */
	@Override
	public String toString() {
		// Returns a string with all non-static variables and their values outlined
		return "Turtle [habitatRegion=" + habitatRegion + ", landDweller="
				+ landDweller + ", scientificName=" + scientificName
				+ ", swimmingSpeedInKmPerHr=" + swimmingSpeedInKmPerHr
				+ ", massInGrams=" + massInGrams + ", gender=" + gender 
				+ ", threatened=" + threatened + "]";
	}
	
	/** Non-static method which returns a static variable's value */
	public int printLifespanInYears() {
		return lifespanInYears;
	}
	
	/** Static method which returns a static variable's value */
	public static int printStaticLifespanInYears() {
		return lifespanInYears;
	}
	
	/** 
	 * Static method used to get encapsulated value of the 
	 * lifeSpanInYears parameter.
	 * 
	 * @param lifespanInYears
	 */
	public static void setLifespanInYears(int lifespanInYears) {
		Turtle.lifespanInYears = lifespanInYears;
	}
	
	/** 
	 * A method that can be used to reset the values of all fields.
	 * 
	 * @param lifespanInYears
	 * @param habitatRegion
	 * @param landDweller
	 * @param scientificName
	 * @param swimmingSpeedInKmPerHr
	 * @param massInGrams
	 * @param gender
	 * @param threatened
	 */
	public void resetValues(int lifespanInYears, String habitatRegion, boolean landDweller,
			String scientificName, double swimmingSpeedInKmPerHr, int massInGrams,
			char gender, boolean threatened) {
		// Sets the values for future use
		Turtle.lifespanInYears = lifespanInYears;
		this.habitatRegion = habitatRegion;
		this.landDweller = landDweller;
		this.scientificName = scientificName;
		this.swimmingSpeedInKmPerHr = swimmingSpeedInKmPerHr;
		this.massInGrams = massInGrams;
		this.gender = gender;
		this.threatened = threatened;
	}

}
