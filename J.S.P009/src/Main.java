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
        Graph p = new Graph(5);
        p.addEdge(1, 4);
        p.addEdge(4, 2);
        p.addEdge(4, 5);
        p.addEdge(2, 5);
        p.addEdge(5, 3);
        System.out.println(p.checkEdge(1, 2));
    }
}
