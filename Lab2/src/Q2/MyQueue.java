/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author Anh Quan
 */
public class MyQueue {
    private int [] value;
    private int size;
    private int cap;
    private int front;
    private int back;

    public MyQueue( int cap) {
        this.cap = cap;
        this.front = -1;
        this.back =-1;
        this.value = new int[this.cap];
        this.size =0;
    }
    
    public boolean isEmpty(){
        return this.size ==0;
    }
   
    
    public int size(){
        return this.size;
    }
    
    public void enqueue(int s){
        if(this.size() == this.cap) {
            System.err.println("List is full");
            return;
        }
        else {
            this.back++;
            this.back = this.back%this.cap;
            value[this.back]= s;
            this.size++;
        }
    }
    
    public boolean isQueueEmpty(){
        return this.size() == 0;
    }
    public int dequeue() throws Exception{
        if(isQueueEmpty()){
           throw new Exception();
        }
        this.front++;
        this.front =this.front%this.cap;
        int  s = value[front];
        this.size--;
        return s;
    }
    
    public int first() throws Exception{
         if(isQueueEmpty()){
           throw new Exception();
        }
         int temp = (this.front+1)%this.cap;
        int  s = value[temp];
        return s;
    }
    
    public void traverse(){
        for(int i=0;i<this.size;i++){
            System.out.print(this.value[(this.front+i+1)%this.cap]+" ");
        }
    }
}
