class Node{
int data;
Node pre;
Node next;
Node(int data){
this.data=data;
this.pre=null;
this.next=null;
}}
class doublylinked{
public static void main(String[] args)
{
Node head=new Node(1);
head.next=new Node(2);
(head.next).pre=head;
head.next.next=new Node(3);
(head.next.next).pre=head.next;
head.next.next.next=new Node(2);
(head.next.next.next).pre=head.next.next;
head.next.next.next.next=new Node(1);
(head.next.next.next.next).pre=head.next.next.next;
Node temp=head;
while(temp.next!=null)
{temp=temp.next;
}
Node temp1=head;
boolean flag=true;
while(temp!=temp1)
{
if(temp.data!=temp1.data)
{flag =false;
break;}
temp1=temp1.next;
temp=temp.pre;
}
if(flag==true)
{System.out.println("Palindrome");
}
else
{
System.out.println("Not a palindrome");}
}}
