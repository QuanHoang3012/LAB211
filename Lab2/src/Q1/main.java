/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author Anh Quan
 */
public class main {
    public static void main(String[] args) {
        MyStack stack  = new MyStack(10);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack.pop());
//        System.out.println(stack.size());
//        stack.traverse();
        int decimal = 6;
        while (decimal !=0) {
            int remainder = decimal %2 ;
            stack.push(remainder);
            decimal/=2;
        }
        stack.traverse();
        
    }
}
