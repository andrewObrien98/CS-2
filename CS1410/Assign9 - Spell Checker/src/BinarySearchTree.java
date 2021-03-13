

public class BinarySearchTree<E extends Comparable<E>> {
    private class TreeNode<E> {
        public E value;
        public TreeNode<E> left;
        public TreeNode<E> right;
    }

    private TreeNode<E> root;

    public boolean insert(E value) {
        if (search(value)) {
            return false;
        }
        if (root == null) {
            TreeNode<E> node = new TreeNode<>();
            node.value = value;
            root = node;
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                parent = current;
                if (current.value.compareTo(value) < 0 ){ //current.value < value ) {
                    current = current.right;
                } else {
                    current = current.left;
                }
            }

            TreeNode<E> newNode = new TreeNode<>();
            newNode.value = value;
            if (parent.value.compareTo(value) < 0) { //parent.value < value
                parent.right = newNode;
            } else {
                parent.left  = newNode;
            }
        }
        return true;
    }

    public boolean search(E value) {
        TreeNode<E> current = root;
        while (current != null) {
            if (current.value.compareTo(value) == 0) {//current.value == value
                return true;
            } else if (current.value.compareTo(value) < 0) {//current.value < value
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return false;
    }

    public void display(String message) {
        System.out.println(message);
        display(root);
    }

    private void display(TreeNode<E> node) {
        if (node == null) return;
        display(node.left);
        System.out.println(node.value);
        display(node.right);
    }

    public int numberNodes() {
        return numberNodes(root);
    }

    private int numberNodes(TreeNode<E> node) {
        if(node == null) return 0;
        return 1 + numberNodes(node.left) + numberNodes(node.right);
    }


    public int numberLeafNodes() {
        return numberLeafNodes(root);
    }

    private int numberLeafNodes(TreeNode<E> node) {
        if(node == null) return 0;
        if(node.right == null && node.left == null) return 1;
        return numberLeafNodes(node.left) + numberLeafNodes(node.right);
    }

    public int height() {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right));
    }

    private int height(TreeNode<E> node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }


    public boolean remove(E value) {
        TreeNode<E> parent = null;
        TreeNode<E> node = root;
        boolean found = false;
        while(!found && node != null) {
            if (node.value.compareTo(value) < 0) { //node.value < value
                parent = node;
                node = node.right;
            } else if (node.value.compareTo(value) > 0) { //node.value > value
                parent = node;
                node = node.left;
            } else {
                found = true;
            }
        }

        if (!found) return false;

        if (node.left == null) {
            if (parent == null) {
                root = node.right;
            } else if (parent.value.compareTo(value) < 0) { //parent.value < value
                parent.right = node.right;
            } else {
                parent.left = node.right;
            }
        } else {
            TreeNode<E> parentOfRight = node;
            TreeNode<E> rightMost = node.left;
            while(rightMost.right != null) {
                parentOfRight = rightMost;
                rightMost = rightMost.right;
            }

            node.value = rightMost.value;

            if (parentOfRight.right == rightMost) {
                parentOfRight.right = rightMost.left;
            } else {
                parentOfRight.left = rightMost.left;
            }
        }
        return true;
    }



}

