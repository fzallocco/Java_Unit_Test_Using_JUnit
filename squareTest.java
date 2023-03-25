package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class squareTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(7);
		assertEquals(49 , output);
	}

}
