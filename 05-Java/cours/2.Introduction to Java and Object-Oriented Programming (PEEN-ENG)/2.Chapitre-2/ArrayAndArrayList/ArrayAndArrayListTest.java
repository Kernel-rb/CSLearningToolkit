package arrayandarraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayAndArrayListTest {

	// Declare myArrayAndArrayList which is the object for testing
	ArrayAndArrayList myArrayAndArrayList;

	@BeforeEach
	void setUp() {
		// Initialize myArrayAndArrayList for testing
		this.myArrayAndArrayList = new ArrayAndArrayList();
	}

	/**
	 * Test howMany method in ArrayAndArrayList.
	 */
	@Test
	void testHowMany() {
		// Test case 1: Regular case
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));

		// Test case 2: Element not in the array
		int[] array2 = {1, 3, 5, 7, 9, 2, 4, 6};
		assertEquals(0, this.myArrayAndArrayList.howMany(array2, 10));

		// Test case 3: Array with all elements the same
		int[] array3 = {2, 2, 2, 2, 2};
		assertEquals(5, this.myArrayAndArrayList.howMany(array3, 2));

		// Test case 4: Empty array
		int[] array4 = new int[0];
		assertEquals(0, this.myArrayAndArrayList.howMany(array4, 1));
	}

	/**
	 * Test findMax method in ArrayAndArrayList.
	 */
	@Test
	void testFindMax() {
		// Test case 1: Regular case
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(9, this.myArrayAndArrayList.findMax(array));

		// Test case 2: Array with negative numbers
		int[] array2 = {-5, -3, -1, -4, -2};
		assertEquals(-1, this.myArrayAndArrayList.findMax(array2));

		// Test case 3: Array with all elements the same
		int[] array3 = {3, 3, 3, 3};
		assertEquals(3, this.myArrayAndArrayList.findMax(array3));

		// Test case 4: Empty array
		int[] array4 = new int[0];
		assertEquals(-1, this.myArrayAndArrayList.findMax(array4));
	}

	/**
	 * Test maxArray method in ArrayAndArrayList.
	 */
	@Test
	void testMaxArray() {
		// Test case 1: Regular case
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		ArrayList<Integer> expectedList = new ArrayList<>();
		expectedList.add(9);
		assertEquals(expectedList, this.myArrayAndArrayList.maxArray(array));

		// Test case 2: Array with multiple maximum values
		int[] array2 = {2, 4, 8, 12, 12, 4};
		ArrayList<Integer> expectedList2 = new ArrayList<>();
		expectedList2.add(12);
		expectedList2.add(12);
		assertEquals(expectedList2, this.myArrayAndArrayList.maxArray(array2));

		// Test case 3: Array with negative maximum values
		int[] array3 = {-5, -3, -1, -4, -5};
		ArrayList<Integer> expectedList3 = new ArrayList<>();
		expectedList3.add(-1);
		assertEquals(expectedList3, this.myArrayAndArrayList.maxArray(array3));

		// Test case 4: Empty array
		int[] array4 = new int[0];
		assertNull(this.myArrayAndArrayList.maxArray(array4)); // Expecting null
	}


	/**
	 * Test swapZero method in ArrayAndArrayList.
	 */
	@Test
	void testSwapZero() {
		// Test case 1: Regular case with zeros
		int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
		int[] expectedArray = {1, 2, 3, 5, 0, 0, 0, 0};
		this.myArrayAndArrayList.swapZero(array);
		assertArrayEquals(expectedArray, array);

		// Test case 2: No zeros in the array
		int[] array2 = {1, 2, 3, 4, 5};
		int[] expectedArray2 = {1, 2, 3, 4, 5};
		this.myArrayAndArrayList.swapZero(array2);
		assertArrayEquals(expectedArray2, array2);

		// Test case 3: All zeros in the array
		int[] array3 = {0, 0, 0, 0, 0};
		int[] expectedArray3 = {0, 0, 0, 0, 0};
		this.myArrayAndArrayList.swapZero(array3);
		assertArrayEquals(expectedArray3, array3);

		// Test case 4: Mixed elements with no trailing zeros
		int[] array4 = {0, 1, 2, 3, 4, 5, 6};
		int[] expectedArray4 = {1, 2, 3, 4, 5, 6, 0};
		this.myArrayAndArrayList.swapZero(array4);
		assertArrayEquals(expectedArray4, array4);
	}
}
