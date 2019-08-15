package leetcode;

/**
 * @Author 王少刚
 * @Time 2019/8/15 15:18
 */

public class P028 {

	// 注释为未优化的版本
//	public static int strStr(String haystack, String needle) {
//		if (needle.equals("")) {
//			return 0;
//		}
//
//		outer:
//		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
//			for (int j = 0; j < needle.length(); j++) {
//				if (haystack.charAt(i) == needle.charAt(j)) {
//					i++;
//				} else {
//					i-=j;
//					continue outer;
//				}
//			}
//			return i-needle.length();
//		}
//
//		return -1;
//	}

	public static int strStr(String haystack, String needle) {
		if (needle.equals("")) {
			return 0;
		}

		int j;
		int needleLength = needle.length();
		int haystackLength = haystack.length();
		int subtract = haystackLength - needleLength;
		for (int i = 0; i <= subtract; i++) {
			for (j = 0; j < needleLength; j++) {
				if (haystack.charAt(i) == needle.charAt(j)) {
					i++;
				} else {
					i-=j;
					break ;
				}
			}
			if (j == needleLength) {
				return i- needleLength;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(strStr("a", "a"));
	}
}
