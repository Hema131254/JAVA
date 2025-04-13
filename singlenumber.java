import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
class singlenumber{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] nums={2,2,3,2};
ArrayList<Integer> list=new ArrayList<>();
TreeSet<Integer> set=new TreeSet<>();
for(int i=0;i<nums.length;i++)
{
list.add(nums[i]);
set.add(nums[i]);
}
for(int N:set)
{if(Collections.frequency(list,N)==1)
{
System.out.println(N);
}}
}}