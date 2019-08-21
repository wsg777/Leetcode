package leetcode;

/**
 * @Author 王少刚
 * @Time 2019/8/21 13:40
 */

public class P024 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode cur = head;
		cur.next = new ListNode(2);
		cur = cur.next;
		cur.next = new ListNode(3);
		cur = cur.next;
		cur.next = new ListNode(4);
		ListNode listNode = new P024().swapPairs(head);
		System.out.println(listNode.val);
		System.out.println(listNode.next.val);
		System.out.println(listNode.next.next.val);
		System.out.println(listNode.next.next.next.val);
	}
	public ListNode swapPairs(ListNode head) {
		ListNode myHead = new ListNode(0);
		myHead.next = head;
		ListNode cur = myHead;

		while (cur.next != null && cur.next.next != null) {
			ListNode temp = cur.next.next.next;
			cur.next.next.next = cur.next;
			cur.next = cur.next.next;
			cur.next.next.next = temp;

			cur = cur.next.next;
		}

		return myHead.next;
	}
}
