import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for StudentMember Class
 *
 * @author Siobhan and Mairead
 *
 */


public class StudentMemberTest {

	private StudentMember stud1;
	private StudentMember studInvalid;


	/**
	 * Set up test fixtures
	 *
	 * Called before every test method
	 */
	@Before
	public void setUp() {

		stud1 = new StudentMember("Joe Soap", "joesoap@wit.ie", "wit", "M", 1.8, 65, 200011, "Student", "WIT");
		studInvalid = new StudentMember("Valid name is 30 chars to hereANYTHINGAFTERTHEREISTOOLONG", "invalidstudent@wit.ie", "wit", "U",  0.8, 20, 123456789, "Student", "WIT");
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
		assertNotNull(stud1); //will test these in testGetters()
		assertEquals("Valid name is 30 chars to here", studInvalid.getName());
		assertEquals("invalidstudent@wit.ie", studInvalid.getEmail());
		assertEquals("Unspecified", studInvalid.getGender());
		assertEquals("wit", studInvalid.getAddress());
		assertEquals(0.0, studInvalid.getStartingWeight(), 0.0);
		assertEquals(0.0, studInvalid.getHeight(), 0);
		assertEquals("Student", studInvalid.getChosenPackage());
	}

	/**
	 * Test all getters using valid data
	 */
	@Test
	public void testGetters() {
		assertEquals("Joe Soap", stud1.getName());
		assertEquals("joesoap@wit.ie", stud1.getEmail());
		assertEquals("M", stud1.getGender());
		assertEquals("wit", stud1.getAddress());
		assertEquals(65.0, stud1.getStartingWeight(), 0.01);
		assertEquals(1.8, stud1.getHeight(), 0.01);
		assertEquals("Student", stud1.getChosenPackage());
	}

	/**
	 * Test all setters for StudentMember
	 */
	@Test
	public void testSetters() {
		stud1.setName("Jane Soap");
		assertEquals("Jane Soap", stud1.getName());
		stud1.setName("This name is far too long for the validation rules");
		assertEquals("This name is far too long for ", stud1.getName());

		assertEquals("joesoap@wit.ie", stud1.getEmail());
		stud1.setEmail("someoneElse@wit.ie");
		assertEquals("someoneElse@wit.ie", stud1.getEmail());

		assertEquals("M", stud1.getGender());
		stud1.setGender("anythinginvalid");
		assertEquals("Unspecified", stud1.getGender());

		assertEquals("wit", stud1.getAddress());
		stud1.setAddress("no validation rules on address");
		assertEquals("no validation rules on address", stud1.getAddress());

		assertEquals(65.0, stud1.getStartingWeight(), 0.01);
		stud1.setStartingWeight(100);  //valid change
		assertEquals(100, stud1.getStartingWeight(), 0.01);
		stud1.setStartingWeight(34);  //invalid change - too low
		assertEquals(100, stud1.getStartingWeight(), 0.01);

		stud1.setStartingWeight(251);  //invalid change - too high
		assertEquals(100, stud1.getStartingWeight(), 0.01);

		assertEquals(1.8, stud1.getHeight(), 0.01);
		stud1.setHeight((float) 2.5);  //valid change
		assertEquals(2.5, stud1.getHeight(), 0.01);
		stud1.setHeight((float) 0.99);  //invalid change - too low
		assertEquals(2.5, stud1.getHeight(), 0.01);
		stud1.setHeight((float) 3.01);  //invalid change - too high
		assertEquals(2.5, stud1.getHeight(), 0.01);


		assertEquals("Student", stud1.getChosenPackage());
		stud1.setChosenPackage("Student");
		assertEquals("Student", stud1.getChosenPackage());
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
						", height="+ 1.8 +
						", startingWeight=" + 65.0 +
						", chosenPackage=" + "'Student'" +
						", assessments=" + "{}" +
						", BMI Category=" + "null" +
						", studentID=" + "200011" +
						", collegeName=" + "'WIT"
				,
				stud1.toString());

	}


}
