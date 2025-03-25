package com.test.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SwapNodes {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next=l2;
        l1.next.next=l3;
        l1.next.next.next=l4;

        ListNode output = new SwapNodes().swapPairs(l1);

        while(output != null) {
            System.out.printf("%d ", output.val);
            output = output.next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null ) {
            return head;
        }

        // Swap the data of the current node with the next node
        int temp = head.val;
        head.val = head.next.val;
        head.next.val = temp;
        swapPairs(head.next.next);
        return head;
    }
}

