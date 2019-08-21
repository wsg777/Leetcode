import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 王少刚
 * @Time 2019/8/15 21:26
 */

public class Fb {
	public static void main(String[] args) {
		System.out.println(fb2(50000));
	}

	static int fb(int num) {
		if (num == 1) {
			return 1;
		} else if (num == 2) {
			return 1;
		} else {
			return fb(num - 1) + fb(num - 2);
		}
	}

	static BigInteger fb2(int num) {
		List<BigInteger> list = new ArrayList();
		list.add(BigInteger.valueOf(1));
		list.add(BigInteger.valueOf(1));
		for (int i = 1; i < num - 1; i++) {
			list.add(list.get(i - 1).add(list.get(i)));
		}
		return list.get(list.size() - 1);
	}
}
