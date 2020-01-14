package Srishti;

import java.util.*;
public class CountTheTriplets 
{
public static void main(String args[])
{
	int arr[]= {5, 32, 1, 7, 10, 50, 19, 21, 2};
	Arrays.sort(arr); 
	int n=arr.length;
	int flag=0,j=0,k=0;
	for(int i=n-1;i>=0;i--)
	{
		j=0;
		k=i-1;
		while(j<k)
		{
			if(arr[i]==arr[j]+arr[k])
			{
			System.out.println("numbers are " + arr[i] + " "+ arr[j] + " " + arr[k]); 
			flag=1;
			break;
			}
			else if(arr[i]>arr[j]+arr[k])
				j++;
			else
				k--;
		}
	}
	if(flag==0)
		System.out.println("Not found");
}
}
