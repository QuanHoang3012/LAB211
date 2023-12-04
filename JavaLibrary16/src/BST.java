
import java.util.ArrayList;
import java.util.List;


public class BST {
    TreeNode root;
    
    public BST(){
        this.root = null;
    }
    
    public TreeNode insert(TreeNode root, int value){
        TreeNode newNode = new TreeNode(value);
        if(root == null){
            root = new TreeNode(value);
        }
        else {
            TreeNode temp = root;
            while (true){
                if(value > temp.value){
                    if(temp.right == null){
                        temp.right = newNode;
                        break;
                    }else
                    temp = temp.right;
                }else {
                     if(temp.left == null){
                        temp.left = newNode;
                        break;
                    }else
                    temp = temp.left;
                }
            }
        }
        return root;
    }
    public TreeNode findLeftModeNode(TreeNode root){
        if(root == null ) return null ;
        TreeNode leftMode = root;
        while(leftMode.left != null){
            leftMode= leftMode.left;

        }
             return leftMode;
     }
    
    public TreeNode deleteNode(TreeNode root , int key){
        if(root == null) {
            return null;
        }
        else {
            if(key < root.value) {
                root.left=deleteNode(root.left, key);
            }else if(key>root.value) {
               root.right=  deleteNode(root.right, key);
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
        return root;
    }
    
    public TreeNode searchBST(TreeNode root, int key){
        if(root == null) return null;
        if(key<root.value) {
            return searchBST(root.left, key);
        }else if(key>root.value) return searchBST( root.right, key);
        else return root;
    }   
    /// traverse  pre [ node -> left -> right]
    ////               in   [ left -. node -.> right]
    ////               post[ left -> right -> left]  
    List<Integer> duyetOrder = new ArrayList<>();
    public void preOrder (TreeNode currentNode){
        if(currentNode == null) return ;
        System.out.print(currentNode.value+" ");
        preOrder(currentNode.left);
        preOrder(currentNode.right);
    }
    public List<Integer> preOrderTraverse (TreeNode root){
        if(root == null) return duyetOrder ;
        duyetOrder.add(root.value);
        preOrder(root.left);
        preOrder(root.right);
        return duyetOrder;
    }
     public void inOrder (TreeNode currentNode){
        if(currentNode == null) return ;
        
        inOrder(currentNode.left);
        System.out.print(currentNode.value+" ");
        inOrder(currentNode.right);
    }
       public void postOrder (TreeNode currentNode){
        if(currentNode == null) return ;

        postOrder(currentNode.left);
       
        postOrder(currentNode.right);
         System.out.print(currentNode.value+" ");
    }
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        int result = Math.max(rightDepth, leftDepth) +1;
        return result;
    }
    
    public boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }
    public boolean duyet (TreeNode curNode, int curSum, int targetSum){
        if(curNode == null) return false;
        curSum += curNode.value;
        if(isLeaf(curNode)) {
            return curSum == targetSum;
        }
        boolean kqBenTrai = duyet(curNode.left, curSum, targetSum);
        boolean kqBenPhai = duyet(curNode.right, curSum, targetSum);
        return kqBenPhai || kqBenTrai;
    }
    public boolean hasPathSum(TreeNode root, int targetSum){
        return duyet(root, 0, targetSum);
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
