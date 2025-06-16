package LinkedList;

import LinkedList.objects.ListNode;

public class ListReverse 
{
    public ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null)
        {
            ListNode nextTemp = curr.next; // Store the next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move prev to current node
            curr = nextTemp; // Move to the next node
        }

        return prev;
    }
}
