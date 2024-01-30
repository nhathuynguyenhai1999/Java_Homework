package James_Module2;

public class TreeNode<E extends Comparable<E>> implements TreeNode01 {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }

    public TreeNode() {

    }

    public interface Tree<E> {
        /**
         * Insert element e into the binary search tree.
         * Return true if the element is inserted successfully.
         */
        void insert(E e);

        /**
         * Inorder traversal from the root
         */
        void inorder();

        /**
         * Get the number of nodes in the tree
         */
        int getSize();
    }

    static class AbstractTree<E extends Comparable<E>> implements Tree<E> {
        protected TreeNode<E> root;

        @Override
        public int getSize() {
            return getSize(root);
        }

        private int getSize(TreeNode<E> root) {
            if (root == null) return 0;
            return 1 + getSize(root.left) + getSize(root.right);
        }

        @Override
        public void inorder() {
            inorder(root);
        }

        private void inorder(TreeNode<E> root) {
            if (root == null) return;
            inorder(root.left);
            System.out.println(root.element + " ");
            inorder(root.right);
        }

        @Override
        public void insert(E e) {
            root = insert(root, e);
        }

        private TreeNode<E> insert(TreeNode<E> root, E e) {
            if (root == null) {
                return createNewNode(e); /*create a new root*/
            }

            /*locate the parent node*/
            if (e.compareTo(root.element) < 0) {
                root.left = insert(root.left, e);
            } else if (e.compareTo(root.element) > 0) {
                root.right = insert(root.right, e);
            } else {
                // Duplicate node not inserted
                return root;
            }

            return root;
        }

        private TreeNode<E> createNewNode(E e) {
            return new TreeNode<>(e);
        }
    }

    public static void main(String[] args) {
        //create a BST
        AbstractTree<String> tree = new AbstractTree<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
