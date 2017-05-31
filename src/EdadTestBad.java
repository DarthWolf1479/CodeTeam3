import static org.junit.Assert.*;

import org.junit.Test;

public class EdadTestBad {

	@Test
	public void test() {
		Main test = new Main();
		int resultbad = test.edad("19/07/1996");
		assertFalse(resultbad==12);
		
	}

}
