/**
 * @Author 王少刚
 * @Date 2019/2/4 20:00
 */
public class P019 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode cur = head;
		// 节点总数
		int nodes = 0;
		while (cur != null) {
			nodes++;
			cur = cur.next;
		}
		int target = nodes - n + 1;
		// 重置cur
		cur = head;
		// 移到目标前一位
		for (int i = 1; i < target - 1; i++) {
			cur = cur.next;
		}
		// 如果目标是第一位
		if (n == nodes) {
			return head.next;
		}
		if (n == 1) {
			// 如果目标是最后一位
			cur.next = null;
		} else {
			// 一般情况
			cur.next = cur.next.next;
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		ListNode cur = listNode;
		cur = cur.next = new ListNode(2);
//		cur = cur.next = new ListNode(3);
//		cur = cur.next = new ListNode(4);
//		cur = cur.next = new ListNode(5);

		ListNode listNode1 = new P019().removeNthFromEnd(listNode, 2);
		System.out.println(listNode1.val);
//		System.out.println(listNode1.next.val);
//		System.out.println(listNode1.next.next.val);
//		System.out.println(listNode1.next.next.next.val);
	}
}

