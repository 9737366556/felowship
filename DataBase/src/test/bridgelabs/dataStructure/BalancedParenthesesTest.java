package test.bridgelabs.dataStructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabs.utility.Utility;

class BalancedParenthesesTest {

	@Test
	void testBalanceParentheses() {
		// talking expected as true for below input 
		boolean expected =true; 
		String line="()[]{()}";
		// calling function of checking parentheses are balanced or not 
		boolean actual = Utility.balanceParentheses(line);
		// comparing expected result with actual result
		assertEquals(expected, actual);
	}
}
