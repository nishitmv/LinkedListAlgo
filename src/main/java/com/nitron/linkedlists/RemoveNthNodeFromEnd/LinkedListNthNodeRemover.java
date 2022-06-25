package com.nitron.linkedlists.RemoveNthNodeFromEnd;

import com.nitron.linkedlists.ListNode;

public class LinkedListNthNodeRemover {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null)
            return null;

        ListNode pointer = head;

        int length =0;
        while( pointer !=null)
        {
            pointer = pointer.next;
            length++;
        }

        if(n>length)
            return null;

        if(n==length)
        {
            head = head.next;
            return head;
        }

        pointer = head;
        for(int i=1;i<length-n;i++)
        {
            pointer= pointer.next;
        }


        ListNode temp = pointer.next;
        pointer.next = pointer.next.next;
        temp.next= null;
        return head;
    }
}
