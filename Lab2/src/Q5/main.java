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
public class main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(30);
        stack.push(new Student("he18323", "An"));
        stack.push(new Student("he18323", "Quan"));
        System.out.println(stack.peek());
        stack.traverse();
        Student s1= new Student("122", "an");
        Student s2= new Student("123", "san");
        Student s3= new Student("124", "man");
        Student s4= new Student("125", "tan");
        MyQueue  b = new MyQueue(2323);
        b.enqueue(s1);
        b.enqueue(s2);
        b.enqueue(s3);
        b.enqueue(s4);
        System.out.println(b.dequeue());
        b.traverse();
    }
}
