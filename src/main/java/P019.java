/**
 * @Author 王少刚
 * @Date 2019/2/4 20:00
 */
public class P019 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode cur = head;
		for (int i = 0; i < n; i++) {
			cur = cur.next;
		}
		try {
			cur.next = cur.next.next;
		} catch (Exception e) {

		}
		return head;
	}
}

