class Node{
int data;
Node next;
Node(int data)
{this.data=data;
this.next=null;
}}
class mergelinked{
public static void main(String[] args)
{
Node head1=new Node(1);
head1.next=new Node(2);
head1.next.next=new Node(3);
Node head2=new Node(4);
head2.next=new Node(5);
head2.next.next=new Node(6);
Node temp=head1;
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=head2;
temp=head1;
while(temp!=null)
{
System.out.print(temp.data+" ");
temp=temp.next;
}
}}