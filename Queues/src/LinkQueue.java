/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class LinkQueue {
    Node back;
    Node front;
    int size;

    public LinkQueue() {
        this.back = null;
        this.front = null;
        this.size =0;
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size()==0;
    }
    public void enqueue(Student s){
        Node newNode = new Node(s);
        if(isEmpty()) {
            this.back = newNode;
            this.front= newNode;
            this.size++;
        }
        else {
            this.back.next = newNode;
            this.back = newNode;
            this.size++;
        }
    }
    
    public Student dequeue(){
        if(isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        Student s = this.front.data;
        this.front = this.front.next;
        this.size--;
        return s;
        
    }
    public void traverse(){
        Node current = this.front;
        while(current!= null){
                current.data.display();
                current = current.next;
        }
    }
    
}
