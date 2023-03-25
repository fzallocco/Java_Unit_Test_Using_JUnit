package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class divideTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		float output = test.divide(10, 3);
		assertEquals(3.33 , output);
		
		
	}

}
