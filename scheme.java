import java.util.Scanner;
class scheme{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String parent=sc.nextLine();
String YN=sc.next();
if(YN.charAt(0)=='N')
{
System.out.println("TOTAL MEMBERS: 1");
System.out.println("COMMISSION DETAILS");
System.out.println(parent+" :"+250);
}
else if(YN.charAt(0)=='Y')
{
String child=sc.next();
String c[]=child.split(",");
System.out.println("TOTAL MEMBERS: "+(c.length+1));
System.out.println("COMMISSION DETAILS:");
System.out.println(parent+": "+(500+c.length*250));
for(int i=0;i<c.length;i++)
{
System.out.println(c[i]+": "+250);
}
}
}}