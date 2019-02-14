package leetcode;

/**
 * Longest Common Prefix
 *
 * @Author 王少刚
 * @Date 2019/2/4 12:59
 */
public class P014 {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}

		String shortestStr = strs[0];

		for (String str : strs) {
			if (str.length() < shortestStr.length()) {
				shortestStr = str;
			}
		}

		label:
		for (int end = shortestStr.length(); end > 0; end--) {
			for (String str : strs) {
				if (!str.startsWith(shortestStr.substring(0, end))) {
					continue label;
				}
			}
			return shortestStr.substring(0, end);
		}

		return "";
	}

	public static void main(String[] args) {
		System.out.println(new P014().longestCommonPrefix(new String[]{"ca", "a"}));
	}
}
