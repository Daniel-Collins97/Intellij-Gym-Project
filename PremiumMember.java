/**
 * Holds extra Code for Premium Member
 */

public class PremiumMember extends Member 
{

	/**
	 * Creates new Premium Member Object
	 * @param name - User Input used for Name
	 * @param email - User Input used for Email
	 * @param address - User Input used for Address
	 * @param gender - User Input used for Gender
	 * @param height - User Input used for Height
	 * @param startingWeight - User Input used for Weight
	 */
	public PremiumMember(String name, String email, String address, String gender, double height, float startingWeight) {
		super(name, email, address, gender, height, startingWeight, "Premium");
	}

	//blank constructor required for xStream import
	public PremiumMember() {
		super();
	}

	/**
	 * Prints Data to User Friendly format
	 * @return Super toString() method
	 */
	@Override
	public String toString() {
		return super.toString();
	}
}
