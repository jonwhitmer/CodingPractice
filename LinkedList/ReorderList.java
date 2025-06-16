package LinkedList;

import LinkedList.objects.ListNode;

/*
 * If we use a slow and fast pointer, we know the halfway point when the fast pointer reaches the end
 */

public class ReorderList 
{
    public void reorderList(ListNode head)
    {
        // Step 1: Find the middle of the list using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Cut the list in half and reverse the second half
        ListNode secondHalfPointer = slow.next; // Save the start of the second half
        ListNode prev = slow.next = null; // cuts the link of slow.next; prev points to null

        // Step 3: Reverse the second half of the list
        while (secondHalfPointer != null)
        {
            ListNode nextTemp = secondHalfPointer.next; // Store the next node
            secondHalfPointer.next = prev; // Reverse the link
            prev = secondHalfPointer; // Move prev to current node
            secondHalfPointer = nextTemp; // Move to the next node
        }

        // Step 4: Merge the two halves
        ListNode first = head;
        secondHalfPointer = prev; 
        
        while (secondHalfPointer != null)
        {
            ListNode temp1 = first.next;
            ListNode temp2 = secondHalfPointer.next;
            first.next = secondHalfPointer;
            secondHalfPointer.next = temp1;
            first = temp1;
            secondHalfPointer = temp2;
        }
    }
}
