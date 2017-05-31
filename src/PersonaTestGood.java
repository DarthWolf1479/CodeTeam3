import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTestGood {

	@Test
	public void test() {
		Main test = new Main();
		Persona p1 = new Persona("Mauricio", "Industrial", 22);
		Persona p2 = new Persona("Kevin", "Sistemas", 21);
		String result = test.AplicaPersona(p1, p2, "Sistemas").getNombre();
		assertEquals("Kevin", result);
	}

}
