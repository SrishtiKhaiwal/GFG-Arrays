package Srishti;

public class MissingNumberInArray 
{
public static void main(String args[])
{
	int arr[]= {1,2,3,4,6,7,9};
	int n=arr.length;
	int missingNo=0;
	for(int i=0;i<n-1;i++)
	{
		if(arr[i+1]-arr[i]>1)
		{
			missingNo=arr[i]+1;	
			System.out.println(missingNo);
		}
	}
	
}
}
