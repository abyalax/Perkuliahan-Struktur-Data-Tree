public class BinaryTree {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void insert(TreeNode input, int data) {
        if (data < input.data) {
            if (input.left != null) {
                insert(input.left, data);
            } else {
                System.out.println("Inserted " + data +
                        " to left of " + input.data);
                input.left = new TreeNode(data);
            }
        } else if (data > input.data) {
            if (input.right != null) {
                insert(input.right, data);
            } else {
                System.out.println("Inserted " + data
                        + " to right of " + input.data);
                input.right = new TreeNode(data);
            }
        }
    }

    public void PreOrder(TreeNode akar) {
        if (akar != null) {
            System.out.print(" " + akar.data);
            PreOrder(akar.left);
            PreOrder(akar.right);
        }
    }

    public void InOrder(TreeNode akar) {
        if (akar != null) {
            InOrder(akar.left);
            System.out.print(" " + akar.data);
            InOrder(akar.right);
        }
    }

    public void PostOrder(TreeNode akar) {
        if (akar != null) {
            PostOrder(akar.left);
            PostOrder(akar.right);
            System.out.print(" " + akar.data);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(5);

        tree.insert(root, 3);
        tree.insert(root, 7);
        tree.insert(root, 1);
        tree.insert(root, 4);

        
        System.out.print("PreOrder Traversal:");
        tree.PreOrder(root);
        System.out.println();

        System.out.print("InOrder Traversal:");
        tree.InOrder(root);
        System.out.println();

        System.out.print("PostOrder Traversal:");
        tree.PostOrder(root);
        System.out.println();
    }
}
