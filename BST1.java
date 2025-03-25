public class BST1 {
    public static class Node {
        Node left;
        Node right;
        Student student;
        public Node(Student student) {
            this.student = student;
        }
    }

    private Node root;
    public void insert(Student newElem) {
        root = insertRoot(root, newElem);
    }

    private Node insertRoot(Node current, Student newElem) {
        if (current == null) {
            return new Node(newElem);
        }
        if (newElem.getName().compareTo(current.student.getName()) < 0) {
            if (current.left == null) {
                current.left = new Node(newElem);
            } else {
                if (newElem.getName().compareTo(current.left.student.getName()) < 0) {
                    current.left.left = insertRoot(current.left.left, newElem);
                }
                else {
                    current.left.right = insertRoot(current.left.right, newElem);
                    current.left = RotationL(current.left);
                }
            }
            current = RotationR(current);
        }
        else {
            if (current.right == null) {
                current.right = new Node(newElem);
            } else {
                if (newElem.getName().compareTo(current.right.student.getName()) > 0) {
                    current.right.right = insertRoot(current.right.right, newElem);
                }
                else
                {
                    current.right.left = insertRoot(current.right.left, newElem);
                    current.right = RotationR(current.right);
                }
            }
            current = RotationL(current);
        }

        return current;
    }
    private Node RotationR(Node current) {
        Node temp = current.left;
        current.left = temp.right;
        temp.right = current;
        current = temp;
        return current;
    }

    private Node RotationL(Node current) {
        Node temp = current.right;
        current.right = temp.left;
        temp.left = current;
        current = temp;
        return current;
    }
    public void find(String key) {
        System.out.println("Елемент з ключем: " + key);
        Node findN = findNode(root, key);
        if (findN == null) {
            System.out.println("Немає елементів з таким ключем!");
        } else {
            System.out.println(findN.student.toString());
        }
    }

    private Node findNode(Node current, String key) {
        if (current == null) {
            return null;
        }
        if (current.student.getName().compareTo(key) > 0) {
            return findNode(current.left, key);
        } else if (current.student.getName().compareTo(key) < 0) {
            return findNode(current.right, key);
        } else {
            return current;
        }
    }
}
