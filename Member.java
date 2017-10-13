/**
 * Holds extra code for the Member Class, Subclass of Person
 */

import java.util.*;

public abstract class Member extends Person {
	
	private double height; 						//in meters
	private float startingWeight;  		 		//in kg
	private String chosenPackage;
	private HashMap <Date, Assessment> assessments = new HashMap<Date, Assessment> ();
	private  String BMIcategory;

	/**
	 * Sets a new Member using user input for parameters
	 * @param name - User Input used for Name
	 * @param email - User Input used for Email
	 * @param address - User Input used for Address
	 * @param gender - User Input used for Gender
	 * @param height - User Input used for Height
	 * @param startingWeight - User Input used for Weight
	 * @param chosenPackage - User Input used for Chosen Package
	 */
	public Member(String name, String email, String address, String gender, double height, float startingWeight, String chosenPackage) {
		super(email, name, address, gender);
		this.setHeight(height);
		this.setStartingWeight(startingWeight);
		this.setChosenPackage(chosenPackage);
		HashMap<Date, Assessment> assessments = new HashMap<>();
		this.setBMIcategory();
	}

	public Member() {

	}


	/**
	 * Gets the Height Measurement
	 * @return height Measurement
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Sets the Height Measurement
	 * @param height - User Input used for height measurement
	 */
	public void setHeight(double height) {
		if((height >=1) && (height <= 3))
		{
			this.height = height;
		}
		else
		{
			System.out.println("Error: Height is measured in Meters and must be between 1 and 3 meters inclusive");
		}
	}

	/**
	 * Gets the Weight Measurement
	 * @return Weight Measurement
	 */
	public float getStartingWeight() {
		return startingWeight;
	}

	/**
	 * Sets the Weight Measurement
	 * @param startingWeight - User Input used for weight measurement
	 */
	public void setStartingWeight(float startingWeight) {
		if((startingWeight >= 35) && (startingWeight <=250))
		{
			this.startingWeight = startingWeight;
		}
		else
		{
			System.out.println("Error: Weight is measured in Kg and must be between 35 and 250 inclusive");
		}
	}

	/**
	 * Gets the Package chosen by Member
	 * @return Package chosen by Member
	 */
	public String getChosenPackage() {
		return chosenPackage;
	}

	/**
	 * Sets the package chosen by Member
	 * @param chosenPackage - User chosen package
	 */
	public void setChosenPackage(String chosenPackage) {
		this.chosenPackage = chosenPackage;
	}


	/**
	 * Calculates the BMI of Member
	 * @return BMI of Member
	 */
	public double calculateBMI () {
		double BMI = this.getStartingWeight() / (height * height);
		return BMI;

	}

	public String getBMIcategory() {
		return BMIcategory;
	}

	/**
	 * Determines what Category the Member is in Based on their BMI
	 *
	 */
	public void setBMIcategory () {
		if(calculateBMI() < 15)
		{
			this.BMIcategory = "VERY SEVERELY UNDERWEIGHT";
		}
		else if ((calculateBMI() >= 15) && (calculateBMI() < 16))
		{
			this.BMIcategory = "SEVERELY UNDERWEIGHT";
		}
		else if ((calculateBMI() >= 16) && (calculateBMI() < 18.5))
		{
			this.BMIcategory = "UNDERWEIGHT";
		}
		else if ((calculateBMI() >= 18.5) && (calculateBMI() < 25))
		{
			this.BMIcategory = "NORMAL";
		}
		else if ((calculateBMI() >= 25) && (calculateBMI() < 30))
		{
			this.BMIcategory = "OVERWEIGHT";
		}
		else if ((calculateBMI() >= 30) && (calculateBMI() < 35))
		{
			this.BMIcategory = "MODERATELY OBESE";
		}
		else if ((calculateBMI() >= 35) && (calculateBMI() < 40))
		{
			this.BMIcategory = "SEVERELY OBESE";
		}
		else if (calculateBMI() >= 40)
		{
			this.BMIcategory = "VERY SEVERELY OBESE";
		}
		this.BMIcategory = null;
	}

	/**
	 * Gets the last assessment of Member
	 * @return Last Assessment of Member
	 */
	public Assessment latestAssessment() {
		//Returns the latest assessment based on last entry (by calendar date).
		return getAssessments().get(sortedAssessmentDates().last());
	}

	/**
	 * Sorted Array List of Assessments
	 * @return Sorted Array List of Assessments
	 */
	public SortedSet<Date> sortedAssessmentDates() {
		//Returns the assessment dates sorted in date order.
		 return new TreeSet<Date>(getAssessments().keySet());
	}

	/**
	 * Gets the Assessments of Member
	 * @return Assessments of Member
	 */
	public HashMap <Date, Assessment> getAssessments() {
		return assessments;
	}

	/**
	 * Converts Members Data to user Friendly format
	 * @return Members Data to user friendly format using toString() Method
	 */
	@Override
	public String toString() {
		return super.toString() + ", height=" + height +
				", startingWeight=" + startingWeight +
				", chosenPackage='" + chosenPackage + '\'' +
				", assessments=" + assessments +
				", BMI Category=" + BMIcategory;
	}
}
