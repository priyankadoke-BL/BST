package BST;





public class main {
    public static void main(String[] args) {
     BST binarySearchTree = new BST();
        Node node = binarySearchTree.createTree();
        binarySearchTree.inorder(node);
        //  binarySearchTree.search(node,5);
    }
}