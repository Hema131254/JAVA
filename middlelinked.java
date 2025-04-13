class Node
{
int data;
Node next;
Node(int data)
{
this.data=data;
this.next=null;
}}
class middlelinked
{
public static void main(String[] args)
{
Node head=new Node(10);
head.next=new Node(67);
head.next.next=new Node(88);
Node temp=head;
int count=0;
while(temp!=null)
{
count++;
temp=temp.next;
}
temp=head;
for(int i=0;i<count/2;i++)
{
temp=temp.next;
}
System.out.println(temp.data);
}}