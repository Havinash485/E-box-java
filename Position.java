package com.example;

public class Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,6,7,12,13,22};
		for(int i=0;i<arr.length;i=i+2)
		{
			System.out.println("even position:");
			System.out.println(arr[i]);
		}
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.println("odd position");
			System.out.println(arr[i]);
		}
	}

}
