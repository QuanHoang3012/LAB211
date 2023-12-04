/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class Main {
    public static void main(String[] args) {
        Student s1= new Student("122", "an");
        Student s2= new Student("123", "san");
        Student s3= new Student("124", "man");
        Student s4= new Student("125", "tan");
        ArrayQueue a = new ArrayQueue(10);
        LinkQueue  b = new LinkQueue();
        b.enqueue(s1);
        b.enqueue(s2);
        b.enqueue(s3);
        b.enqueue(s4);
        System.out.println(b.dequeue());
        b.traverse();
        
        
    }
}
