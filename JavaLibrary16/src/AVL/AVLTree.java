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
public class AVLTree {
    TreeNode root;

    public AVLTree() {
        this.root = null;
    }
    
    public int height(TreeNode root){
        if(root == null) {
            return 0;
        }
        return root.height;
    }
    
    public int max(int a, int b){
        return (a>b) ? a :b;
    }
    
    public TreeNode rightRotate(TreeNode y){
        TreeNode x = y.left;
        TreeNode T2 = x.right;
        
        x.right =y;
        y.left =T2;
        
        y.height = max(height(y.left), height(y.right))+1;
         x.height = max(height(x.left), height(x.right))+1;
        return x;
    }
    
    public TreeNode leftRotate(TreeNode x){
        TreeNode y = x.right;
        TreeNode T2 =y.left;
        
        y.left =x;
        x.right = T2;
        y.height = max(height(y.left), height(y.right))+1;
         x.height = max(height(x.left), height(x.right))+1;
        return y;
    }
    
    public int getBalance(TreeNode root){
        if(root == null) return 0;
        return height(root.left)-height(root.right);
    }
    
    public TreeNode insert (TreeNode root, int value){
        TreeNode newNode = new TreeNode(value);
         if(root == null) 
             return newNode;
         if(value<root.value)
             root.left = insert(root.left,value);
         else if (value > root.value)
             root.right = insert(root.right,value);
         else 
             return root;
         root.height = 1+ max(height(root.left),height(root.right));
         int balance = getBalance(root);
         if(balance >1 && value <root.left.value)
             return rightRotate(root);
         if(balance<-1 && value> root.right.value)
             return leftRotate(root);
        if (balance > 1 && value > root.left.value) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && value < root.right.value) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    public void preOrder (TreeNode currentNode){
        if(currentNode == null) return ;
        System.out.print(currentNode.value+" ");
        preOrder(currentNode.left);
        preOrder(currentNode.right);
    }
    
    public TreeNode findLeftModeNode(TreeNode root){
        if(root == null ) return null ;
        TreeNode leftMode = root;
        while(leftMode.left != null){
            leftMode= leftMode.left;

        }
             return leftMode;
     }
    
    public TreeNode deleteNode(TreeNode root , int value){
        if(root == null) {
            return null;
        }
        else {
            if(value < root.value) {
                root.left=deleteNode(root.left, value);
            }else if(value>root.value) {
               root.right=  deleteNode(root.right, value);
            }else {
                if(root.left == null && root.right == null){
                    return null;
                }
                if(root.left == null && root.right != null) return root.right;
                if(root.right == null && root.left != null) return root.left;
                TreeNode leftModeNode =     findLeftModeNode(root.right);
                root.value = leftModeNode.value;
                root.right = deleteNode(root.right, leftModeNode.value);
            }
        }

        // Update the balance factor of each node and balance the tree
    root.height = max(height(root.left), height(root.right)) + 1;
    int balance = getBalance(root);
         if(balance >1 && value <root.left.value)
             return rightRotate(root);
         if(balance<-1 && value> root.right.value)
             return leftRotate(root);
        if (balance > 1 && value > root.left.value) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && value < root.right.value) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
    return root;
    }
    public void printTree(TreeNode currPtr, String indent, boolean last) {
    if (currPtr != null) {
      System.out.print(indent);
      if (last) {
        System.out.print("R----");
        indent += "   ";
      } else {
        System.out.print("L----");
        indent += "|  ";
      }
      System.out.println(currPtr.value);
      printTree(currPtr.left, indent, false);
      printTree(currPtr.right, indent, true);
    }
  }
    
    
}
