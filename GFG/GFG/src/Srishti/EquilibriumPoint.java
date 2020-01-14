package Srishti;

public class EquilibriumPoint 
{
public static void main(String args[])
{
int arr[]= {1,3,5,2,2};	
int n=arr.length;
int sum=0,leftsum=0;
for(int i=0;i<n;i++)
sum=sum+arr[i];
for(int i=0;i<n;i++)
{
sum=sum-arr[i];
if(sum==leftsum)
System.out.println(++i);
leftsum=leftsum+arr[i];
}
} 
}

