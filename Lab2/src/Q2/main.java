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
public class main {
    public static void main(String[] args) throws Exception {
        MyQueue q = new MyQueue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.first());
        System.out.println(q.first());
        q.traverse();
    }
}
