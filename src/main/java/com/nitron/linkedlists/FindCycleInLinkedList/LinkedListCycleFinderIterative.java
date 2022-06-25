package com.nitron.linkedlists.FindCycleInLinkedList;

import com.nitron.linkedlists.ListNode;

public class LinkedListCycleFinderIterative {

    public boolean hasCycle(ListNode head) {

        if( head == null)
            return false;

        ListNode slowNode = head;
        ListNode fastNode = head;

        while(fastNode!=null && fastNode.next!=null)
        {

            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode == fastNode)
                return true;
        }
        return false;

    }
}
