package com.example;
import java.util.*;
public class Offer {
	public static void main(String[] args) {
		int p1,p2,p3;
		double tot,offer1,offer2;
		Scanner sc=new Scanner(System.in);
		System.out.println("p1 cost:");
		p1=sc.nextInt();
		System.out.println("p2 cost:");
		p2=sc.nextInt();
		System.out.println("p3 cost:");
		p3=sc.nextInt();
		tot=p1+p2+p3;
		System.out.println("total: "+tot);
		offer1=tot*0.2;
		if(p1<=p2&&p1<=p3)
		{
		    offer2=p1;
		}
		else if(p2<=p3)
		{
		    offer2=p2;
		}
		else{
		    offer2=p3;
		}
		if(offer1>offer2)
		{
		    System.out.println("you got offer1");
		}
		else{
		    System.out.println("you got offer2");
		}
	}

}
