package leetcode;

/**
 * Longest Substring Without Repeating Characters
 *
 * @Author 王少刚
 * @Date 2019/2/2 16:22
 */
public class P003 {
	public int lengthOfLongestSubstring(String s) {
		int length = 0;

		for (int start = 0; start < s.length(); start++) {
			for (int end = start + length + 1; end < s.length() + 1; end++) {
				if (whetherRepeat(s.substring(start, end))) {
					break;
				} else {
					length = length > end - start ? length : end - start;
				}
			}
		}
		return length;
	}

	// 重复返回true
	boolean whetherRepeat(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}




	public static void main(String[] args) {
//		System.out.println(new leetcode.P003().whetherRepeat(" "));
		String a = "ababc";
		System.out.println(new P003().lengthOfLongestSubstring(a));
	}
}
