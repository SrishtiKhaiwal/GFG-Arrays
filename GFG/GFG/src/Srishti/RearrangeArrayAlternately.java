package Srishti;
public class RearrangeArrayAlternately 
{
public static void main(String args[])
{
	int arr1[]= {110,100,90,80,70,60,50,40,30,20,10};
	int n=arr1.length;
	int n1=arr1.length;
	int arr[]=new int[15];
	int k=0,l=0;
	for(int i=0;i<n1;i++)
	{
		if(i!=0 && i%2!=0)
		arr[k++]=arr1[--n];
		else
		arr[k++]=arr1[l++];
	}
	for(int i=0;i<n1;i++)
		System.out.print(arr[i]+" ");
	
}
}
