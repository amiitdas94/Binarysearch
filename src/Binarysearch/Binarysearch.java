package Binarysearch;

public class Binarysearch 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,4,7,8,9,10,30,887};
		int x=30;
		int res=search(arr,x);
		if(res==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("found at index: "+res);
		}
	}
	static int search(int arr[],int x)
	{
		int l=0,r=arr.length-1;
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			if(arr[mid]==x)
			{
				return mid;
			}
			else if(arr[mid]<x)
			{
				l=mid+1;
			}
			else
			{
				r=mid-1;
			}
		}
		return -1;
	}
}
