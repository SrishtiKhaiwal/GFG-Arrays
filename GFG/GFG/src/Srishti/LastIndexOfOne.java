package Srishti;

public class LastIndexOfOne 
{
public static void main(String args[])
{
	int arr[]= {1,2,3,1};
	int n=arr.length;
	int flag=0,i=0,a=0;
	for(i=0;i<n;i++)
	{
		if(arr[i]==1)
		{
			flag=1;
			a=i;
		}
	}
	if(flag==1)
		System.out.println(++a);
	else
		System.out.println(-1);
}
}
