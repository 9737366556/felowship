package test.bridgelabs.dataStructure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bridgelabs.dataStructure.BankingCashCounter1;
import com.bridgelabs.utility.DataStructureUtility;


/**
 * Purpose : To test method of BankingCashCounter class
 * 
 * 
 * @author Nikunj Balar
 *
 */
class BankingCashCounter1Test {

	// testing depositBalance
	@Test
	void testDepositBalance() {
		int n=1;
		int expected = 15000;
		double opening=10000;
		int amt= 5000;
		// getting actual result using closingBalanced function
		double actual= DataStructureUtility.closingBalanced(n, opening, amt);
		
		// comparing expected or actual result
		assertEquals(expected, actual);
	}
	
	// testing WithdrowBalance
	@Test
	void testWithdrowBalance() {
		int n=2;
		int expected = 5000;
		double opening=10000;
		int amt= 5000;
		// getting actual result using closingBalanced function
		double actual= DataStructureUtility.closingBalanced(n, opening, amt);
		
		// comparing expected or actual result
		assertEquals(expected, actual);
	}

}
