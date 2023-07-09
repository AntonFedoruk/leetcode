package ua.java.dsa.leetcode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println();

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode mergedList = new ListNode();
        if (list1.val <= list2.val) {
            mergedList.val = list1.val;
            mergedList.next = mergeTwoLists(list1.next, list2);
        } else {
            mergedList.val = list2.val;
            mergedList.next = mergeTwoLists(list2.next, list1);
        }

        return mergedList;
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);

        // A current pointer that will always point to the last node in the merged list
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                // If the value in list1 is smaller, append it to the merged list
                current.next = list1;
                list1 = list1.next;
            } else {
                // If the value in list2 is smaller or equal, append it to the merged list
                current.next = list2;
                list2 = list2.next;
            }

            // Move the current pointer to the node that was just appended
            current = current.next;
        }

        // At this point, at least one of the lists has been fully traversed.
        // If there are still some elements left in either list, we append them directly to the merged list
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        // The dummy node's next pointer points to the head of the merged list
        return dummy.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
