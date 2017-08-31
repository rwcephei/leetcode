package integer;

public class StringToInteger {
	public int myAtoi(String str) {
		int index = 0;
		int sign = 1;
		int res = 0;
		int n = str.length();
		if (n == 0) return 0;
		while (index < n && str.charAt(index) == ' ') index++;
		if (index < n && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
			sign = (str.charAt(index) == '+') ? 1 : -1;
			index++;
		}
					
		while (index < n) {
			int digit = str.charAt(index) - '0';
			if (digit < 0 || digit > 9) return res*sign;
			if (res * 10 + digit < digit || (res * 10 + digit) / 10 < res)
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			res = res * 10 + digit;
			index++;
		}
		
		return res * sign;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringToInteger atoi = new StringToInteger();
		System.out.println(atoi.myAtoi("-1000"));
		System.out.println(atoi.myAtoi("-0"));
		System.out.println(atoi.myAtoi("12345678"));
		System.out.println(atoi.myAtoi("-12345678"));
		System.out.println(atoi.myAtoi("   -6at"));
		System.out.println(atoi.myAtoi("at67"));
		System.out.println(atoi.myAtoi("-1"));
		System.out.println(atoi.myAtoi("1"));
		System.out.println(atoi.myAtoi("2147483647"));
		System.out.println(atoi.myAtoi("-2147483648"));
		System.out.println(atoi.myAtoi("2147483648"));
		System.out.println(atoi.myAtoi("-2147483647"));
		System.out.println(atoi.myAtoi("2147483646"));
		System.out.println(atoi.myAtoi("-2147483649"));
	}

}
