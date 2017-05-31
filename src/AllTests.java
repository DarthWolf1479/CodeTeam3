import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EdadTestBad.class, EdadTestGood.class, PersonaTestBad.class, PersonaTestGood.class, PrimoTestBad.class,
		PrimoTestGood.class })
public class AllTests {

}
