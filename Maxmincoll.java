import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
class Maxmincoll{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
ArrayList<Integer> list=new ArrayList<>(n);
for(int i=0;i<n;i++)
{list.add(sc.nextInt());}
System.out.println("Max: "+Collections.max(list));
System.out.println("Min: "+Collections.min(list));
}}
