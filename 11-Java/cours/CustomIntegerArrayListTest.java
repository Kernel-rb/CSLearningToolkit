package integerarraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomIntegerArrayListTest {

	@Test
	void testGetArrayList() {

		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);

		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);
		assertEquals(lst1, arr1.getArrayList());

		ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
		arr4Elements.add(100);
		arr4Elements.add(200);
		arr4Elements.add(500);

		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(100);
		lst4.add(200);
		lst4.add(500);

		assertEquals(lst4, arr4.getArrayList());

		// TODO write at least 3 additional test cases
		CustomIntegerArrayListTest arr2 = new CustomIntegerArrayListTest();
		arr2.add(8);
		arr2.add(0, 5);
		arr2.add(1, 5);

		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(8);
		lst2.add(0, 5);
		lst2.add(1, 5);
		assertEquals(lst2, arr2.getArrayList());

		ArrayList<Integer> arr3Elements = new ArrayList<Integer>();
		arr3Elements.add(100);
		arr3Elements.add(200);
		arr3Elements.add(500);

		CustomIntegerArrayList arr3 = new CustomIntegerArrayList(arr3Elements);

		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(100);
		lst3.add(200);
		lst3.add(500);

		assertEquals(lst3, arr3.getArrayList());

		// Test case 3
		CustomIntegerArrayList arr5 = new CustomIntegerArrayList();
		arr5.add(2);
		arr5.add(0, 5);
		arr5.add(1, 5);

		ArrayList<Integer> lst5 = new ArrayList<Integer>();
		lst5.add(2);
		lst5.add(0, 5);
		lst5.add(1, 5);
		assertEquals(lst5, arr5.getArrayList());

		ArrayList<Integer> arr6Elements = new ArrayList<Integer>();
		arr6Elements.add(100);
		arr6Elements.add(200);
		arr6Elements.add(500);

		CustomIntegerArrayList arr6 = new CustomIntegerArrayList(arr6Elements);

		ArrayList<Integer> lst6 = new ArrayList<Integer>();
		lst6.add(100);
		lst6.add(200);
		lst6.add(500);

		assertEquals(lst6, arr6.getArrayList());

		// Test case 4
		CustomIntegerArrayList arr7 = new CustomIntegerArrayList();
		arr7.add(2);
		arr7.add(0, 5);
		arr7.add(1, 5);

		ArrayList<Integer> lst7 = new ArrayList<Integer>();
		lst7.add(2);
		lst7.add(0, 5);
		lst7.add(1, 5);
		assertEquals(lst7, arr7.getArrayList());

		ArrayList<Integer> arr8Elements = new ArrayList<Integer>();
		arr8Elements.add(100);
		arr8Elements.add(200);
		arr8Elements.add(500);

		CustomIntegerArrayList arr8 = new CustomIntegerArrayList(arr8Elements);

		ArrayList<Integer> lst8 = new ArrayList<Integer>();
		lst8.add(100);
		lst8.add(200);
		lst8.add(500);

		assertEquals(lst8, arr8.getArrayList());

		// 3 / 3 DONE
	}

	@Test
	void testGet() {
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);

		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases

		// Test case 1 
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(2);
		arr2.add(0, 5);
		arr2.add(1, 5);

		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(2);
		lst2.add(0, 5);
		lst2.add(1, 5);

		assertEquals(lst2.get(0), arr2.get(0));
		assertEquals(lst2.get(1), arr2.get(1));
		assertEquals(lst2.get(2), arr2.get(2));

		// Test case 2
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(2);
		arr3.add(0, 5);
		arr3.add(1, 5);

		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(2);
		lst3.add(0, 5);
		lst3.add(1, 5);

		assertEquals(lst3.get(0), arr3.get(0));
		assertEquals(lst3.get(1), arr3.get(1));
		assertEquals(lst3.get(2), arr3.get(2));

		// Test case 3
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(2);
		arr4.add(0, 5);
		arr4.add(1, 5);
		
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(2);
		lst4.add(0, 5);
		lst4.add(1, 5);

		assertEquals(lst4.get(0), arr4.get(0));
		assertEquals(lst4.get(1), arr4.get(1));
		assertEquals(lst4.get(2), arr4.get(2));

		// 3 / 3 DONE
	}

	@Test
	void testAddInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);

		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases

		// Test case 1
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);

		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(2);
		lst2.add(3);
		lst2.add(4);

		assertEquals(lst2.get(0), arr2.get(0));

		// Test case 2
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(2);
		arr3.add(3);
		arr3.add(4);
		
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(2);

		assertEquals(lst3.get(0), arr3.get(0));

		// Test case 3
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(2);
		arr4.add(3);
		arr4.add(4);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(2);
		lst4.add(3);

		assertEquals(lst4.get(0), arr4.get(0));

		// 3 / 3 DONE

	}

	@Test
	void testAddIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);

		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases

		// Test case 1
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 2);
		arr2.add(0, 3);
		arr2.add(0, 4);

		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 2);
		lst2.add(0, 3);
		lst2.add(0, 4);

		assertEquals(lst2.get(0), arr2.get(0));

		// Test case 2

		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(0, 2);
		arr3.add(0, 3);
		arr3.add(0, 4);

		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(0, 2);
		lst3.add(0, 3);

		assertEquals(lst3.get(0), arr3.get(0));
		
		// Test case 3
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(0, 2);
		arr4.add(0, 3);
		arr4.add(0, 4);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(0, 2);

		assertEquals(lst4.get(0), arr4.get(0));
		
		// 3 / 3 DONE
	}

	@Test
	void testRemoveInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(0);
		arr1.remove(1);

		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);
		lst1.remove(0);
		lst1.remove(1);

		assertEquals(lst1.get(0), arr1.get(0));

		// TODO write at least 3 additional test cases

		// Test case 1
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 2);
		arr2.add(0, 3);
		arr2.add(0, 4);
		arr2.remove(0);
		arr2.remove(1);

		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 2);
		lst2.add(0, 3);
		lst2.add(0, 4);
		lst2.remove(0);
		lst2.remove(1);

		assertEquals(lst2.get(0), arr2.get(0));

		// Test case 2
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(0, 2);
		arr3.add(0, 3);
		arr3.add(0, 4);
		arr3.remove(0);
		arr3.remove(1);

		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(0, 2);
		lst3.add(0, 3);
		lst3.add(0, 4);
		lst3.remove(0);
		lst3.remove(1);

		assertEquals(lst3.get(0), arr3.get(0));

		// Test case 3

		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(0, 2);
		arr4.add(0, 3);
		arr4.add(0, 4);
		arr4.remove(0);
		arr4.remove(1);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(0, 2);
		lst4.add(0, 3);
		lst4.add(0, 4);
		lst4.remove(0);
		lst4.remove(1);
		
		assertEquals(lst4.get(0), arr4.get(0));


	}

	@Test
	void testRemoveIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(3, 3);

		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases

		// Test case 1
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 2);
		arr2.add(0, 3);
		arr2.add(0, 3);
		arr2.add(0, 3);
		arr2.add(0, 3);
		arr2.add(0, 4);
		arr2.remove(3, 3);

		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 2);
		lst2.add(0, 3);
		lst2.add(0, 4);

		assertEquals(lst2, arr2.getArrayList());

		// Test case 2
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(0, 2);
		arr3.add(0, 3);
		arr3.add(0, 3);
		arr3.add(0, 3);
		arr3.add(0, 3);
		arr3.add(0, 4);
		arr3.remove(3, 3);

		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(0, 2);
		lst3.add(0, 3);
		lst3.add(0, 4);

		assertEquals(lst3, arr3.getArrayList());

		// Test case 3
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(0, 2);
		arr4.add(0, 3);
		arr4.add(0, 3);
		arr4.add(0, 3);
		arr4.add(0, 3);
		arr4.add(0, 4);
		arr4.remove(3, 3);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(0, 2);
		lst4.add(0, 3);
		lst4.add(0, 4);

		assertEquals(lst4, arr4.getArrayList());


	}

	@Test
	void testSpliceIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 2);

		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases

		// Test case 1
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		arr2.add(6);
		arr2.splice(3, 2);

		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(2);
		lst2.add(3);
		lst2.add(4);

		assertEquals(lst2.get(0), arr2.get(0));
		assertEquals(lst2.get(1), arr2.get(1));
		assertEquals(lst2.get(2), arr2.get(2));

		// Test case 2
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(2);
		arr3.add(3);
		arr3.add(4);
		arr3.add(5);
		arr3.add(6);
		arr3.splice(3, 2);

		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(2);
		lst3.add(3);
		lst3.add(4);

		assertEquals(lst3.get(0), arr3.get(0));
		assertEquals(lst3.get(1), arr3.get(1));
		assertEquals(lst3.get(2), arr3.get(2));

		// Test case 3

		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(2);
		arr4.add(3);
		arr4.add(4);
		arr4.add(5);
		arr4.add(6);
		arr4.splice(3, 2);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(2);
		lst4.add(3);
		lst4.add(4);
		
		assertEquals(lst4.get(0), arr4.get(0));
		assertEquals(lst4.get(1), arr4.get(1));
		assertEquals(lst4.get(2), arr4.get(2));
		
	}

	@Test
	void testSpliceIntIntIntArray() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 1, new int[] { 4, 5 });

		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);

		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases

		// Test case 1

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		arr2.add(6);
		arr2.splice(3, 1, new int[] { 4, 5 });

		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(2);
		lst2.add(3);
		lst2.add(4);
		lst2.add(4);
		lst2.add(5);
		lst2.add(6);

		assertEquals(lst2, arr2.getArrayList());

		// Test case 2
		
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(2);
		arr3.add(3);
		arr3.add(4);
		arr3.add(5);
		arr3.add(6);
		arr3.splice(3, 1, new int[] { 4, 5 });

		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(2);
		lst3.add(3);
		lst3.add(4);
		lst3.add(4);
		lst3.add(5);
		lst3.add(6);

		assertEquals(lst3, arr3.getArrayList());

		// Test case 3

		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(2);
		arr4.add(3);
		arr4.add(4);
		arr4.add(5);
		arr4.add(6);
		arr4.splice(3, 1, new int[] { 4, 5 });

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(2);
		lst4.add(3);
		lst4.add(4);
		lst4.add(4);
		lst4.add(5);
		lst4.add(6);

		assertEquals(lst4, arr4.getArrayList());

		// 3 / 3 DONE

	}

}
