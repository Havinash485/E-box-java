package string1;
import java.util.*;

public class LargestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		long num=sc.nextLong();
		for(int i=2;i<num;i++)
		{
			while(num%i==0)
			{
				num=num/i;
			}
		}

	  if(num>2)
	  {
		  System.out.println("The largest prime factor is: "+num);
	  }
	}

}
