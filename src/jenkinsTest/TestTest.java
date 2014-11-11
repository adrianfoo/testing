package jenkinsTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTest {

	@Test
	public void testAddTogether() {
		StringAdd test = new StringAdd();
		String result = test.addTogether("one", "two");
		assertEquals("onetwo", result);
	}

}

//qweqwedasd
