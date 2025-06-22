package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Trees.objects.Pair;
import Trees.objects.TreeNode;

/*
 * Given the root of a binary tree, return its maximum depth
 */
public class MaxDepth 
{
    // Recursive DFS Method (Time: O(n), Space: O(h))
    public int maxDepth(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    /*
     * Iterative DFS Method (Time: O(n), Space: O(n))
     * where n is the number of nodes in the tree
     */
    public int maxDepthIterative(TreeNode root)
    {
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new Pair<>(root, 1)); // we're at node 1, and the depth is 1
        int res = 0; // keep track of the max depth we've seen so far

        while (!stack.isEmpty()) // as long as we still have nodes to visit
        {
            Pair<TreeNode, Integer> pair = stack.pop();
            TreeNode node = pair.getKey();
            int depth = pair.getValue();

            if (node != null)
            {
                res = Math.max(res, depth);
                stack.push(new Pair<>(node.left, depth + 1));
                stack.push(new Pair<>(node.right, depth + 1));
            }
        }

        return res;
    }

    public int maxDepthBFS(TreeNode root)
    {
        Queue<TreeNode> queue = new LinkedList<>();

        if (root != null)
        {
            queue.add(root);
        }

        int level = 0;

        while (!queue.isEmpty())
        {
            int size = queue.size();
            for (int i = 0; i < size; i++) // loop through the level
            {
                TreeNode node = queue.poll(); // removes the front of the queue

                if (node.left != null)
                {
                    queue.add(node.left);
                }

                if (node.right != null)
                {
                    queue.add(node.right);
                }
            }

            level++;
        }

        return level;
    }
}

