package Srishti;

public class LargestSumContiguousSubarray 
{
public static void main(String args[])
{
int arr[]= {-1,-2,-3,-4,-5};
int n=arr.length;
int start=0,ending=0;
for(int i=0;i<n;i++)
{
	ending=ending+arr[i];
	if(start<ending)
	{
		start =ending;
	}
	else if(ending <0)
		ending =0;
}
System.out.println(start+" "+ending);
}
}
