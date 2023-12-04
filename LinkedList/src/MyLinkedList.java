/// set up linked list

public class MyLinkedList {

    public static class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

    ///// print out linked list
    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }

    ///////     add to the head of list
    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    //////   add to last of the list
    public static Node addTolast(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode == null) {
            return newNode;
        } else {
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return headNode;
    }

    //////          add value to index of list
    public static Node addToIndex(Node headNode, int value, int index) {
        if (index == 0) {
            return addToHead(headNode, value);
        } else {
            Node newNode = new Node(value);
            Node currentNode = headNode;
            int count = 0;
            while (currentNode != null) {
                count++;
                if (count == index) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }

        }
        return headNode;
    }

    /// remove head of list
    public static Node removeFirst(Node headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }
    
    
    public static Node removeLast(Node headNode) {
        Node lastNode = headNode;
        Node preNode= null;
        while (lastNode.next!=null ){
            preNode = lastNode;
            lastNode= lastNode.next;
        }
        if(preNode==null){
            return null;
        }else {
            preNode = lastNode.next;
        } 
        return headNode;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;  ///next n1 tro vao n2
        n2.next = n3;    // next n2 tro vao n3
        printLinkedList(n1);
        printLinkedList(n2);
        Node newList = new Node(4);
        n3.next = newList;
        n1 = addTolast(n1, 2);
        printLinkedList(n1);
        n1 = addToIndex(n1, 5, 1);
        printLinkedList(n1);
        printLinkedList(removeFirst(n1));
        printLinkedList(removeLast(n1));
    }
}
