package Srishti;

public class TrappingRainWater 
{
public static void main(String args[])
{
	int arr[]= {7, 4 ,0 ,9};
	int n=arr.length;
	int count=0;
	for(int i=0;i<n;i++)
	{
		if(arr[0]<arr[n-1])
		{
			if(arr[0]>arr[i])
			{
			count=count+(arr[0]-arr[i]);	
			}
		}
		else if(arr[0]>arr[n-1])
		{
         if(arr[n-1]>arr[i])
			{
			count=count+(arr[n-1]-arr[i]);	
			}	
		}
	}
	System.out.println(count);
}
}
