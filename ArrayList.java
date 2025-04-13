import java.util.ArrayList;
import java.util.Scanner;
class AL{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
ArrayList<Integer> a=new ArrayList<>(n);
for(int i=0;i<n;i++)
{int ele=sc.nextInt();
a.add(ele);
}
System.out.print(a);
}
}
