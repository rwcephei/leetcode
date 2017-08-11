package string;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if (numRows <= 1) return s;
		StringBuilder sb = new StringBuilder();
		int n = s.length();
		int interval = 2 * (numRows - 1);
		for (int i = 0; i < numRows; ++i) {
			int count = 0;
			while (i + count * interval < n) {
				sb.append(s.charAt(i + count * interval));
				if (i != 0 && i != numRows - 1) {
					if ((count + 1) * interval - i < n) {
						sb.append(s.charAt((count + 1) * interval - i));
					} 
				}
				
				++count;
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZigZagConversion z = new ZigZagConversion();
		System.out.println(z.convert("abcdefghijklmn", 3));
	}

}
