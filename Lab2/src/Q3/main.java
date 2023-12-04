/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

/**
 *
 * @author Anh Quan
 */
public class main {
    public static void main(String[] args) throws Exception {
        MyStack s = new MyStack(100);
        MyQueue q = new MyQueue(122);
        q.enqueue("12");
        q.enqueue("23");
        q.dequeue();
        q.traverse();
        
                 
        s.push("hihi");
        s.push("haha");
        s.push("huhu");
        System.out.println(s.pop());
        s.traverse();
    }
}
