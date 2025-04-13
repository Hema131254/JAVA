import java.util.Scanner;
class input{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int sum=0;
while(true)
{
String num=sc.nextLine();

if(num.isEmpty())
{
break;
}
int n=Integer.parseInt(num);
sum+=n;
}
System.out.println("Sum: "+sum);
}
} 