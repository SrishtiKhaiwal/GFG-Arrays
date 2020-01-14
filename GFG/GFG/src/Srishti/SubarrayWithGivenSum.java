package Srishti;
public class SubarrayWithGivenSum 
{
public static void main(String args[])
{
	int arr[]= {15, 2, 4, 8, 9, 5, 10, 23};
	int n=arr.length;
	int sum=80,count=0,j=0,flag=0,i=0,p=0;
	
	for(i=0;i<n;i++)
	{
		count=arr[i];
		for(j=i+1;j<=n;j++)
		{
			if(count==sum)
			{
			p=j-1;
			System.out.println("Sum found between indexes " + i + " and " + p);
			flag=1;
			}
		
		if(count>sum || j==n )
			break;
		count=count+arr[i];
		}
	}
	if(flag==0)
	System.out.println("No subarray found"); 
}
}
