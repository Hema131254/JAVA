import java.util.*;
class postfix
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String as[]=str.split(" ");
Stack<Integer> stack=new Stack<Integer>();
for(int i=0;i<as.length;i++)
{
try
{
int n=Integer.parseInt(as[i]);
stack.push(n);
}
catch(Exception e)
{
int n2=stack.pop();
int n1=stack.pop();
int result=0;
switch(as[i])
{
case "+":
result=n1+n2;
break;
case "-":
result=n1-n2;
break;
case "*":
result=n1*n2;
break;
case"/":
result=n1/n2;
break;
}
stack.push(result);
}}
System.out.println(stack.peek());
}}

