/**
 * Holds the code for loading and saving gym to XML files and Adding methods for Members and Trainers Array List
 */
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class GymAPI {
    Trainer trainer = new Trainer();

    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Trainer> trainers = new ArrayList<>();

    /**
     * Loads last saved gym from XML file
     *
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public void loadGym() throws Exception {
        XStream xstream = new XStream(new DomDriver());
        String xmlString = new String(Files.readAllBytes(Paths.get("gym.xml")));
        GymAPI gymAPI = (GymAPI) xstream.fromXML(xmlString);
        this.members = gymAPI.members;
        this.trainers = gymAPI.trainers;
    }

    /**
     * Saves the current Gym to an XML file
     *
     * @throws Exception
     */
    public void saveGym() throws Exception {
        XStream xstream = new XStream(new DomDriver());
        String xmlString = xstream.toXML(this);
        System.out.println(xmlString);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("gym.xml"));
            out.write(xmlString);
            out.close();
        } catch (IOException e) {
            System.out.println("Exception ");

        }
    }

    /**
     * Adds Member to Members Array
     *
     * @param member - Member object to be added to array
     */
    public void addMember(Member member) {
        getMembers().add(member);
    }

    /**
     * Add Trainer to Trainers array
     *
     * @param trainer - Trainer Object to be added to array
     */
    public void addTrainer(Trainer trainer) {
        getTrainers().add(trainer);
    }

    /**
     * Gets the Members array List
     *
     * @return Members Array List
     */
    public ArrayList<Member> getMembers() {
        return members;
    }

    /**
     * Sets the Members array list
     *
     * @param members - Members to be used in array list
     */
    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    /**
     * Gets the Trainers Array List
     *
     * @return Trainers Array List
     */
    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    /**
     * Sets the Trainers Array List
     *
     * @param trainers - Trainers to be used in Trainers Array List
     */
    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }

    /**
     * Gets the Size of the Members Array List
     *
     * @return Size of Members Array List
     */
    public int numberOfMembers() {
        return getMembers().size();
    }

    /**
     * Gets the size of Trainers Array List
     *
     * @return - Size of Trainers Array List
     */
    public int numberOfTrainers() {
        return getTrainers().size();
    }

    public String searchMembersByEmail(String emailEntered) {
        for (int i = 0; i < getMembers().size(); i++) {
            if ((trainer.getClients().get(i).getEmail().equals(emailEntered))) {
                System.out.println("Member " + i + ")");
                return getMembers().get(i).toString();
            }
        }
        return null;
    }
}


/*    public Member searchMembersByEmail(String emailEntered)
    {
        if(getMembers().contains(emailEntered))
        {
            return getMembers().indexOf();
        }
    }*/