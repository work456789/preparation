package com.preparation.leetcode;

import java.util.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //head of the resultant linked list
        ListNode head = null;
        //reference of head
        ListNode temp = null;
        //carry
        int carry = 0;
        //loop for the two input lists

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            sum = sum % 10;
            ListNode node = new ListNode(sum);
            //first entrance in loop
            if (head == null) {
                head = node;
                temp = head;
            }
            //for any other node
            else {
                temp.next = node;
                temp = node;
            }
        }
        //after the loop we check for carry
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return head;
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1a = new ListNode(3);
        ListNode l1b = new ListNode(4, l1a);
        ListNode l1c = new ListNode(2, l1b);

        ListNode l2a = new ListNode(4);
        ListNode l2b = new ListNode(6, l2a);
        ListNode l2c = new ListNode(5, l2b);

        ListNode node = addTwoNumbers.addTwoNumbers(l1c, l2c);
        System.out.println(node);
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
