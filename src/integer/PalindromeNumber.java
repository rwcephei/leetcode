package integer;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0) return false;
		int total = 0;
		int y = x;
		while (y != 0) {
			int rem = y % 10;
			if (total * 10 + rem < rem || (total * 10) / 10 != total)
				return false;
			total = total * 10 + rem;
			y = y / 10;
		}

		return total == x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber pn = new PalindromeNumber();
		System.out.println(pn.isPalindrome(0));
		System.out.println(pn.isPalindrome(-1));
		System.out.println(pn.isPalindrome(-121));
		System.out.println(pn.isPalindrome(121));
		System.out.println(pn.isPalindrome(2147483647));
		System.out.println(pn.isPalindrome(-2147483648));
		System.out.println(pn.isPalindrome(-2147447412));
	}

}
