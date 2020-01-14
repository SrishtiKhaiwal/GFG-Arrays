package Srishti;

public class ElementWithLeftSideSmallerAndRightSideGreater 
{
public static void main(String args[])
{
	int arr[]= {1,2,1};
	int n=arr.length,flag1=0,flag=0;
	for(int i=0;i<n;i++)
	{
		flag=0;
		flag1=0;
		for(int j=0;j<n;j++)
		{
			if(i<j)
			{
			if(arr[i]<arr[j])
			flag=1;
			}
			else if(i>j)
			{
			if(arr[i]>arr[j])
			flag1=1;
			}
		}
		if(flag==1 && flag1==1 )
			System.out.println(arr[i]);
		
		
	}
	if(flag==0 && flag1==0)
		System.out.println(-1);
}
}
