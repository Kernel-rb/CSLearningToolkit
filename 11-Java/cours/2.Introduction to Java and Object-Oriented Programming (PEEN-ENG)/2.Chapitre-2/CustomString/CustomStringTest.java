package customstring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomStringTest {

	//declare custom string for testing
	CustomString myCustomString;

	@BeforeEach
	public void setUp() throws Exception {
		//initialize custom string for testing
		this.myCustomString = new CustomString();
	}

	@Test
	void testGetString() {

		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());

		this.myCustomString.setString("hello");
		assertEquals("hello", this.myCustomString.getString());

		// TODO write at least 3 additional test cases
		this.myCustomString.setString("hy");
		assertEquals("hy" ,this.myCustomString.getString());
		this.myCustomString.setString("e");
		assertEquals("e" ,this.myCustomString.getString());
		this.myCustomString.setString(null);
		assertEquals(null ,this.myCustomString.getString());
	}

	@Test
	void testSetString() {

		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());

		this.myCustomString.setString("Good-bye!");
		assertEquals("Good-bye!", this.myCustomString.getString());

		// TODO write at least 3 additional test cases
		this.myCustomString.setString("z");
		assertEquals("z", this.myCustomString.getString());
		this.myCustomString.setString("e");
		assertEquals("e", this.myCustomString.getString());
		this.myCustomString.setString("a");
		assertEquals("a", this.myCustomString.getString());
	}

	@Test
	void testRemove() {
		assertEquals("", this.myCustomString.remove(""));

		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.remove(""));

		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbes e 6, 8, nd 19.", this.myCustomString.remove("ra6"));


		// TODO write at least 3 additional test cases
		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbes e 6, 8, nd 19.", this.myCustomString.remove("ra6"));

		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbes e 6, 8, nd 19.", this.myCustomString.remove("ra6"));

		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbes e 6, 8, nd 19.", this.myCustomString.remove("ra6"));
	}

	@Test
	void testReverse() {
		assertEquals("", this.myCustomString.reverse(""));

		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.reverse(""));

		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("aBC, xyz; 123.", this.myCustomString.reverse("bcdxyz@3210."));

		// TODO write at least 3 additional test cases
		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("aBC, xyz; 123.", this.myCustomString.reverse("bcdxyz@3210."));
		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("aBC, xyz; 123.", this.myCustomString.reverse("bcdxyz@3210."));
		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("aBC, xyz; 123.", this.myCustomString.reverse("bcdxyz@3210."));
	}

	@Test
	void testFilterLetters() {
		assertEquals("", this.myCustomString.filterLetters('E', false));

		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.filterLetters('E', false));

		// TODO write at least 3 additional test cases
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.filterLetters('E', false));
	}

}'