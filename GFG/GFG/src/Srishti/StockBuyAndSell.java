package Srishti;

public class StockBuyAndSell 
{
public static void main(String args[])
{
	int arr[]= { 100, 180, 260, 310, 40, 535, 695 };
	int n=arr.length;
	int i=0,buy=0,sell=0;
	while(i<n-1)
	{
		while((i<n-1) && (arr[i+1]<=arr[i]))
			i++;
		if (i == n - 1) 
            break;
		buy=i++;
		while((i<n) && (arr[i]>=arr[i-1]))
			i++;
			sell=i-1;
			System.out.println("Buy on day"+" "+buy+" "+"Sell on day"+" "+sell);
	}
}
}
