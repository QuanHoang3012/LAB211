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
        BST tree = new BST();
        TreeNode root1 = new TreeNode(2);
        
       
          tree.root =  tree.insert(root1, 3);
           tree.root =  tree.insert(root1, 4);
            tree.root =  tree.insert(root1, 5);
            tree.root = tree.insert(root1, 1);
         
        tree.postOrder(tree.root);
        System.err.println();
        tree.printTree(root1, "", true);
    }
}
