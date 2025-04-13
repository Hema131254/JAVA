import java.util.*;
class Node{
int data;
Node left;
Node right;
public Node(int data)
{this.data=data;
this.left=null;
this.right=null;
}}
class BinaryTree{
Node root;
int findheight(Node node)
{
if(node==null)
{return 0;}
else
{
int left_h=findheight(node.left);
int right_h=findheight(node.right);
if(left_h>right_h)
{return left_h+1;}
else
{return right_h+1;}
}}
int findheight()
{return findheight(root);}
public static void main(String[] args)
{BinaryTree tree=new BinaryTree();
tree.root=new Node(1);
tree.root.left=new Node(2);
tree.root.right=new Node(3);
tree.root.left.left=new Node(4);
tree.root.left.right=new Node(5);
int h=tree.findheight();
System.out.println(h);
}}