package Srishti;

public class PythagoreanTriplet 
{
public static void main(String args[])
{
	int arr[]= {3 ,2 ,4 ,6 ,5};
	int n=arr.length;
	int x=0,y=0,z=0,flag=0;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n-1;j++)
		{
		for(int k=j+1;k<n;k++)
		{
			x=arr[i]*arr[i];
			y=arr[j]*arr[j];
			z=arr[k]*arr[k];
			if(x==y+z || y==x+z || z==x+y)
				flag=1;
		}
			
	}
	}
	if(flag==1)
		System.out.println("Yes");
	else
		System.out.println("No");
}
}
