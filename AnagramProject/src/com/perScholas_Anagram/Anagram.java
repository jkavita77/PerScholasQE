package com.perScholas_Anagram;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "taste";
		String s2 = "state";
		
		// Ternary operator used to print result.
		System.out.println((isAnagram(s1, s2)? 
			"'" + s1 + "' and '" + s2 + "'" + " are angrams." : 
			"'" + s1 + "' and '" + s2 + "'" + " are not angrams."));
	}
	
	public static boolean isAnagram(String s1, String s2) {
		
		HashMap <Character, Integer> charMap1 = new HashMap <>();
		HashMap <Character, Integer> charMap2 = new HashMap <>();
		
		for(char c : s1.toUpperCase().toCharArray()) {
			if(!charMap1.containsKey(c)) {
				charMap1.put(c, 1);
			} else {
				charMap1.put(c, charMap1.get(c)+1);
			}
		}
		
		for(char c : s2.toUpperCase().toCharArray()) {
			if(!charMap2.containsKey(c)) {
				charMap2.put(c, 1);
			} else {
				charMap2.put(c, charMap2.get(c)+1);
			}
		}
		return charMap1.equals(charMap2);
	}
}
