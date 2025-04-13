import java.util.Scanner;
class Smallest{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int result[]=new int[n];
for(int i=0;i<n;i++)
{arr[i]=sc.nextInt();}
result[0]=-1;
for(int i=1;i<n;i++)
{
result[i]=-1;
for(int j=i-1;j>=0;j--)
{
if(arr[j]<arr[i])
{
result[i]=arr[j];
break;
}
}
}
for(int i=0;i<n;i++)
{
System.out.print(result[i]+" ");}
}}
