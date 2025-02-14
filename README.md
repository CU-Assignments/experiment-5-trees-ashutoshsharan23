# Exp-5-Tree Data Structure

# Introduction

A Tree is a widely used non-linear data structure that represents a hierarchical relationship between elements. It consists of nodes connected by edges, with a single node as the root.

## Basic Terminology

>> Root: The topmost node in the tree.

>> Parent Node: A node that has child nodes.

>> Child Node: A node that is derived from a parent node.

>> Leaf Node: A node that has no children.

>> Subtree: A tree consisting of a node and its descendants.

>> Depth: The length of the path from the root to a given node.

>> Height: The longest path from a node to a leaf.

>> Degree: The number of children a node has.

### Types of Trees

>> Binary Tree: A tree where each node has at most two children.

>> Binary Search Tree (BST): A binary tree in which the left subtree contains smaller values, and the right subtree contains larger values.

>> Balanced Binary Tree: A tree where the height difference between left and right subtrees is minimized.

>> AVL Tree: A self-balancing BST where the height difference is at most 1.

>> Red-Black Tree: A self-balancing BST using color properties to maintain balance.

>> Heap: A tree-based data structure satisfying the heap property (Max Heap, Min Heap).

>> Trie (Prefix Tree): A tree used for searching words efficiently.

>> N-ary Tree: A tree where each node can have at most N children.

#### Tree Traversal Methods

>> Depth-First Search (DFS):

>> Inorder (LNR): Left → Root → Right

>> Preorder (NLR): Root → Left → Right

>> Postorder (LRN): Left → Right → Root

>> Breadth-First Search (BFS):

>> Level Order Traversal: Traverses each level from left to right.

##### Applications of Trees

>> Databases (B-Trees, B+ Trees for indexing)

>> Compilers (Syntax Trees, Parse Trees)

>> Computer Networks (Routing Algorithms, Spanning Trees)

>> Artificial Intelligence (Decision Trees, Game Trees)

>> Operating Systems (File System Hierarchies, Process Scheduling Trees)

>> Cryptography (Merkle Trees in Blockchain)

### Example: Binary Tree

```
// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeInorder {
    // Recursive inorder traversal
    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        // Example: Constructing a Binary Tree
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Perform inorder traversal
        System.out.print("Inorder Traversal: ");
        inorderTraversal(root);
    }
}

```

# Example Usage
root = TreeNode(1)
root.right = TreeNode(2)
root.right.left = TreeNode(3)
print(inorder_traversal(root))  # Output: [1, 3, 2]


