package com.nitron.linkedlists.FindCycleInLinkedList;

import com.nitron.linkedlists.ListNode;

public class DetectAndReturnCycleBeginning {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                //Create Two More Pointers for head and point of intersection ( slow or fast as both are at same node)
                ListNode headNode = head;
                ListNode intersectionNode = slow;

                //Run both 1 step at a time till both meet .
                while( headNode!= intersectionNode)
                {
                    headNode = headNode.next;
                    intersectionNode = intersectionNode.next;
                }
                return headNode;
            }
        }
        return null;

    }
}
