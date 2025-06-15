package LinkedList;

class ListNode
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

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
