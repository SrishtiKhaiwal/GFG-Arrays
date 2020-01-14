package Srishti;
import java.util.*;
public class ChocolateDistributionProblem 
{
public static void main(String args[])
{
	int arr[]= {3 ,4 ,1 ,9, 56 ,7 ,9 ,12};
	int n=arr.length;
	Arrays.sort(arr);
	int m=5;
	int result=0,min=Integer.MAX_VALUE,diff=0,first=0,last=0;
	for(int i=0;i+m-1<n;i++)
	{
	diff=arr[i+m-1]-arr[i];
	if(diff<min)
	{
		min=diff;
		first=i;
		last=i+m-1;
	}
			
	}
	result=arr[last]-arr[first];
	System.out.println(result);
}
}
