package com.example;
import java.util.*;
public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date,billno;
        Scanner sc=new Scanner(System.in);
        System.out.println("Billdate");
        date=sc.nextInt();
        System.out.println("Billno");
        billno=sc.nextInt();
        if((billno%100==date||billno%10==date)&&(billno%date==0))
        {
            System.out.println("Hurray!! you're a lucky customer");
        }
        else{
            System.out.println("Oops,Better luck next time");
        }

	}

}
