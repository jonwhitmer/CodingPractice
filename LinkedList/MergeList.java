package LinkedList;

class ListNode
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeList 
{
    // Merge two sorted singly-linked lists
    public ListNode mergeList(ListNode list1, ListNode list2)
    {
        // Create a dummy node to act as the start of the merged list
        ListNode dummy = new ListNode(0);
        // Pointer to build the new list
        ListNode node = dummy; 

        // Traverse both lists while neither is empty
        while (list1 != null && list2 != null)
        {
            // Attach the node with the smaller value to the merged list
            if (list1.val < list2.val)
            {
                node.next = list1;
                list1 = list1.next; // Move to next node in list1
            }
            else
            {
                node.next = list2;
                list2 = list2.next; // Move to next node in list2
            }

            node = node.next; // Move the pointer forward
        }

        // Attach the remaining nodes from the non-empty list
        if (list1 != null)
        {
            node.next = list1;
        }
        else
        {
            node.next = list2;
        }

        // Return the merged list, skipping the dummy node
        return dummy.next;
    }
}
