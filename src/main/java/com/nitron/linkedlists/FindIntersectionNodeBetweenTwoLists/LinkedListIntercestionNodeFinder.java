package com.nitron.linkedlists.FindIntersectionNodeBetweenTwoLists;

import com.nitron.linkedlists.ListNode;

public class LinkedListIntercestionNodeFinder {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pointer1 = headA;
        ListNode pointer2 = headB;


        // Get Lengths of both arrays
        int length1 = 0;
        while(pointer1!=null)
        {
            length1++;
            pointer1 = pointer1.next;
        }
        int length2 = 0;
        while(pointer2!=null)
        {
            length2++;
            pointer2 = pointer2.next;
        }

        pointer1 = headA;
        pointer2 = headB;

        // Move longer list head pointer to level with smaller list length

        if(length1<length2)
        {

            for(int i =0;i<length2-length1;i++)
                pointer2 = pointer2.next;
        }
        else if(length1>length2)
        {
            for(int i =0;i<length1-length2; i++)
                pointer1 = pointer1.next;
        }

        // Now that both lists are of same lengths , move one step at a time and compare :)
        while(pointer1!=null && pointer2!=null)
        {
            if(pointer1==pointer2)
                return pointer1;

            pointer1 = pointer1.next;
            pointer2 = pointer2.next;

        }

        return null;


    }
}
