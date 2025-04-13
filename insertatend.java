class Node{
int data;
Node next;
Node(int data){
this.data=data;
this.next=null;
}
}
class insertatend{
public static void main(String[] args)
{
Node head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(3);
Node n=new Node(5);
Node temp=head;
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=n;
temp=head;
while(temp!=null)
{
System.out.print(temp.data+" ");
temp=temp.next;
}
}}
