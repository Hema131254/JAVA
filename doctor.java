import java.util.Scanner;
class doctor{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i=0;
int sum=0;
while(i<=20)
{
String num=sc.nextLine();

if(num.isEmpty())
{
break;
}
int n=Integer.parseInt(num);
if(n<=0 ||n>120)
{
System.out.println("INVALID INPUT");}
if(n>0 && n<17)
{sum+=200;}
else if(n>=17 && n<=40)
{sum+=400;}
else if(n>40)
{sum+=300;}
i++;
}
System.out.println("Sum: "+sum);
}
} 