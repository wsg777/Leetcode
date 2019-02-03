/**
 * Roman to Integer
 *
 * @Author 王少刚
 * @Date 2019/2/3 22:06
 */
public class P013 {
	public int romanToInt(String s) {

		// todo

		int i = 0;
		if (s.startsWith("M")) {
			s = s.substring(1, s.length());
			i += 1000;
		}
		if (s.startsWith("M")) {
			s = s.substring(1, s.length());
			i += 1000;
		}
		if (s.startsWith("M")) {
			s = s.substring(1, s.length());
			i += 1000;
		}
		if (s.startsWith("CM")) {
			s = s.substring(2, s.length());
			i += 900;
		}
		if (s.startsWith("D")) {
			s = s.substring(1, s.length());
			i += 500;
		}
		if (s.startsWith("CD")) {
			s = s.substring(2, s.length());
			i += 400;
		}
		if (s.startsWith("C")) {
			s = s.substring(1, s.length());
			i += 100;
		}
		if (s.startsWith("C")) {
			s = s.substring(1, s.length());
			i += 100;
		}
		if (s.startsWith("C")) {
			s = s.substring(1, s.length());
			i += 100;
		}
		if (s.startsWith("XC")) {
			s = s.substring(2, s.length());
			i += 90;
		}
		if (s.startsWith("L")) {
			s = s.substring(1, s.length());
			i += 50;
		}
		if (s.startsWith("XL")) {
			s = s.substring(2, s.length());
			i += 40;
		}
		if (s.startsWith("X")) {
			s = s.substring(1, s.length());
			i += 10;
		}
		if (s.startsWith("X")) {
			s = s.substring(1, s.length());
			i += 10;
		}
		if (s.startsWith("X")) {
			s = s.substring(1, s.length());
			i += 10;
		}
		if (s.startsWith("IX")) {
			s = s.substring(2, s.length());
			i += 9;
		}
		if (s.startsWith("V")) {
			s = s.substring(1, s.length());
			i += 5;
		}
		if (s.startsWith("IV")) {
			s = s.substring(2, s.length());
			i += 4;
		}
		if (s.startsWith("I")) {
			s = s.substring(1, s.length());
			i += 1;
		}
		if (s.startsWith("I")) {
			s = s.substring(1, s.length());
			i += 1;
		}
		if (s.startsWith("I")) {
			s = s.substring(1, s.length());
			i += 1;
		}
		return i;
	}

	public static void main(String[] args) {
		System.out.println(new P013().romanToInt("VIII"));
	}
}
