/**
 * Holds the extra code for the Trainer Class, Subclass of Person
 */

import java.util.ArrayList;

public class Trainer extends Person {

    private String speciality;
    private ArrayList<Assessment> assessments = new ArrayList<>();
    private ArrayList<Member> clients = new ArrayList<>();

    public Trainer() {

    }

    /**
     * Gets the Trainers Speciality
     * @return Trainers Speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * Sets the Trainers Speciality
     * @param speciality - User Input used for Speciality
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * Creates the new Trainer Object
     * @param name - User Input used for Name
     * @param email - User Input used for Email
     * @param address - User Input used for Address
     * @param gender - User Input used for Gender
     * @param speciality - User Input used for Speciality
     */
    public Trainer(String name, String email, String address, String gender, String speciality) {
        super(email, name, address, gender);
        this.speciality = speciality;
    }

    /**
     * Gets the Clients Array List
     * @return Clients Array List
     */
    public ArrayList<Member> getClients() {
        return clients;
    }

    /**
     * Sets the Client Array List using Member Objects
     * @param clients - Clients to be used in Array List
     */
    public void setClients(ArrayList<Member> clients) {
        this.clients = clients;
    }

    /**
     * Gets the Clients Assessments
     * @return Clients Assessments
     */
    public ArrayList<Assessment> getAssessments() {
        return assessments;
    }

    /**
     * Sets the Assessments Array List using Assessment Objects
     * @param assessments - Assessments to be used in Array List
     */
    public void setAssessments(ArrayList<Assessment> assessments) {
        this.assessments = assessments;
    }

    /**
     * Adds an assessment to the Assessments Array List
     * @param assessment - Assessment to be added to array list
     */
    public void addAssessment(Assessment assessment) {
        getAssessments().add(assessment);
    }

    /**
     * Converts Trainers data to user friendly format
     * @return Trainers Data in User Friendly Format
     */
    @Override
    public String toString() {
        return super.toString() + ", Speciality: " + getSpeciality();
    }
}
