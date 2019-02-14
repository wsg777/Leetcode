package utils;

import leetcode.ListNode;

/**
 * @Author 王少刚
 * @Date 2019/2/14 17:56
 */
public class ListNodeUtils {

	public static ListNode ListNodeInit(int[] ints) {
		ListNode listNode = new ListNode(0);
		ListNode cur = listNode;
		for (int i : ints) {
			cur.next = new ListNode(i);
			cur = cur.next;
		}
		return listNode.next;
	}
}
