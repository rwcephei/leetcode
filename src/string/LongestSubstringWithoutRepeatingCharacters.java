package string;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int len = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int left = 0;
		int right = 0;
		for (int i = 0; i < n; ++i) {
			if (map.containsKey(s.charAt(i))) {
				left = Math.max(map.get(s.charAt(i)) + 1, left);				
			}
			
			map.put(s.charAt(i), i);
			++right;
			len = Math.max(len, right - left);
		}
		
		return len;
	}
	
	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
		System.out.println(l.lengthOfLongestSubstring(""));
		System.out.println(l.lengthOfLongestSubstring("a"));
		System.out.println(l.lengthOfLongestSubstring("aa"));
		System.out.println(l.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(l.lengthOfLongestSubstring("pwwkew"));
		System.out.println(l.lengthOfLongestSubstring("abckjkc"));
		System.out.println(l.lengthOfLongestSubstring("abckjklmnc"));
	}

}
