package com.preparation.leetcode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode mergedList = mergeTwoLists(list1, list2);

        System.out.println("Merged List: " + mergedList);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode mergedListPreHead = new ListNode(-1);
        ListNode mergedListCurrentNode = mergedListPreHead;
        ListNode nextElementList1 = list1; // Pointer for list1
        ListNode nextElementList2 = list2; // Pointer for list2

        // Compare elements from both lists and add the smaller one to the merged list
        while (nextElementList1 != null && nextElementList2 != null) {
            if (nextElementList1.val < nextElementList2.val) {
                mergedListCurrentNode.next = new ListNode(nextElementList1.val);
                nextElementList1 = nextElementList1.next;
            } else {
                mergedListCurrentNode.next = new ListNode(nextElementList2.val);
                nextElementList2 = nextElementList2.next;
            }
            mergedListCurrentNode = mergedListCurrentNode.next;
        }

        // If there are remaining elements in list1, add them to the merged list
        while (nextElementList1 != null) {
            mergedListCurrentNode.next = new ListNode(nextElementList1.val);
            nextElementList1 = nextElementList1.next;
            mergedListCurrentNode = mergedListCurrentNode.next;
        }

        // If there are remaining elements in list2, add them to the merged list
        while (nextElementList2 != null) {
            mergedListCurrentNode.next = new ListNode(nextElementList2.val);
            nextElementList2 = nextElementList2.next;
            mergedListCurrentNode = mergedListCurrentNode.next;
        }

        return mergedListPreHead.next;
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

        @Override
        public String toString() {
            String s = String.valueOf(val);
            ListNode nextNode = next;
            while(nextNode != null){
                s = s + " " + String.valueOf(nextNode.val);
                nextNode = nextNode.next;
            }

            return s;
        }
    }
}

