import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTestBad {

	@Test
	public void test() {
		Main test = new Main();
		Persona p1 = new Persona("Mauricio", "Industrial", 22);
		Persona p2 = new Persona("Kevin", "Industrial", 22);
		Persona result = test.AplicaPersona(p1, p2, "Estudiante");
		assertEquals(null, result);
	}

}
