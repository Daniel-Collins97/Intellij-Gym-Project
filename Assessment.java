/**
 * Has the code for creating a new assessment
 */
public class Assessment
{
	private String dateAdded;
	private float weight;
	private float chest;
	private float thigh;
	private float upperArm;
	private float waist;
	private float hips;
	private String comment;
	private Trainer trainer;
	
	public Assessment(String dateAdded, float weight, float chest, float thigh, float upperArm, float waist, float hips, String comment, Trainer trainer)
	{
		this.setDateAdded(dateAdded);
		this.setWeight(weight);
		this.setChest(chest);
		this.setThigh(thigh);
		this.setUpperArm(upperArm);
		this.setWaist(waist);
		this.setHips(hips);
		this.setComment(comment);
		this.setTrainer(trainer);
	}

	//blank constructor required for xStream import
	public Assessment(){
		super();
	}

	/**
	 * Gets the entered dateAdded
	 * @return the dateAdded
	 */
	public String getDateAdded() {
		return dateAdded;
	}

	/**
	 * Sets the dateAdded
	 * @param dateAdded - User input used for dateAdded
	 */
	public void setDateAdded(String dateAdded) {
		int maxLength = 10;
		if (dateAdded.length() > maxLength) {
			dateAdded = dateAdded.substring(0, maxLength);
		}
		this.dateAdded  = dateAdded;
	}

	/**
	 * Gtes the Chest Measurement
	 * @return chest measurement
	 */
	public float getChest() {
		return chest;
	}

	/**
	 * Sets the chest measurement
	 * @param chest - User input used for chest measurement
	 */
	public void setChest(float chest) {
		this.chest = chest;
	}

	/**
	 * Gets thigh Measurement
	 * @return thigh measurement
	 */
	public float getThigh() {
		return thigh;
	}

	/**
	 * Sets the thigh Measurement
	 * @param thigh - User input used for Thigh Measurement
	 */
	public void setThigh(float thigh) {
		this.thigh = thigh;
	}

	/**
	 * Gets upperArm Measurement
	 * @return upperArm Measurement
	 */
	public float getUpperArm() {
		return upperArm;
	}

	/**
	 * Sets upperArm Measurement
	 * @param upperArm - User Input used for upperArm Measurement
	 */
	public void setUpperArm(float upperArm) {
		this.upperArm = upperArm;
	}

	/**
	 * Gets Waist measurement
	 * @return waist Measurement
	 */
	public float getWaist() {
		return waist;
	}

	/**
	 * Sets the Waist Measurement
	 * @param waist - User Input used for waist Measurement
	 */
	public void setWaist(float waist) {
		this.waist = waist;
	}

	/**
	 * Gets the hips measurement
	 * @return hips measurement
	 */
	public float getHips() {
		return hips;
	}

	/**
	 * Sets the hips measurement
	 * @param hips - User Input used for hips measurement
	 */
	public void setHips(float hips) {
		this.hips = hips;
	}

	/**
	 * Gets comment entered by Trainer
	 * @return comment entered by Trainer
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets comment entered by Trainer
	 * @param comment - User Input used for comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * Gets Trainer associated with Client
	 * @return Trainer associated with Client
	 */
	public Trainer getTrainer() {
		return trainer;
	}

	/**
	 * Sets Trainer Associated with Client
	 * @param trainer - Trainer associated with Client
	 */
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	/**
	 * Gets Weight Measurement
	 * @return Weight Measurement
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * Sets Weight Measurement
	 * @param weight - User Input Used for Weight Measurement
	 */
	public void setWeight(float weight) {
		if((weight >= 35) && (weight <= 250)) {
			this.weight = weight;
		}
		else {
			this.weight = 00;
		}
	}

	public String toString() {
		return "Date added: " + getDateAdded()
				+ ", Weight: " + getWeight()
				+ ", Chest: " + getChest()
				+ ", Thigh: " + getThigh()
				+ ", Upper Arm: " + getUpperArm()
				+ ", Waist: " + getWaist()
				+ ", Hips: " + getHips()
				+ ", Comment: " + getComment();
	}

}
