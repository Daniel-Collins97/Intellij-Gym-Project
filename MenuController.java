/**
 * Controls the output displayed to user
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuController {

    private Scanner input;
    private GymAPI gym = new GymAPI();

    /**
     * Starts the menu controller
     */
    private MenuController() {
        input = new Scanner(System.in);

        try {
            gym.loadGym();
        } catch (Exception e1) {
            System.out.println("Error Reading from file !" + e1);
        }
    }

    public static void main(String args[]) {
        MenuController app = new MenuController();
        app.runMenu();
    }

    /**
     * @return option selected
     */
    private int startMenu() {
        System.out.println("		    WELCOME				  ");
        System.out.println("                                  ");
        System.out.println("----------------------------------");
        System.out.println("1) Login");
        System.out.println("2) Register");
        System.out.println("----------------------------------");
        System.out.println("0) Exit");
        System.out.print("==>> ");
        int option = 0;
        try {
            option = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input was not a number please try again");
            //need this to consume the incorrect input
            input.next();
            startMenu();
        }
        if ((option >= 0) && (option <= 2)) {
            return option;
        } else {
            System.out.println("Invalid Index selected. Please Try again");
            return startMenu();
        }
    }

    /**
     * Prints Login menu to Console
     *
     * @return email entered to console
     */
    private String loginMenu() {
        System.out.println("		    Please enter your email				  ");
        System.out.println("                                  ");
        System.out.println("----------------------------------");
        System.out.println("Enter your email address");
        System.out.println("----------------------------------");
        System.out.print("==>> ");
        input.nextLine();
        String email = "";
        while(email.equals("")) {
            try {
                email = input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input was not a String please try again");
                //need this to consume the incorrect input
                input.next();
                loginMenu();
            }
        }
        return email;
    }

    /**
     * Prints register Menu to the Console
     *
     * @return option selected
     */
    private int registerMenu() {
        System.out.println("                WELCOME             ");
        System.out.println("Do you wish to register as a.....");
        System.out.println("1) Member");
        System.out.println("2) Trainer");
        System.out.println("---------------------------------");
        System.out.println("0) Exit");
        System.out.print("==>> ");
        int option2 = 0;
        try {
            option2 = input.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("Input was not a number please try again");
            input.next();
            registerMenu();
        }
        if ((option2 >= 0) && (option2 <= 2)) {
            return option2;
        } else {
            System.out.println("Invalid Index selected. Please Try again");
            return registerMenu();
        }
    }

    //assessment creation -> copy createMember(), for date new Date() or new Date(new SimpleDateFormat(yyyy-MM-dd).parse(2016-02-13)

    /**
     * Prints Members Menu to Console
     *
     * @return option selected
     */
    private int membersMenu() {
        System.out.println("            WELCOME              ");
        System.out.println("1) View Profile");
        System.out.println("2) Update Profile");
        System.out.println("3) View Progress");
        System.out.println("---------------------------------");
        System.out.println("0) Exit");
        System.out.print("==>> ");
        int option3 = 0;
        try {
            option3 = input.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("Input was not a number please try again");
            input.next();
            membersMenu();
        }
        if ((option3 >= 0) && (option3 <= 3)) {
            return option3;
        } else {
            System.out.println("Invalid Index selected. Please Try again");
            return membersMenu();
        }
    }

    /**
     * Prints Trainers Menu to Console
     *
     * @return option selected
     */
    private int trainersMenu() {
        System.out.println("            WELCOME              ");
        System.out.println("1) Add new Member");
        System.out.println("2) List all Members");
        System.out.println("3) List all Members with Ideal Body weight");
        System.out.println("4) List all members with Specific BMI");
        System.out.println("5) Search for Member by Email");
        System.out.println("6) Add Assessment");
        System.out.println("7) View Sorted Assessments for member");
        System.out.println("---------------------------------");
        System.out.println("0) Exit");
        System.out.print("==>> ");
        int option5 = 0;
        try {
            option5 = input.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("Input was not a number please try again");
            input.next();
            trainersMenu();
        }
        if ((option5 >= 0) && (option5 <= 7)) {
            return option5;
        } else {
            System.out.println("Invalid Index selected. Please Try again");
            return trainersMenu();
        }
    }

    /**
     * Prints Specific BMI menu to Console
     *
     * @return Entered BMI
     */
    private float specificBMI() {
        System.out.println("----------------------------------");
        System.out.println("Please enter your preferred BMI");
        System.out.println("----------------------------------");
        System.out.print("==>>");
        float BMI = 0;
        try {
            BMI = input.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Input was not a number please try again");
            //need this to consume the incorrect input
            input.next();
            specificBMI();
        }
        return BMI;
    }

    /**
     * Prints Search by Email menu to Console
     *
     * @return Entered Email
     */
    private String searchByEmail() {
        System.out.println("----------------------------------");
        System.out.println("Please enter the email of client");
        System.out.println("----------------------------------");
        System.out.print("==>>");
        String email = input.nextLine();
        try {
            email = input.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Input was not a String please try again");
            //need this to consume the incorrect input
            input.next();
            searchByEmail();
        }
        return email;
    }

    /**
     * Prints Members to Console and asks User to select member they wish to add
     *
     * @return selected member
     */
    private int printMembers() {
        for (int i = 0; i < gym.getMembers().size(); i++) {
            System.out.println(i + ")" + gym.getMembers().get(i).getName());
        }
        System.out.println("----------------------------------");
        System.out.println("Please select the member you wish to add");
        System.out.println("----------------------------------");
        System.out.print("==>>");
        int addedMember = 0;
        try {
            addedMember = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input was not a number please try again");
            //need this to consume the incorrect input
            input.next();
            printMembers();
        }
        if (addedMember < gym.getMembers().size()) {
            return addedMember;
        } else {
            System.out.println("Invalid Index selected. Please Try again");
            return printMembers();
        }
    }

    /**
     * Prints the Update Menu
     *
     * @return Option Selected
     */
    private int MembersUpdateMenu() {
        System.out.println("            Update Menu              ");
        System.out.println("1) Update Address");
        System.out.println("2) Update email");
        System.out.println("3) Update Height");
        System.out.println("4) Update Weight");
        System.out.println("---------------------------------");
        System.out.println("0) Exit");
        System.out.print("==>> ");
        int option5 = 0;
        try {
            option5 = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input was not a number please try again");
            input.next();
            MembersUpdateMenu();
        }
        if ((option5 >= 0) && (option5 <= 5)) {
            return option5;
        } else {
            System.out.println("Invalid index Selected. Please try again");
            return MembersUpdateMenu();
        }
    }

    /**
     * Controls the Menus and moves between different menus depending on the user input
     */
    private void runMenu() {
        try {
            int option = startMenu();
            //needed to consume the enter character
            input.nextLine();
            while (option != 0) {
                switch (option) {
                    case 1:
                        String email = loginMenu();
                        if (checkAddressBoolean(email) && checkAddressReturnPerson(email) instanceof Member) {
                            int option3 = membersMenu();
                            switch (option3) {
                                case 1:
                                    System.out.println(checkAddressReturnPerson(email).toString());
                                    break;
                                case 2:
                                    int option4 = MembersUpdateMenu();
                                    switch (option4) {
                                        case 1:
                                            System.out.println("Please enter new address:");
                                            System.out.print("==>> ");
                                            String address = input.nextLine();
                                            checkAddressReturnPerson(email).setAddress(address);
                                            break;
                                        case 2:
                                            System.out.println("Please enter new Email:");
                                            System.out.print("==>> ");
                                            String newEmail = input.nextLine();
                                            checkAddressReturnPerson(email).setEmail(newEmail);
                                            break;
                                        case 3:
                                            System.out.println("Please enter new Height:");
                                            System.out.print("==>> ");
                                            Float height = input.nextFloat();
                                            ((Member) checkAddressReturnPerson(email)).setHeight(height);
                                            break;
                                        case 4:
                                            System.out.println("Please enter new Weight:");
                                            System.out.print("==>>");
                                            Float weight = input.nextFloat();
                                            ((Member) checkAddressReturnPerson(email)).setStartingWeight(weight);
                                            break;
                                    }
                                    break;
                                case 3:
                                    ((Member) checkAddressReturnPerson(email)).toString();
                                    //view progress
                            }
                        } else if (checkAddressBoolean(email) && checkAddressReturnPerson(email) instanceof Trainer) {
                            Trainer trainer = (Trainer) checkAddressReturnPerson(email);
                            int trainerSelection = trainersMenu();
                            switch (trainerSelection) {
                                case 1:
                                    int memberSelection = printMembers();
                                    trainer.getClients().add(gym.getMembers().get(memberSelection));
                                    break;
                                case 2:
                                    for (int i = 0; i < trainer.getClients().size(); i++) {
                                        System.out.println("Member " + i + ")" + trainer.getClients().get(i).toString());
                                    }
                                    break;
                                case 3:
                                    for (int i = 0; i < trainer.getClients().size(); i++) {
                                        if (trainer.getClients().get(i).getBMIcategory() == "NORMAL") {
                                            System.out.println("Member " + i + ")" + trainer.getClients().get(i).toString());
                                        }
                                    }
                                    break;
                                case 4:
                                    Float bmi = specificBMI();
                                    for (int i = 0; i < trainer.getClients().size(); i++) {
                                        if ((trainer.getClients().get(i).calculateBMI() == bmi)) {
                                            System.out.println("Member " + i + ")" + trainer.getClients().get(i).toString());
                                        }
                                    }
                                    break;
                                case 5:
                                    String emailEntered = searchByEmail();
                                    gym.searchMembersByEmail(emailEntered);
                                    break;
                                case 6:
                                    Assessment assessment = createAssessment();
                                    trainer.addAssessment(assessment);
                                    break;
                                case 7:
                                    System.out.println(trainer.getAssessments());
                            }
                        } else {
                            System.out.println("Access Denied: Invalid Email");
                            //System.exit(0);
                        }
                        break;
                    case 2:
                        int option2 = registerMenu();
                        switch (option2) {
                            case 1:
                                Member member = createMember();
                                gym.addMember(member);
                                break;
                            case 2:
                                Trainer trainer = createTrainer();
                                gym.addTrainer(trainer);
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid option entered: " + option);
                        break;
                }


                //pause the program so that the user can read what we just printed to the terminal window
                System.out.println("\nPress any key to continue...");
                input.nextLine();
                input.nextLine();  //this second read is required - bug in Scanner class; a String read is ignored straight after reading an int.

                //display the main menu again
                option = startMenu();
            }

            //the user chose option 0, so exit the program
            System.out.println("Exiting... bye");
            gym.saveGym();
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Error: " + e);
            System.out.println("\nPress any key to continue...");
            input.nextLine();
            input.nextLine();  //this second read is required - bug in Scanner class; a String read is ignored straight after reading an int.

            //display the main menu again
            startMenu();
        }
    }

    /**
     * Prints the Menu for Creating a Member
     *
     * @return if valid input, return the new member object, if invalid, return the menu again
     */
    private Member createMember() {
        try {
            System.out.println("Enter your name; ");
            System.out.print("==>> ");
            input.nextLine();
            String name;
            name = input.nextLine();
            System.out.println("Enter your email; ");
            System.out.print("==>> ");
            String email;
            email = checkAddress(input.nextLine());
            System.out.println("Enter your address; ");
            System.out.print("==>> ");
            String address;
            address = input.nextLine();
            System.out.println("Enter your Gender (Male/Female); ");
            System.out.print("==>> ");
            String gender;
            gender = input.nextLine();
            System.out.println("Enter your Height (in meters); ");
            System.out.print("==>> ");
            input.nextFloat();
            double height;
            height = input.nextDouble();
            System.out.println("Enter your Weight (in KG); ");
            System.out.print("==>> ");
            float startingWeight;
            startingWeight = input.nextFloat();


        System.out.println("Enter your Chosen Package;" +
                "\n1) Premium Member" +
                "\n2) Student Member");
        System.out.println("==>> ");
        int chosenPackage;
        chosenPackage = input.nextInt();
        if (chosenPackage == 1) {
            PremiumMember pm = new PremiumMember(name, email, address, gender, height, startingWeight);
            return pm;
        } else if (chosenPackage == 2) {
            System.out.println("Enter your Student Number; ");
            System.out.print("==>> ");
            int studentID;
            studentID = input.nextInt();
            System.out.println("Enter your College Name; ");
            System.out.print("==>> ");
            String collegeName;
            collegeName = input.nextLine();
            input.nextLine();
            StudentMember sm = new StudentMember(name, email, address, gender, height, startingWeight, studentID, "Student", collegeName);
            return sm;
        } else {
            System.out.println("Incorrect value");
            return createMember();
        }
    } catch(
    InputMismatchException e)

    {
        System.out.println("Incorrect value entered please start again");
        input.next();
        return createMember();
    }

}

    /**
     * Prints the Menu for a New Assessment
     *
     * @return if valid input, return the new assessment object, if invalid, return the menu again
     */
    private Assessment createAssessment() {
        try {
            System.out.println("Enter date assessment was Conducted; ");
            System.out.print("==>> ");
            input.nextLine();
            String dateAdded = input.nextLine();
            System.out.println("Enter weight ");
            System.out.print("==>> ");
            input.nextLine();
            float weight = input.nextFloat();
            System.out.println("Enter chest size; ");
            System.out.print("==>> ");
            float chest = input.nextFloat();
            System.out.println("Enter thigh size; ");
            System.out.print("==>> ");
            float thigh = input.nextFloat();
            System.out.println("Enter upper arm size; ");
            System.out.print("==>> ");
            float upperArm = input.nextFloat();
            System.out.println("Enter waist size; ");
            System.out.print("==>> ");
            float waist = input.nextFloat();
            System.out.println("Enter hip size; ");
            System.out.print("==>> ");
            float hips = input.nextFloat();
            System.out.println("Enter comment; ");
            System.out.println("==>> ");
            String comment = input.nextLine();
            input.nextLine();
            Trainer trainer = (Trainer) checkAddressReturnPerson(loginMenu());
            Assessment assessment = new Assessment(dateAdded, weight, chest, thigh, upperArm, waist, hips, comment, trainer);
            return assessment;
        } catch (InputMismatchException e) {
            System.out.println("Incorrect value entered please start again");
            input.next();
            return createAssessment();
        }
    }

    /**
     * Prints the menu for Creating a Trainer
     *
     * @return if valid input, return the new Trainer object, if invalid, return the menu again
     */
    private Trainer createTrainer() {
        try {
            System.out.println("Enter your name; ");
            System.out.print("==>> ");
            input.nextLine();
            String name = input.nextLine();
            System.out.println("Enter your email; ");
            System.out.print("==>> ");
            String email = checkAddress(input.nextLine());
            System.out.println("Enter your address; ");
            System.out.print("==>> ");
            String address = input.nextLine();
            System.out.println("Enter your Gender (Male/Female); ");
            System.out.print("==>> ");
            String gender = input.nextLine();
            if ((gender.equals("M")) || (gender.equals("Male")) || (gender.equals("F")) || (gender.equals("Female")) || (gender.equals("m")) || (gender.equals("male")) || (gender.equals("f")) || (gender.equals("female"))) {
                //do nothing gender is already set
            } else {
                //reset gender to unspecified
                gender = "Unspecified";
            }
            System.out.println("Enter your Speciality; ");
            String speciality = input.nextLine();

            Trainer tr = new Trainer(name, email, address, gender, speciality);
            return tr;
        } catch (InputMismatchException e) {
            System.out.println("Incorrect value entered please start again");
            input.next();
            return createTrainer();
        }
    }

    /**
     * Method to check if emails exists and returns boolean
     *
     * @param email - Email to be checked
     * @return if the email exists in the Members array or in the Trainers array
     */
    private boolean checkAddressBoolean(String email) {
        boolean emailExists = false;
        for (int i = 0; i < gym.getMembers().size(); i++) {
            if ((gym.getMembers().get(i).getEmail().equals(email))) {
                emailExists = true;
            }
        }
        for (int i = 0; i < gym.getTrainers().size(); i++) {
            if ((gym.getTrainers().get(i).getEmail().equals(email))) {
                emailExists = true;
            }
        }
        return emailExists;
    }

    /**
     * Checks if an email is valid to be a new email
     *
     * @param email - Email to be checked
     * @return if email does not exist, return entered email
     */
    private String checkAddress(String email) {
        boolean emailExists = checkAddressBoolean(email);
        if (emailExists) {
            System.out.println("Error: Email already exists. Please check your email and try again.");
            System.out.println("Please enter new email");
            String retryEmail = input.nextLine();
            checkAddress(retryEmail);
        }
        return email;
    }

    /**
     * Checks if an email is related to a person in the database
     *
     * @param email - Email to be checked
     * @return the person object associated with the entered email
     */
    private Person checkAddressReturnPerson(String email) {
        Person person = null;
        for (int i = 0; i < gym.getMembers().size(); i++) {
            if ((gym.getMembers().get(i).getEmail().contains(email))) {
                person = (Member) gym.getMembers().get(i);
            }
        }
        for (int i = 0; i < gym.getTrainers().size(); i++) {
            if ((gym.getTrainers().get(i).getEmail().contains(email))) {
                person = (Trainer) gym.getTrainers().get(i);
            }
        }
        return person;
    }
}
