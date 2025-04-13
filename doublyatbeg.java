class Node{
int data;
Node pre;
Node next;
Node(int data){
this.data=data;
this.pre=null;
this.next=null;
}}
class doublyatbeg{
public static void main(String[] args)
{
Node head=new Node(1);
head.next=new Node(2);
(head.next).pre=head;
head.next.next=new Node(3);
(head.next.next).pre=head.next;
head.next.next.next=new Node(4);
(head.next.next.next).pre=head.next.next;
Node n=new Node(5);
n.next=head;
head.pre=n;
head=n;
Node temp=head;
while(temp.next!=null)
{System.out.print(temp.data);
temp=temp.next;
}
}}
