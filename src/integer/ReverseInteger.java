package integer;

public class ReverseInteger {
	public int reverse(int x) {
		int res = 0;
		while (x != 0) {
			int remain = x % 10;
			int newRes = res * 10 + remain;
			if ((newRes - remain) / 10 != res)
				return 0;
			x = x / 10;
			res = newRes;
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger r = new ReverseInteger();
		System.out.println(r.reverse(-1));
		System.out.println(r.reverse(-123));
		System.out.println(r.reverse(123));
		System.out.println(r.reverse(1000000003));
	}

}
