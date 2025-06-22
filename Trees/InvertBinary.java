package Trees;

import Trees.objects.TreeNode;

/*
 * Given the root of a binary tree, invert the tree, and return its root
 */

public class InvertBinary 
{
    // Recursive DFS Method (Time: O(n), Space: O(h))
    // where h is the height of the tree
    public TreeNode invertTree(TreeNode root)
    {
        if (root == null)
        {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
