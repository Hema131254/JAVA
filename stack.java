class stack
{
static int MAX_SIZE=5;
static int top=-1;
static int stack[]=new int[MAX_SIZE];
public static void push(int n)
{
if(top+1==MAX_SIZE)
{
System.out.println("OverFlow");
}
else
{
top++;
stack[top]=n;
}
}
public static void pop()
{
if(top==-1)
{
System.out.println("Underflow");
}
else
{
top--;
}
}
public static void top()
{
if(top==-1)
{
System.out.println("Empty");
}
else
{
System.out.println("Top of Stack:"+stack[top]);
}
}
public static void print()
{
for(int i=0;i<=top;i++)
{
System.out.println(stack[top]);
}}
public static void main(String[] args)
{
pop();
push(1);
push(2);
push(3);
print();
}
}
