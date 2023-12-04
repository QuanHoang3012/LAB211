/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

/**
 *
 * @author Anh Quan
 */
public class DoubleLinkedList {
    Node head;
    Node tail;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size =0;
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    
    public void addFirst(int x){
        Node newNode = new Node(x);
        if(this.isEmpty()) {
            this.head = newNode;
            this.tail= newNode;
            this.size++;
        }
        else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
            this.size++;
        }
        
    }
    public void addLast(int x){
        Node newNode = new Node(x);
       if(this.head == null) {
            this.head = newNode;
            this.tail= newNode;
            this.size++;
        }
       else {
           this.tail.next = newNode;
           newNode.prev = this.tail;
           this.tail = newNode;
           this.size++;
       }
    }
    
    public void addBeforeK(int k,int x){
        Node current = this.head;
        Node before = this.head;
        int count =0;
        while (current.next!= null){
            
        if(count==k){
            Node newNode = new Node(x);
            newNode.next = before.next;
            before.next = newNode;
            newNode.prev= current.prev;
            current.prev = newNode;
            break;
        }
        before = current;
        current = current.next;
        count++;
        }   
        this.size++;
    }
    
    public void traverse(){
        if(this.head == null) {
            return;
        }
        else{
            Node temp = this.head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                if(temp.next!=null) System.out.print("->");
                else System.out.println();
                temp = temp.next;
            }
        }
    }
    
    
}
