package com.test.jda.custom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyTreeMapTest {
	
	@Test
	public void test1() {
		MyTreeMap<String, Integer> map = new MyTreeMap<>();
		map.put("ghi", 3);
		map.put("def", 2);
		map.put("abc", 1);

		assertEquals(map.getEntry("abc"), map.getFirstEntry());
	}
	
	@Test
	public void test2() {
		MyTreeMap<String, Integer> map = new MyTreeMap<>();
		map.put("ghi", 3);
		map.put("def", 2);
		map.put("abc", 1);

		assertEquals(map.getEntry("ghi"), map.getLastEntry());
	}
	
	@Test
	public void test3() {
		MyTreeMap<String, Integer> map = new MyTreeMap<>();
		map.put("ghi", 3);
		map.put("def", 2);
		map.put("abc", 1);

		assertEquals(3, map.size());
	}
	
	@Test
	public void test4() {
		MyTreeMap<String, Integer> map = new MyTreeMap<>();
		map.put("ghi", 3);
		map.put("def", 2);
		map.put("ghi", 1);

		assertEquals(2, map.size());
	}
	
	@Test
	public void test5() {
		MyTreeMap<String, Integer> map = new MyTreeMap<>();
		map.put("ghi", 3);
		map.put("def", 2);
		map.put("ghi", 1);
		map.put("xyz", null);

		assertEquals(3, map.size());
	}
	
	@Test(expected=NullPointerException.class)
	public void test6() {
		MyTreeMap<String, Integer> map = new MyTreeMap<>();
		map.put("ghi", 3);
		map.put("def", 2);
		map.put("ghi", 1);
		map.put(null, 4);
	}
	
	@Test
	public void test7() {
		MyTreeMap<String, Integer> map = new MyTreeMap<>();
		map.put("ghi", 3);
		map.put("def", 2);
		map.put("abc", 1);
		
		assertEquals("3", map.get("ghi").toString());
	}
	
	@Test
	public void test8() {
		MyTreeMap<String, Integer> map = new MyTreeMap<>();
		map.put("ghi", 3);
		map.put("def", 2);
		map.put("abc", 1);
		
		assertTrue(map.containsKey("def"));
	}
	
	@Test
	public void test9() {
		MyTreeMap<String, Integer> map = new MyTreeMap<>();
		map.put("ghi", 3);
		map.put("def", 2);
		map.put("abc", 1);
		
		assertFalse(map.containsKey("dfsdfsd"));
	}

	@Test
	public void test10() {
		MyTreeMap<String, Integer> map = new MyTreeMap<>();
		map.put("ghi", 3);
		map.put("def", 2);
		map.put("abc", 1);
		
		assertTrue(map.containsValue(1));
	}
	
	@Test
	public void test11() {
		MyTreeMap<String, Integer> map = new MyTreeMap<>();
		map.put("ghi", 3);
		map.put("def", 2);
		map.put("abc", 1);
		
		assertFalse(map.containsValue(5));
	}
	
	@Test
	public void test12() {
		MyTreeMap<String, Integer> map = new MyTreeMap<>();
		map.put("ghi", 3);
		map.put("def", 2);
		map.put("abc", 1);
		map.clear();

		assertEquals(0, map.size());
	}
}
