package Srishti;
//import java.util.*;
public class LargestNumberFormedFromAnArray 
{
public static void main(String args[])
{
	int arr[]= {54 ,546, 548, 60};
	int n=arr.length;
	//Arrays.sort(arr);
	int num=arr[0];
	for(int i=0;i<n;i++)
	{
		if(num<arr[i])
			num=arr[i];
	}
	System.out.print(num);
}
}
