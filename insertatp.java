import java.util.Scanner;
class Node{
int data;
Node next;
Node(int data)
{
this.data=data;
this.next=null;
}
}
class insertatp{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
Node head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(3);
head.next.next.next=new Node(4);
Node temp=head;
for(int i=1;i<p-1;i++)
{
temp=temp.next;
}
Node n=new Node(5);
n.next=temp.next;
temp.next=n;
temp=head;
while(temp!=null)
{System.out.print(temp.data+" ");
temp=temp.next;
}
}
}
