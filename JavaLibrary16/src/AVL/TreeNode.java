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
public class TreeNode {
     int value,height;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        this.value = x;
        this.left = null;
        this.right = null;
        this.height =1;
    }
}
