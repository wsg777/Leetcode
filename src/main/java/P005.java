/**
 * Longest Palindromic Substring
 *
 * @Author 王少刚
 * @Date 2019/2/3 12:26
 */

public class P005 {
	// 逆序计算
	// 较好
	public String longestPalindrome(String s) {
		String longestPalindrome = "";
		for (int start = 0; start < s.length() - longestPalindrome.length(); start++) {
			for (int end = s.length(); end > start + longestPalindrome.length(); end--) {
				String currentString = s.substring(start, end);
				if (whetherPalindromic(currentString)) {
					longestPalindrome = currentString;
					break;
				}
			}
		}
		return longestPalindrome;
	}

	// 顺序计算
	public String longestPalindrome2(String s) {
		String longestPalindrome = "";
		for (int start = 0; start < s.length() - longestPalindrome.length(); start++) {
			for (int end = start + longestPalindrome.length(); end < s.length(); end++) {
				String currentString = s.substring(start, end + 1);
				if (whetherPalindromic(currentString)) {
					longestPalindrome = currentString;
				}
			}
		}
		return longestPalindrome;
	}

	static boolean whetherPalindromic(String x) {
		StringBuilder s = new StringBuilder().append(x);
		return s.toString().equals(s.reverse().toString());
	}

	public static void main(String[] args) {
		System.out.println(new P005().longestPalindrome("a"));
	}

}


