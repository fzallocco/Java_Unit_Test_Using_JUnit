package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class stringTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.count("Pennsylvania");
		assertEquals(3 , output);
	}

}
