import static org.junit.Assert.*;

import org.junit.Test;

public class PrimoTestGood {

	@Test
	public void test() {
		Main test = new Main();
		boolean result = test.esPrimo(41);
		assertTrue(result);
	}

}
