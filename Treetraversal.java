
import java.util.*;
class NewTree{
  int value;
  NewTree left,right;
  NewTree(int value){
    this.value=value;
    left=right=null;
  }
}
class TreeTraversal {
public void postorder(NewTree root) {
  if(root == null)
  return;

  postorder(root.left);
  postorder(root.right);
  System.out.print(root.value+" "); 
}
public void preorder(NewTree node){
    if(node==null)
    return;

    System.out.print(node.value+" ");
    preorder(node.left);
    preorder(node.right);
}
public void inorder(NewTree root){
    if(root==null)
    return;

   
    inorder(root.left);
    System.out.print(root.value+" ");
    inorder(root.right);
}

public static void main(String args[]) {
  
  NewTree root =new NewTree(4);
   root.left =new NewTree(2);
  root.right =new NewTree(5);
  root.left.left =new NewTree(3);
  root.right.left=new NewTree(7);
  root.right.right=new NewTree(6);
  root.right.right.left=new NewTree(8);
  root.left.left.right=new NewTree(9);
  root.left.left.right.left=new NewTree(1);
 TreeTraversal tree=new TreeTraversal();
  System.out.print("postorder traversal : ");
  tree.postorder(root);
  System.out.print("inorder traversal : ");
  tree.inorder(root);
  System.out.print("preorder traversal : ");
  tree.preorder(root);

}
}
