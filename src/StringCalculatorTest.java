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
	
	@Test
	void testAddForTwoNumbers() {
		Assert.assertEquals(3, sCalculator.add("1,2"));
	}
	
	@Test
	void testAddForMultipleNumbers() {
		Assert.assertEquals(10, sCalculator.add("1,2,3,4"));
	}
	@Test
    public void testAddForNewLine(){
    	Assert.assertEquals(6, sCalculator.add("1\n2,3"));
    }
	
	@Test
    public void testAddForNegativeNumber(){
    	try {
    		sCalculator.add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -1");
		}

		try {
			sCalculator.add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
		}
    }

}
