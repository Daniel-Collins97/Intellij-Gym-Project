import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for Assessment Class
 *
 * @author Daniel Collins
 *
 */


public class AssessmentTest {

    private Assessment assm1;
    private Assessment assmInvalid;
    private Trainer trainer1;


    /**
     * Set up test fixtures
     *
     * Called before every test method
     */
    @Before
    public void setUp() {

        assm1 = new Assessment("05/07/2017", 65, 34, 25, 20, 34, 37, "Doing Great", trainer1);
        assmInvalid = new Assessment("05/07/1997", 4, 78, 69, 34, 43, 41, "Good going", trainer1);
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
        assertNotNull(assm1); //will test these in testGetters()
        assertEquals("05/07/1997", assmInvalid.getDateAdded());
        assertEquals(0.0, assmInvalid.getWeight(), 0);
        assertEquals(78, assmInvalid.getChest(), 0);
        assertEquals(69, assmInvalid.getThigh(), 0);
        assertEquals(34, assmInvalid.getUpperArm(), 0);
        assertEquals(43, assmInvalid.getWaist(), 0);
        assertEquals(41, assmInvalid.getHips(), 0);
        assertEquals("Good going", assmInvalid.getComment());
    }

    /**
     * Test all getters using valid data
     */
    @Test
    public void testGetters() {
        assertEquals("05/07/2017", assm1.getDateAdded());
        assertEquals(65, assm1.getWeight(), 0);
        assertEquals(34, assm1.getChest(), 0);
        assertEquals(25, assm1.getThigh(), 0);
        assertEquals(20, assm1.getUpperArm(), 0);
        assertEquals(34, assm1.getWaist(), 0);
        assertEquals(37, assm1.getHips(), 0);
        assertEquals("Doing Great", assm1.getComment());
    }

    /**
     * Test all setters for StudentMember
     */
    @Test
    public void testSetters() {
        assm1.setDateAdded("05/07/2007");
        assertEquals("05/07/2007", assm1.getDateAdded());
        assm1.setDateAdded("This date is far too long for the validation rules");
        assertEquals("This date ", assm1.getDateAdded());

        assm1.setChest(34);
        assertEquals(34, assm1.getChest(), 0);
        assm1.setChest(45);     //no validation rules on chest
        assertEquals(45, assm1.getChest(), 0);

        assm1.setWeight(93);
        assertEquals(93, assm1.getWeight(), 0);
        assm1.setWeight(22);    //invalid - too low
        assertEquals(00, assm1.getWeight(), 0);
        assm1.setWeight(100);   //valid change
        assertEquals(100, assm1.getWeight(),0);

        assm1.setThigh(33);
        assertEquals(33, assm1.getThigh(), 0);
        assm1.setThigh(37);     //no validation rules on thigh
        assertEquals(37, assm1.getThigh(), 0);

        assm1.setUpperArm(21);
        assertEquals(21, assm1.getUpperArm(), 0);
        assm1.setUpperArm(30);  //no validation rules on UpperArm
        assertEquals(30, assm1.getUpperArm(), 0);

        assm1.setWaist(34);
        assertEquals(34, assm1.getWaist(), 0);
        assm1.setWaist(32);  //no validation on waist
        assertEquals(32, assm1.getWaist(), 0);

        assm1.setHips(34);
        assertEquals(34, assm1.getHips(), 0);
        assm1.setHips(30);  //no validation on hips
        assertEquals(30, assm1.getHips(), 0);

        assm1.setComment("Good Job");
        assertEquals("Good Job", assm1.getComment());
        assm1.setComment("Any comment");
        assertEquals("Any comment", assm1.getComment());
    }
}
