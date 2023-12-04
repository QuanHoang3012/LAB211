/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

/**
 *
 * @author Anh Quan
 */
public class main {
    public static void main(String[] args) throws Exception {
        MyQueue q = new MyQueue(122);
        MyStack s = new MyStack(23);
        s.push('2');
        s.push('4');
         s.traverse();
        q.enqueue('2');
        q.enqueue('3');
        q.enqueue('4');
        System.out.println(q.dequeue());
        System.out.println(q.first());
        q.traverse();
    }
}
