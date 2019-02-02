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
		ListNode listNode = new ListNode(l1.val + l2.val);
		ListNode cur = listNode;
		l1 = l1.next;
		l2 = l2.next;
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				l1 = new ListNode(0);
			}
			if (l2 == null) {
				l2 = new ListNode(0);
			}
			cur.next = new ListNode(l1.val + l2.val);
			cur = cur.next;
			l1 = l1.next;
			l2 = l2.next;
		}

		cur = listNode;
		int carry = 0;
		while (true) {
			cur.val += carry;
			carry = 0;
			if (cur.val >= 10) {
				cur.val -= 10;
				carry++;
			}
			if (cur.next == null) {
				if (carry == 1) {
					cur.next = new ListNode(carry);
				}
				break;
			}
			cur = cur.next;
		}

		return listNode;
	}
}

class ListNode {
	int val;
	ListNode next;

	public ListNode(int x) {
		val = x;
	}
}
