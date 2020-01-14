package Srishti;

public class NumberOfPairs 
{
public static void main(String args[])
{
	int arr1[]= {2,1,6};//x
	int n1=arr1.length;
	int arr2[]= {1,5};//y
	int n2=arr2.length;
	int count=0;
	for(int i=0 ;i<n1 ;i++ )
	{
	for(int j=0;j<n2;j++)
	{
		if(Math.pow(arr1[i], arr2[j])>Math.pow(arr2[j], arr1[i]))
		{
			count++;
			System.out.println(arr1[i]+"^"+arr2[j]+" > "+arr2[j]+"^"+arr1[i]);
		}
	}
	}
	System.out.println(count);
}
}
