import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {
	StringCalculator sCalculator;
	@Test
	void testAdd() {
		Assert.assertEquals(0, sCalculator.add(""));
	}

}
