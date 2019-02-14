package leetcode;

import utils.ListNodeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Merge Two Sorted Lists
 *
 * @Author 王少刚
 * @Date 2019/2/14 16:46
 */
public class P021 {

	public ListNode mergeKLists(ListNode[] lists) {
		// 数组lists转为List类型
		List<ListNode> listNodeList = new ArrayList<ListNode>();
		for (ListNode list : lists) {
			listNodeList.add(list);
		}

		// 记录已经为空的ListNode的索引
		List<Integer> nullListNodeIndex = new ArrayList<Integer>();

		// 结果
		ListNode result = new ListNode(0);
		ListNode cur = result;

		while (!listNodeList.isEmpty()) {

			// 在一个List中存入所有头节点
			List<Integer> integers = new ArrayList<Integer>();
			for (ListNode list : listNodeList) {
				integers.add(list.val);
			}


			// 找到最小头节点值
			int min = integers.get(0);
			for (Integer integer : integers) {
				if (integer < min) {
					min = integer;
				}
			}

			// 将最小值存入结果，并从原二叉树中删除
			cur.next = new ListNode(min);
			cur = cur.next;
				int i = 0;
				while (true) {
					ListNode listNode = listNodeList.get(i);
					if (listNode.val == min) {
						listNodeList.remove(listNode);
						listNode = listNode.next;
						// 如果已经为空，就从外层List中删除
						if (listNode != null) {
							i++;
							listNodeList.add(listNode);
						}

					}
				}

		}
		return result.next;
	}

	public static void main(String[] args) {
		ListNode listNode1 = ListNodeUtils.ListNodeInit(new int[]{1, 4, 5});
//		ListNode listNode2 = ListNodeUtils.ListNodeInit(new int[]{1, 3, 4});
//		ListNode listNode3 = ListNodeUtils.ListNodeInit(new int[]{2, 6});
		ListNode[] listNodes = {listNode1};
		new P021().mergeKLists(listNodes);
	}
}
