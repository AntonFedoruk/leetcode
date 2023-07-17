package ua.java.dsa.leetcode;

public class AddTwoNumbers {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
        ListNode l1 = new ListNode(3, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode l2 = new ListNode(7);

        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println("Result");
        while (listNode.next != null) {
            System.out.println("listNode.val:" + listNode.val);
            listNode = listNode.next;
        }
        System.out.println("listNode.val:" + listNode.val);
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reversedL1 = reverseList(l1);
        ListNode reversedL2 = reverseList(l2);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (reversedL1 != null || reversedL2 != null) {
            int x = (reversedL1 != null) ? reversedL1.val : 0;
            int y = (reversedL2 != null) ? reversedL2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (reversedL1 != null) reversedL1 = reversedL1.next;
            if (reversedL2 != null) reversedL2 = reversedL2.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return reverseList(dummy.next);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


