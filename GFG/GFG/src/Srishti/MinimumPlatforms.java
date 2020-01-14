package Srishti;
import java.util.*;
public class MinimumPlatforms 
{
public static void main(String args[])
{
	int arr[]= {900,940,950,1100,1500,1800};
	int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 
	Arrays.sort(arr);
	Arrays.sort(dep);
    int n = arr.length; 
    int platform=0,result=0;
    int i=0,j=0;
    while(i<n && j<n)
    {
    	if(arr[i]<dep[j])
    	{
    		platform++;
    		i++;
    		if(result<platform)
    			result=platform;
    	}
    	else
    	{
    		platform--;
    		j++;
    	}
    	
    }
    System.out.println(result);
}
}
