package string;

public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		int n = s.length();
		String res = "";
		for (int i = 0; i < n; ++i) {
			int x = i;
			int y = i;
			while (x-1 >= 0 && y+1 < n && s.charAt(x-1) == s.charAt(y+1)) {
				--x;
				++y;
			}
			
			String s1 = s.substring(x, y+1);
			res = s1.length() > res.length() ? s1 : res;
			
			x = i + 1;
			y = i;
			while (x-1 >= 0 && y+1 < n && s.charAt(x-1) == s.charAt(y+1)) {
				--x;
				++y;
			}
			
			String s2 = s.substring(x, y+1);
			res = s2.length() > res.length() ? s2 : res;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubstring l = new LongestPalindromicSubstring();
		System.out.println(l.longestPalindrome(""));
		System.out.println(l.longestPalindrome("babad"));
		System.out.println(l.longestPalindrome("cbbd"));
		System.out.println(l.longestPalindrome("abccba"));
		System.out.println(l.longestPalindrome("aaaaaaaaa"));
	}

}
