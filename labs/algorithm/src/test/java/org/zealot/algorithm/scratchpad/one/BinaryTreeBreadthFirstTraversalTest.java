package org.zealot.algorithm.scratchpad.one;

import org.junit.jupiter.api.Test;
import org.zealot.algorithm.ds.tree.TreeNode;
import org.zealot.algorithm.scratchpad.one.BinaryTreeBreadthFirstTraversal;

public class BinaryTreeBreadthFirstTraversalTest {

    @Test
    void traverse() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(54);
        root.left.right = new TreeNode(55);
        root.right.left = new TreeNode(65);
        root.right.right = new TreeNode(75);

        System.out.println("Breadth First Traversal=%s".format(BinaryTreeBreadthFirstTraversal.traverse(root).toString()));
    }
}
