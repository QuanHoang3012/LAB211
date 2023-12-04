/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q5;

/**
 *
 * @author Anh Quan
 */
public class MyQueue {
    private Student[] students;
    private int size;
    private int cap;
    private int front;
    private int back;

    public MyQueue( int cap) {
        this.cap = cap;
        this.front = -1;
        this.back =-1;
        this.students = new Student[this.cap];
        this.size =0;
    }
    
    
   
    
    public int size(){
        return this.size;
    }
    
    public void enqueue(Student s){
        if(this.size() == this.cap) {
            System.err.println("List is full");
            return;
        }
        else {
            this.back++;
            this.back = this.back%this.cap;
            students[this.back]= s;
            this.size++;
        }
    }
    
    public boolean isQueueEmpty(){
        return this.size() == 0;
    }
    public Student dequeue(){
        if(isQueueEmpty()){
            return null;
        }
        this.front++;
        this.front =this.front%this.cap;
        Student s = students[front];
        students[front] = null;
        this.size--;
        return s;
    }
    public void clear(){
        this.size =0;
    }
    public void traverse(){
        for(int i=0;i<this.size;i++){
            this.students[(this.front+i+1)%this.cap].display();
        }
    }
    
}
