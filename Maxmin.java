import java.util.*;
class Maxmin{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int arr[]=new int[num];
for(int i=0;i<num;i++)
{
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
System.out.println("Max: "+arr[num-1]);
System.out.println("Min: "+arr[0]);
}}

