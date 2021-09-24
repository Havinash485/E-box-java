package com.example;

public class SumArray {
	public static void main(String[] args)
	{
		int arr[]= {1,3,5,7,11,13,17};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of elements in array is "+sum);

}
}