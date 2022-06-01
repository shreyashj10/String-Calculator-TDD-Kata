import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {
	StringCalculator sCalculator;
	@Test
	void testAddForEmptyString() {
		Assert.assertEquals(0, sCalculator.add(""));
	}
	
	@Test
	void testAddForOneNumber() {
		Assert.assertEquals(1, sCalculator.add("1"));
	}

}
