package xunsuan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ccccccccTest {

	@Test
	void test() {
		assertEquals(true,cccccccc.Get(1,1, 1 ,1));
	}
	@Test
	void test1() {
		assertEquals(true,cccccccc.Get(100,10, 0 ,1));
	}
	@Test
	void test2() {
		assertEquals(true,cccccccc.Get(100,20, 1 ,0));
	}
	@Test
	void test3() {
		assertEquals(true,cccccccc.Get(100,20, 0 ,0));
	}
}
