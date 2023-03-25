package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class divideATest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		float output = test.divide(-5, 2);
		assertEquals(-2.5, output);
		
	}

}
