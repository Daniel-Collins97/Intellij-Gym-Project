/**
 * Holds Extra Code for Student Member
 */

public class StudentMember extends Member {
	
	private int studentID;
	private String collegeName;

	/**
	 * Creates New Student Member Object
	 * @param name - User Input used for Name
	 * @param email - User Input used for Email
	 * @param address - User Input used for Address
	 * @param gender - User Input used for Gender
	 * @param height - User Input used for Height
	 * @param startingWeight - User Input used for Weight
	 * @param studentID - User Input used for StudentID
	 * @param collegeName - User Input used for College Name
	 */
	public StudentMember(String name, String email, String address, String gender, double height, float startingWeight, int studentID, String chosenPackage, String collegeName) {
		super(name, email, address, gender, height, startingWeight, chosenPackage);
		this.studentID = studentID;
		this.collegeName = collegeName;
	}

	//blank constructor required for xStream import
	public StudentMember(){
		super();
	}


	/**
	 * Adds StudentID and CollegeName to user Friendly format
	 * @return Super toString() method + StudentID and CollegeName
	 */
	@Override
	public String toString() {
		return super.toString() +
				", studentID=" + studentID +
				", collegeName='" + collegeName;
	}
}
