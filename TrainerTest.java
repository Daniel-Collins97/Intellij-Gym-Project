import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for Trainer Class
 *
 * @author Daniel Collins
 *
 */


public class TrainerTest {

    private Trainer train1;
    private Trainer trainInvalid;


    /**
     * Set up test fixtures
     *
     * Called before every test method
     */
    @Before
    public void setUp() {

        train1 = new Trainer("Joe Soap", "joesoap@wit.ie", "wit", "M", "legs");
        trainInvalid = new Trainer("Valid name is 30 chars to hereANYTHINGAFTERTHEREISTOOLONG", "invalidtrainer@wit.ie", "wit", "U", "Biceps");
    }

    /**
     * Teardown test fixtures
     *
     * Called after each test method
     */
    @After
    public void tearDown() {

    }

    /**
     * Test the contsructor
     */
    @Test
    public void testConstructor() {
        assertNotNull(train1); //will test these in testGetters()
        assertEquals("Valid name is 30 chars to here", trainInvalid.getName());
        assertEquals("invalidtrainer@wit.ie", trainInvalid.getEmail());
        assertEquals("Unspecified", trainInvalid.getGender());
        assertEquals("wit", trainInvalid.getAddress());
        assertEquals("Biceps", trainInvalid.getSpeciality());
    }

    /**
     * Test all getters using valid data
     */
    @Test
    public void testGetters() {
        assertEquals("Joe Soap", train1.getName());
        assertEquals("joesoap@wit.ie", train1.getEmail());
        assertEquals("M", train1.getGender());
        assertEquals("wit", train1.getAddress());
        assertEquals("legs", train1.getSpeciality());
    }

    /**
     * Test all setters for StudentMember
     */
    @Test
    public void testSetters() {
        train1.setName("Jane Soap");
        assertEquals("Jane Soap", train1.getName());
        train1.setName("This name is far too long for the validation rules");
        assertEquals("This name is far too long for ", train1.getName());

        assertEquals("joesoap@wit.ie", train1.getEmail());
        train1.setEmail("someoneElse@wit.ie");
        assertEquals("someoneElse@wit.ie", train1.getEmail());

        assertEquals("M", train1.getGender());
        train1.setGender("anythinginvalid");
        assertEquals("Unspecified", train1.getGender());

        assertEquals("wit", train1.getAddress());
        train1.setAddress("no validation rules on address");
        assertEquals("no validation rules on address", train1.getAddress());

        assertEquals("legs", train1.getSpeciality());
        train1.setSpeciality("no validation rules on address");
        assertEquals("no validation rules on address", train1.getSpeciality());
    }

    /**
     * Test the ToString Method for StudentMember
     *
     */
    @Test
    public void testToString() {
        assertEquals(
                "Name: " +"Joe Soap" +
                        ", Address:" + " wit" +
                        ", Email:" + " joesoap@wit.ie" +
                        ", Gender: " + "M" +
                        ", Speciality: " + "legs"
                ,
                train1.toString());

    }


}
