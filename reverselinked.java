class Node
{
int data;
Node next;
Node(int data)
{this.data=data;
this.next=null;
}
}
class reverselinked
{public static void main(String[] args)
{
Node head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(3);
head.next.next.next=new Node(4);
Node prev=null;
Node current=head;
Node forward;
while(current!=null)
{
forward=current.next;
current.next=prev;
prev=current;
current=forward;
}
head=prev;
current=prev;
while(current!=null)
{
System.out.print(current.data+" ");
current=current.next;
}
}}
