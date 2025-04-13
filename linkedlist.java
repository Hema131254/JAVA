class Node{
int data;
Node next;
Node(int data)
{
this.data=data;
this.next=null;
}}
class linkedlist{
public static void main(String[] args)
{
Node head=new Node(5);
head.next=new Node(8);
head.next.next=new Node(10);
head.next.next.next=new Node(4);
Node temp=head;
int sum=0;
while(temp!=null)
{sum+=temp.data;
temp=temp.next;
}
System.out.println(sum);
}}
