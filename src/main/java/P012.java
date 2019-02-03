/**
 * Integer to Roman
 *
 * @Author 王少刚
 * @Date 2019/2/3 21:01
 */
public class P012 {
	public String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		int k = num / 1000;
		if (k > 3) {
			throw new NumberFormatException("Number is too BIG!");
		}
		int h = num / 100 % 10;
		int t = num / 10 % 10;
		int i = num % 10;

		sb.append(conversion('M', ' ', ' ', k));
		sb.append(conversion('C', 'D', 'M', h));
		sb.append(conversion('X', 'L', 'C', t));
		sb.append(conversion('I', 'V', 'X', i));

		return sb.toString();
	}

	static StringBuilder conversion(char a, char b, char c, int num) {
		StringBuilder sb = new StringBuilder();
		switch (num) {
			case 0: break;
			case 1: sb.append(a); break;
			case 2: sb.append(a).append(a); break;
			case 3: sb.append(a).append(a).append(a); break;
			case 4: sb.append(a).append(b); break;
			case 5: sb.append(b); break;
			case 6: sb.append(b).append(a); break;
			case 7: sb.append(b).append(a).append(a); break;
			case 8: sb.append(b).append(a).append(a).append(a); break;
			case 9: sb.append(a).append(c); break;
			default: break;
		}
		return sb;
	}


	public static void main(String[] args) {
		System.out.println(new P012().intToRoman(33333));
	}
}
