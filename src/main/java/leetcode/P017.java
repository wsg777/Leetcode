package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Letter Combinations of a Phone Number
 *
 * @Author 王少刚
 * @Date 2019/2/4 16:05
 */
public class P017 {
	static Map<Integer, String> map = new HashMap<Integer, String>();

	static {
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
	}

	public static void main(String[] args) {
		System.out.println(new P017().letterCombinations("222"));
	}

	public List<String> letterCombinations(String digits) {
		List<String> stringList = new ArrayList<String>();
		while (!digits.equals("")) {
			stringList = makeIt(stringList, Integer.valueOf(digits.substring(0, 1)));
			digits = digits.substring(1, digits.length());
		}
		return stringList;
	}

	static List<String> makeIt(List<String> stringList, int num) {
		List<String> strings = new ArrayList<String>();
		if (stringList.isEmpty()) {
			for (char c : map.get(num).toCharArray()) {
				strings.add(c + "");
			}
		} else {
			for (String string : stringList) {
				for (char c : map.get(num).toCharArray()) {
					strings.add(string + c);
				}
			}
		}
		return strings;
	}
}
