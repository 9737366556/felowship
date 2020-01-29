02package test.bridgelabs.dataStructure;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.bridgelabs.utility.LinkedListUtility;

class LinkedListTest {

	@Test
	void testSearch() {
		String s="nik";
		LinkedListUtility<String> list = new LinkedListUtility<String>();
		list.insert(s);
		boolean find=list.search(s);
		assertEquals(true, find);
	}
	
	@Test
	void testSearchIndex() {
		LinkedListUtility<String> list = new LinkedListUtility<String>();
		list.insert("ni");
		list.insert("nik");
		list.insert("niku");
		list.insert("nikun");
		int n=list.searchIndex("nikun");
		
		assertEquals(4,n);
	}
	
	
}