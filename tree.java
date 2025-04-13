class TreeNode{
int data;
TreeNode left;
TreeNode right;
TreeNode(int data)
{this.data=data;}}
class tree
{
public static void main(String args);
TreeNode root=new TreeNode(1);
root.left=new TreeNode(2);
root.right=new TreeNode(3);
root.left.left=new TreeNode(4);
root.left.right=new TreeNode(5);
root.right.left=new TreeNode(6);
root.right.right=new TreeNode(7);
TreeNode temp=root;
while(left!=null && right!=null)
{
System.out.print(temp,temp.left,temp.right);
temp=temp.left;
temp=temp.right;
}
}
}