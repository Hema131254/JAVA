import java.util.Scanner;
class countpaths
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
System.out.println(countpaths(n,m));
sc.close();
}
public static int countpaths(int n,int m)
{
if(n==1||m==1)
{return 1;}
else
{
return countpaths(n,m-1)+countpaths(n-1,m);
}
}
}