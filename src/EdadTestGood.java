import static org.junit.Assert.*;

import org.junit.Test;

public class EdadTestGood {

	@Test
	public void test() {
		Main test = new Main();
		int resultgood = test.edad("19/07/1996");
		assertEquals(20, resultgood);
		
	}

}
