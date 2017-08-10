package string;

public class LongestPalindromicSubstring {
	private int low;
	private int high;
	private int maxLen;
	
	public String longestPalindrome(String s) {
		int n = s.length();
		for (int i = 0; i < n; ++i) {
			getMaxLen(s, i, i, n);
			getMaxLen(s, i+1, i, n);
		}

		return s.substring(this.low, this.high);
	}
	
	private void getMaxLen(String s, int x, int y, int n) {
		while (x-1 >= 0 && y+1 < n && s.charAt(x-1) == s.charAt(y+1)) {
			--x;
			++y;
		}
		
		if (y + 1 - x > this.maxLen) {
			this.low = x;
			this.high = y + 1;
			this.maxLen = this.high - this.low;
		}
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
