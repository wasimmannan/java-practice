package com.test.leetcode;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode list1_2 = new ListNode(3);
        ListNode list1_1 = new ListNode(2, list1_2);
        ListNode list1 = new ListNode(1, list1_1);

        ListNode list2_2 = new ListNode(4);
        ListNode list2_1 = new ListNode(3, list2_2);
        ListNode list2 = new ListNode(1, list2_1);
        MergeTwoSortedList m = new MergeTwoSortedList();
        ListNode result = m.mergeTwoLists(list1, list2);

        while (result != null) {
            System.out.printf("%d ", result.val);
            result = result.next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        } else if(list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next , list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }

    }
}

class ListNode {
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
