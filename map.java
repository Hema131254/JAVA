import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;
class map{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
Map<Integer,Integer> map=new HashMap<>();
for(int i=1;i<=N;i++)
{
int rollno=sc.nextInt();
int value=sc.nextInt();
map.put(rollno,value);
}
int max=Collections.max(map.values());
int min=Collections.min(map.values());
for(Map.Entry<Integer,Integer> e:map.entrySet())
{
if(e.getValue()==max)
{System.out.println(e.getKey());}}
for(Map.Entry<Integer,Integer> e:map.entrySet())
{if(e.getValue()==min)
{System.out.println(e.getKey());}}
}} 