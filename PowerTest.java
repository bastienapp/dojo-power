import junit.framework.*;
import org.junit.Test;

public class PowerTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		assertEquals(1, Power.pow(2, 0));
		assertEquals(2, Power.pow(2, 1));
		assertEquals(4, Power.pow(2, 2));
		assertEquals(8, Power.pow(2, 3));
		assertEquals(16, Power.pow(2, 4));
		assertEquals(32, Power.pow(2, 5));
	}
}
