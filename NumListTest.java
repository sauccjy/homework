package homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumListTest {

	@Test
	void testGetMax1() {
		NumList a = new NumList();
		a.n =  6;
		a.NumList =new int[] {-1,-2,-3,-4,-5,-6}; 
		assertEquals(0,a.GetMax());
	}
	@Test
	void testGetMax2() {
		NumList a = new NumList();
		a.n =  6;
		a.NumList =new int[] {-2,11,-4,13,-5,-2}; 
		assertEquals(20,a.GetMax());
	}
	@Test
	void testGetMax3() {
		NumList a = new NumList();
		a.n =  0;
		a.NumList =new int[] {}; 
		assertEquals(0,a.GetMax());
	}
	@Test
	void testGetMax4() {
		NumList a = new NumList();
		a.n =  -1;
		a.NumList =new int[] {}; 
		assertEquals(-1,a.GetMax());
	}
	@Test
	void testGetMax5() {
		NumList a = new NumList();
		a.n =  6;
		a.NumList =new int[] {1,3,4,5,6,7}; 
		assertEquals(26,a.GetMax());
	}
	@Test
	void testGetMax6() {
		NumList a = new NumList();
		a.n =  6;
		a.NumList =new int[] {11,11,-4,-1,-1,-1}; 
		assertEquals(22,a.GetMax());
	}
	@Test
	void testGetMax7() {
		NumList a = new NumList();
		a.n =  6;
		a.NumList =new int[] {0,0,0,0,0,0}; 
		assertEquals(0,a.GetMax());
	}
	@Test
	void testGetMax8() {
		NumList a = new NumList();
		a.n =  6;
		a.NumList =new int[] {0,-1,-4,-5,-5,-2}; 
		assertEquals(0,a.GetMax());
	}
	@Test
	void testGetMax9() {
		NumList a = new NumList();
		a.n =  6;
		a.NumList =new int[] {-1,3,-4,-5,-5,-2}; 
		assertEquals(3,a.GetMax());
	}

}
