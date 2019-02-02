/**
 * Add Two Numbers
 *
 * @Author 王少刚
 * @Date 2019/2/1 20:32
 */
public class P002 {

	public static void main(String[] args) {
		ListNode la = new ListNode(2);
		la.next = new ListNode(4);
		la.next.next = new ListNode(5);
		ListNode listNode = new P002().addTwoNumbers(la, la);
		System.out.println(listNode.val);
		System.out.println(listNode.next.val);
		System.out.println(listNode.next.next.val);
		System.out.println(listNode.next.next.next.val);
	}


	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int value = 0;
		int carry = 0;
		ListNode listNode = new ListNode(0);
		ListNode cur = listNode;
		while (l1 != null || l2 != null) {
			l1 = l1 == null ? new ListNode(0) : l1;
			l2 = l2 == null ? new ListNode(0) : l2;
			value = l1.val + l2.val + carry;
			carry = value >= 10 ? 1 : 0;
			cur.next = new ListNode(value>= 10 ? value - 10 : value);
			cur = cur.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		cur.next = carry == 0 ? null : new ListNode(1);
		return listNode.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	public ListNode(int x) {
		val = x;
	}
}
