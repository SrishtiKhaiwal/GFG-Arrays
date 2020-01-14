package Srishti;

public class LeadersInAnArray 
{
public static void main(String args[])
{
int arr[]= {7,4,5,7,3};
int n=arr.length;
int count[]=new int[10000];
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
	 if(arr[i]>=arr[j])
	 {
		 count[i]++;
		
	 }
	else
		break;
	}
}
	for(int i=0;i<n;i++)
		if(count[i]==n-1-i)
		System.out.println(arr[i]);
}
}
