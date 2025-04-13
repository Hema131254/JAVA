import java.util.*;
import java.util.ArrayList;
class TreeNode
{int data;
TreeNode left;
TreeNode right;
TreeNode(int data)
{this.data=data;}}
class mirror{
ArrayList<Integer> list1=new ArrayList<Integer>();
ArrayList<Integer> list2=new ArrayList<Integer>();
public void inorder(TreeNode root)
{if(root==null)
{return;}
inorder(root.left);
list1.add(root.data);
inorder(root.right);
}
public void invert(TreeNode root)
{
if(root==null)
{return;}
invert(root.left);
invert(root.right);
TreeNode temp=root.left;
root.left=root.right;
root.right=temp;
list2.add(root.data);
}
public static void main(String[] args)
{TreeNode root=new TreeNode(1);
root.left=new TreeNode(2);
root.right=new TreeNode(3);
mirror m=new mirror();
m.inorder(root);
m.invert(root);
if(m.list1.equals(m.list2))
{
System.out.println("true");
}
else
{
System.out.println("false");
}}
}