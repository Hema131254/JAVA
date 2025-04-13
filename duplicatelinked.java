class Node{
int data;
Node next;
Node(int data)
{
this.data=data;
this.next=null;
}}
class duplicatelinked
{
public static void main(String[] args)
{
Node head=new Node(2);
head.next=new Node(3);
head.next.next=new Node(4);
head.next.next.next=new Node(2);
head.next.next.next.next=new Node(3);
Node temp1=head;
Node temp2=head.next;
while(temp1!=null &&temp2!=null)
{
temp2=temp2.next;
if(temp1.data==temp2.data)
{
temp2=temp2.next;
}
temp1=temp1.next;
}
temp1=head;
while(temp1!=null)
{
System.out.print(temp1.data);
temp1=temp1.next;
}
}}