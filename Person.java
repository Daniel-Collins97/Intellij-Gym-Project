/**
 * Holds code for creating new Person Object. Is subclassed by Member, Student Member, Premium Member, and Trainer
 */

public abstract class Person {

    private String email;
    private String name;
    private String address;
    private String gender;

    public Person() {
    }

    /**
     * get Email of Person
     * @return Person's Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the Email of Person
     * @param email - User Input used for Email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the Person's Name
     * @return Person's Name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets Person's Name
     * @param name - User Input used for Person's Name
     */
    public void setName(String name) {
        int maxLength = 30;
        if (name.length() > maxLength) {
            name = name.substring(0, maxLength);
        }
        this.name  = name;
    }

    /**
     * Gets Person's Address
     * @return Person's Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets Person's Address
     * @param address - User Input use for Address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets Person's Gender
     * @return - Person's Gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets Person's Gender
     * @param gender - User Input used for Gender
     */
    public void setGender(String gender) {
        if ((gender.equals("m")) || (gender.equals("M")) || (gender.equals("f")) || (gender.equals("F")) || (gender.equals("Female")) || (gender.equals("female")) || (gender.equals("Male")) || (gender.equals("male"))) {
            this.gender = gender;
        } else {
            this.gender = "Unspecified";
        }
    }

    /**
     * Creates new Person Object
     * @param email - User Input used for Email
     * @param name  -User Input used for Name
     * @param address - User Input used for Address
     * @param gender - User Input used for Gender
     */
    public Person(String email, String name, String address, String gender) {
        this.setEmail(email);
        this.setName(name);
        this.setAddress(address);
        this.setGender(gender);
    }

    /**
     * Converts Person's Data to user friendly format
     * @return Person's data in user friendly format using toString() method
     */
    public String toString() {
        return "Name: " + name
                + ", Address: " + address
                + ", Email: " + email
                + ", Gender: " + gender;
    }
}
