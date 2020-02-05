package test.bridgelabs.Oops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.bridgelabs.Oops.accountManagement.controller.AccountController;
import com.bridgelabs.Oops.accountManagement.dto.AccountDTO;
import com.bridgelabs.Oops.accountManagement.operations.AccountService;

class TestAccountManagement {

	@Test
	void testTotalOfEachShare() {
		AccountDTO dto = new AccountDTO();
		AccountController controller =new AccountController();
		AccountService operation=new AccountService();
		double expected = 1100.0;
		try {
			List<AccountDTO> list = controller.readFile();
			String name = "infosys";
			double actual= operation.totalOfEachShare(list ,name);
			assertEquals(expected, actual);
		} catch (IOException e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}	
	}
}
