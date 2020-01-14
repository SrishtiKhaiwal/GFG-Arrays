package Srishti;

public class ConvertArrayIntoZigZagFashion 
{
public static void main(String args[])
{
	int arr[]= {4 ,3 ,7 ,8 ,6 ,2 ,1};
	int n=arr.length;
	boolean flag = true;
	for(int i=0;i<n-2;i++)
	{
		if(flag)
		{
		if(arr[i]>arr[i+1])
		{
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		}
		}
		else
		{
			if(arr[i]<arr[i+1])
			{
				int temp1=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp1;
				}
		}
		flag=!flag;
		
	}
	for(int i=0;i<n;i++)
	System.out.print(arr[i]+" ");
}
}
