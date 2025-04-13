import java.util.Scanner;
import java.util.ArrayList;
class listoflist{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
for(int i=0;i<r;i++)
{
ArrayList<Integer> temp=new ArrayList<>();
for(int j=0;j<c;j++)
{temp.add(sc.nextInt());
}
list.add(temp);
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(list.get(i).get(j)+" ");
}
System.out.println();
}
}
}