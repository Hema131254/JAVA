import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Scanner;
class unique{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
ArrayList<Integer> list=new ArrayList<Integer>(n);
for(int i=0;i<n;i++)
{list.add(sc.nextInt());}
HashSet<Integer> h=new HashSet<Integer>(list);
LinkedHashSet<Integer> l=new LinkedHashSet<Integer>(list);
TreeSet<Integer> t=new TreeSet<Integer>(list);
sc.nextLine();
char m=sc.nextLine().charAt(0);
switch(m)
{
case 'H':
for(int num:h)
{System.out.print(num+" ");}
break;
case 'L':
for(int num:l)
{System.out.print(num+" ");}
break;
case 'T':
for(int num:t)
{System.out.print(num+" ");}
break;
default:
System.out.println("Invalid");
}
sc.close();
}}


