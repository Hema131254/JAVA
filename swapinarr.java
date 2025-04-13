import java.util.Scanner;
class swapinarr{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i1=sc.nextInt();
int i2=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
arr.get(i1)=arr.get(i1)+arr.get(i2);
arr.get(i2)=arr.get(i1)-arr.get(i2);
arr.get(i1)=arr.get(i1)-arr.get(i2);
System.out.println(arr);
}}


