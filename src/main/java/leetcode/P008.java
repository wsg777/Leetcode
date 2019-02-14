package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * String to Integer (atoi)
 *
 * @Author 王少刚
 * @Date 2019/2/3 15:38
 */
public class P008 {
	public int myAtoi(String str) {
		String pattern = "^\\s*([\\+|\\-]?[0-9]+)";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);
		if (m.find()) {
			try {
				return Integer.valueOf(m.group(1));
			} catch (Exception e) {
				return m.group(1).startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(new P008().myAtoi("      -11919730356x"));
	}
}
