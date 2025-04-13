import java.util.ArrayList;
import java.util.Scanner;
class MaxminAL{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
ArrayList<Integer> list=new ArrayList<>(n);
for(int i=0;i<n;i++)
{int ele=sc.nextInt();
list.add(ele);
}
int max=0;
int min=list.get(0);
for(int i=0;i<n;i++)
{
if(list.get(i)>max)
{max=list.get(i);}
if(list.get(i)<min)
{min=list.get(i);}
}
System.out.println("Max: "+max);
System.out.println("Min: "+min);
}}

