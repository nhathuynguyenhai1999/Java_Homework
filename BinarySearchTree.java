public class BinarySearchTree {
    Node root;

    // Hàm xóa một phần tử trong BST
    private Node deleteNode(Node root, int key) {
        // Bước 1: Xác định nút cần xóa và nút cha của nó
        Node[] nodes = findNodeAndParent(root, key);
        Node nodeToDelete = nodes[0];
        Node parent = nodes[1];

        // Nếu không tìm thấy phần tử cần xóa
        if (nodeToDelete == null) {
            System.out.println("Không tìm thấy phần tử cần xóa");
            return root;
        }

        // Trường hợp 1: Nút cần xóa không có nút con trái
        if (nodeToDelete.left == null) {
            if (parent == null) {
                // Nút cần xóa là root
                return nodeToDelete.right;
            } else {
                // Nút cần xóa không phải là root
                if (parent.left == nodeToDelete) {
                    parent.left = nodeToDelete.right;
                } else {
                    parent.right = nodeToDelete.right;
                }
            }
        }
        // Trường hợp 2: Nút cần xóa có nút con trái
        else {
            // Tìm nút lớn nhất ở cây con trái
            Node[] maxNodeAndParent = findMaxNodeAndParent(nodeToDelete.left);
            Node maxNode = maxNodeAndParent[0];
            Node maxParent = maxNodeAndParent[1];

            // Sao chép giá trị từ nút lớn nhất sang nút cần xóa
            nodeToDelete.key = maxNode.key;

            // Xóa nút lớn nhất
            if (maxParent.left == maxNode) {
                maxParent.left = maxNode.left;
            } else {
                maxParent.right = maxNode.left;
            }
        }

        return root;
    }

    // Hàm tìm nút cần xóa và nút cha của nó
    private Node[] findNodeAndParent(Node root, int key) {
        Node current = root;
        Node parent = null;

        Node[] nodes = new Node[2];
        nodes[0] = current;
        nodes[1] = parent;

        return nodes;
    }

    // Hàm tìm nút lớn nhất và nút cha của nó
    private Node[] findMaxNodeAndParent(Node root) {
        Node maxNode = root;
        Node maxParent = null;

        while (maxNode.right != null) {
            maxParent = maxNode;
            maxNode = maxNode.right;
        }

        Node[] nodes = new Node[2];
        nodes[0] = maxNode;
        nodes[1] = maxParent;

        return nodes;
    }

    // Các hàm khác ở giữa giữa không thay đổi

    // ...

    // Main method
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Node root = null;

        // Chèn các phần tử vào BST
        int[] keys = {50, 30, 70, 20, 40, 60, 80};
        for (int key : keys) {
            root = tree.insert(root, key);
        }

        System.out.println("In-order traversal trước khi xóa:");
        tree.inOrderTraversal(root);
        System.out.println();

        // Xóa một phần tử trong BST
        int keyToDelete = 30;
        root = tree.deleteNode(root, keyToDelete);

        System.out.println("In-order traversal sau khi xóa phần tử " + keyToDelete + ":");
        tree.inOrderTraversal(root);
    }

    private Node insert(Node root, int key) {

        return root;
    }


    private void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.key + " ");
            inOrderTraversal(root.right);
        }
    }
}




