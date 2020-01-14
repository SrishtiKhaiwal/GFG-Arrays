package Srishti;
import java.util.*; 
public class MergeWithoutExtraSpace 
{
public static void main(String args[])
{
	int arr1[]= {10};
	int arr2[]= {1,3,6,5};
	int n=arr1.length;
	int n1=arr2.length;
	int i=0,j=0,k=0;
	int arr3[]=new int[n+n1];
	while(i<n)
	{
	arr3[k++]=arr1[i++];
	}
	while(j<n1)
	{
	arr3[k++]=arr2[j++];
	}
	Arrays.sort(arr3);
	System.out.println("Array 1 ");
	for(int l=0;l<n;l++)
	{
		arr1[l]=arr3[l];
		System.out.print(arr1[l]+" ");
	}
	System.out.println(" ");

	System.out.println("Array 2 ");
	int t=n;
	for(int m=0;m<n1;m++)
	{
		
			arr2[m]=arr3[t++];
			System.out.print(arr2[m]+" ");
	}
	
}
}
