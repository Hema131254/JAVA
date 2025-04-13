import java.util.*;
import java.util.ArrayList;
class Tcs{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
ArrayList<Integer> nums=new ArrayList<>();
int target=sc.nextInt();
int n=sc.nextInt();
for(int i=0;i<n;i++)
{nums.add(sc.nextInt());
}
System.out.println(search(nums,target));
}
public static int search(ArrayList<Integer> nums[], int target)
{
int n=nums.size();
int left=0;
int right=n-1;
while(left<=right)
{
int mid=left+(right-left)/2;
if(nums.get(mid)==target)
{return mid;}
else if(nums.get(mid)>target)
{right=mid-1;}
else if(nums.get(mid)<target)
{left=mid+1;}
}
return left;
}}