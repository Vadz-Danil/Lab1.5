public class BST {
    public static class Node {
        Node left;
        Node right;
        Student student;
        public Node(Student student) {
            this.student = student;
        }
    }
    private Node root;
    public void insert(Student newElement) {
        root = insertNode(root, newElement);
    }
    private Node insertNode(Node current, Student newElement) {
        if (current == null) {
            return new Node(newElement);
        }
        if (newElement.getName().compareTo(current.student.getName()) < 0) {
            current.left = insertNode(current.left, newElement);
            current = RotationRight(current);
        }
        else {
            current.right = insertNode(current.right, newElement);
            current = RotationLeft(current);
        }
        return current;
    }
    private Node RotationRight(Node current) {
        Node temp = current.left;
        current.left = temp.right;
        temp.right = current;
        current=temp;
        return current;
    }
    private Node RotationLeft(Node current) {
        Node temp = current.right;
        current.right = temp.left;
        temp.left = current;
        current=temp;
        return current;
    }
    public void find(String key){
        System.out.println("Елемент з ключем: " + key);
        Node findN=findNode(root,key);
        if (findN == null){
            System.out.println("Немає елементів з таким ключем!");
        }
        else {
            System.out.println(findN.student.toString());
        }
    }
    private Node findNode(Node current,String key){
        if(current==null){
            return null;
        }
        if(current.student.getName().compareTo(key)>0){
            current=findNode(current.left,key);
        }
        else if(current.student.getName().compareTo(key)<0){
            current=findNode(current.right,key);
        }
        else {
            return current;
        }
        return current;
    }
    public void print(){
        preOrder(root);
    }
    private void preOrder(Node current){
        if(current==null){
            return;
        }
        System.out.println(current.student.toString());
        preOrder(current.left);
        preOrder(current.right);
    }
}

