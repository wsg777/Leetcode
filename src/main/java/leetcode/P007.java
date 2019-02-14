package leetcode;

/**
 * Reverse Integer
 *
 * @Author 王少刚
 * @Date 2019/2/3 15:03
 */
public class P007 {
	public int reverse(int x) {
		boolean whetherPositive = true;
		if (x < 0) {
			x = -x;
			whetherPositive = false;
		}
		long y = 0;
		while (x > 0) {
			y = y * 10 + x % 10;
			x = x / 10;
			if (y > Integer.MAX_VALUE) {
				return 0;
			}
		}
		return whetherPositive ? (int) y : (int) -y;
	}

	public static void main(String[] args) {
		System.out.println(new P007().reverse(1534236469));
//		System.out.println(964632435 * 10);
	}
}
