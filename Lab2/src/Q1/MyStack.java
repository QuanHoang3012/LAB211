/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import java.util.EmptyStackException;

/**
 *
 * @author Anh Quan
 */
public class MyStack {
    private int capacity ;
    private int [] value = new int[capacity];
    private int size;

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.value = new int[capacity];
    }
      public boolean isEmpty(){
          return this.size() == 0;
      }
    public int size(){
        return this.size;
    }
    
   public void push(int s){
       if(this.size > this.capacity) return;
       else {
       value[this.size()] = s;
       this.size++;
   }
   }
   public int  pop(){
       if(this.isEmpty()){
          throw new EmptyStackException();
       }
       int s = value[this.size()-1];
       this.size--;
       return s;
   }
    public int  top(){
       if(this.isEmpty()){
          throw new EmptyStackException();
       }
       int s = value[this.size()-1];
       return s;
   }
    public void clear(){
        this.size =0;
    }
    
   public void traverse () {
       for(int i=this.size-1;i>=0;i--){
           System.out.print(value[i]);
       }
   }
}
