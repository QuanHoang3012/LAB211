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
public class main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst(1);
        list.addLast(5);
        list.addFirst(2);
        list.addFirst(0);
        list.addLast(3);
        list.addBeforeK(2, 9);
        list.traverse();
        System.out.println();
        System.out.println(list.size());
      
    }
}
