package leetcode;

/**
 * Palindrome Number
 *
 * @Author 王少刚
 * @Date 2019/2/3 18:14
 */
public class P009 {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		} else {
			StringBuilder s = new StringBuilder().append(x);
			return x < 0 ? false : s.toString().equals(s.reverse().toString());
		}
	}


	public static void main(String[] args) {
		System.out.println(new P009().isPalindrome(10));
	}
}
