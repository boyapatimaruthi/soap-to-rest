import static org.junit.Assert.*;

import org.junit.Test;

public class FirstClassTest {
	@Test
	public void test() {
		FirstClass fC = new FirstClass();
		
		
		assertEquals("Hello MARUTHI", fC.getMessage("Maruthi"));
	}
}
