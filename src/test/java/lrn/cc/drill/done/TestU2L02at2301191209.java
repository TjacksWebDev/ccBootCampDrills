package lrn.cc.drill.done;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestU2L02at2301191209 {

	// CORRECT ANSWER NOT PUBISHED AS PART OF DRILL:
////	int three = 3;
////	int minInt = -2147483648;
////	int maxInt = 2147483647;
////	int mouse = 5;
////	int goose = 3;
////	int dog = 57;
////	int cat = 3;

	@Test
	void testU2L03int() {
		// DECLARE VARIABLES HERE, AS NECESSARY TO make the lines below pass the test
		int three = 43;
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		int mouse = 3;
		int goose = 5;
		int dog = 55;
		int cat = 1;
		assertTrue(Integer.class.isInstance(three));
		assertEquals(minInt, Integer.MIN_VALUE);
		assertEquals(maxInt, Integer.MAX_VALUE);
		assertEquals(15, mouse * goose);
		assertEquals(54, dog - cat);
	}

}
