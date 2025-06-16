package LinkedList;

import LinkedList.objects.ListNode;

/*
 * You are given the beginning of a linked list head, and an integer n
 * Remove the nth node from the end of the list and return the beginning of the modified list1
 * 
 * Example:
 * Input: head = [1, 2, 3, 4], n = 2
 * Output: [1, 2, 4]
 */
public class RemoveNode 
{
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        ListNode dummy = new ListNode(0, head);
        ListNode leftPointer = dummy;
        ListNode rightPointer = head;

        while (n > 0 && rightPointer != null)
        {
            rightPointer = rightPointer.next;
            n--;
        }

        while (rightPointer != null)
        {
            leftPointer = leftPointer.next;
            rightPointer = rightPointer.next;
        }

        leftPointer.next = leftPointer.next.next;

        return dummy.next;
    }
}
