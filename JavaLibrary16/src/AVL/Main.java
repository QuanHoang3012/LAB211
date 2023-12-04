/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVL;



/**
 *
 * @author Anh Quan
 */
public class Main {
    public static void main(String[] args) {
          AVLTree tree = new AVLTree();
         tree.root =  tree.insert(tree.root, 2);
          tree.root =  tree.insert(tree.root, 3);
           tree.root =  tree.insert(tree.root, 4);
            tree.root =  tree.insert(tree.root, 5);
            tree.root = tree.insert(tree.root, 1);
            tree.preOrder(tree.root);
            tree.printTree(tree.root, "", true);
    }
}
