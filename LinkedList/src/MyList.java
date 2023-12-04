
import com.sun.org.apache.xalan.internal.xsltc.dom.CurrentNodeListFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Anh Quan
 */
public class MyList {

    Node head;
    Node tail;
    private int size;

    public MyList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void addFirst(int x) {
        Node newNode = new Node(x);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.size++;
        } else {
            newNode.next = this.head;  //   
            this.head = newNode;
            this.size++;
        }
    }

    public void addLast(int x) {
        Node newNode = new Node(x);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.size++;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++;
        }
    }

    public void addBeforeK(int x, int k) {
        if (k < 0 || k >this.size) {
            return;
        }
        int count = 0;
        Node before = this.head;
        Node current = this.head;
        while (current != null) {
            count++;
            if (count == k) {
                Node newNode = new Node(x);
                before.next = newNode;
                newNode.next = current;
                this.size++;
                break;
            }
            before = current;
            current = current.next;
        }
    }

    public void traverse() {
        if (this.head == null) {
            return;
        } else {
            Node temp = this.head;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
                temp = temp.next;
            }
        }
    }

    public void addAfterK(int x, int k) {

        if (k < 0 || k >= this.size) {
            return;
        }
        int count = 0;
        Node before = this.head;
        Node current = this.head;
        while (current != null) {
            count++;
            if (count == k + 1) {
                Node newNode = new Node(x);
                before.next = newNode;
                newNode.next = current;
                this.size++;
                break;
            }
            before = current;
            current = current.next;
        }
    }

}
