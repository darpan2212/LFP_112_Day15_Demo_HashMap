package com.bridgelabz.hashtable.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.bridgelabz.hashtable.MyHashMap;

public class MyHashMapTest {

	@Test
	public void testFrequencyOfWords() {

		String str = "To be or not to be";

		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();

		String[] words = str.split(" ");

		for (String s : words) {
			if (myHashMap.get(s.toLowerCase()) != null) {
				myHashMap.add(s.toLowerCase(),
						myHashMap.get(s.toLowerCase()) + 1);
			} else {
				myHashMap.add(s.toLowerCase(), 1);
			}
		}

		for (String s : words) {
			System.out.println(s.toLowerCase() + " : "
					+ myHashMap.get(s.toLowerCase()));
		}

		assertEquals(2, myHashMap.get("to"));

	}
}