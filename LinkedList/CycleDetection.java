package LinkedList;

import LinkedList.objects.ListNode;

public class CycleDetection 
{

    public boolean hasCycle(ListNode head)
    {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null)
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer)
            {
                return true; // Cycle detected
            }
        }

        return false;
    }


}



/* This is O(n) space complexity
 *     public boolean hasCycle(ListNode head) 
    {
        Set<ListNode> visitedSet = new HashSet<>();
        ListNode currentNode = head;

        while (currentNode != null)
        {
            if (!visitedSet.contains(currentNode))
            {
                visitedSet.add(currentNode);
                currentNode = currentNode.next;
            }
            else
            {
                return true;
            }
        }

        return false;
    }
 */