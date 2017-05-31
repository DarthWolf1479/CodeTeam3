import static org.junit.Assert.*;

import org.junit.Test;

public class PrimoTestBad {

	@Test
	public void test() {
		Main test = new Main();
		boolean result = test.esPrimo(12);
		assertFalse(result);
	}

}
