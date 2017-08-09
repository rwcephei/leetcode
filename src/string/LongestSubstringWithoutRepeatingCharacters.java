package string;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int len = 0;
		for (int i = 0; i < n; ++i) {
			HashSet<Character> set = new HashSet<Character>();
			set.add(s.charAt(i));
			for (int j = i + 1; j < n; ++j) {
				if (set.contains(s.charAt(j))) break;
				set.add(s.charAt(j));
			}
			
			len = Math.max(len, set.size());
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
	}

}
