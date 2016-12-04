package Florian;

import org.junit.Test;
import junit.framework.TestCase;

public class UtilTest extends TestCase{
	@Test
	public void testIstErstesHalbjahr() {
		assertTrue(Util.istErstesHalbjahr(1));
		assertTrue(Util.istErstesHalbjahr(6));
		assertFalse(Util.istErstesHalbjahr(7));
		assertFalse(Util.istErstesHalbjahr(12));

	}
}
