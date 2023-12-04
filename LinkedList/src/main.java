/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class main {
    public static void main(String[] args) {
        MyList linkedList = new MyList();
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.addLast(10);
        linkedList.addBeforeK(9, 3);
        linkedList.addAfterK(4, 4);
        System.out.println(linkedList.size());
        linkedList.traverse();
    }
}
