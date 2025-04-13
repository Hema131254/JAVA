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
System.out.println(h);
System.out.println(l);
System.out.println(t );
}}


