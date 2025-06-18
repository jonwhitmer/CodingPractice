package LinkedList.objects;

// This class represents a node in a singly linked list.
public class ListNode
{
    public int val; // for problems sake, it's public
    public ListNode next; // for problems sake, it's public
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}