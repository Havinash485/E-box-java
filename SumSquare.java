package string1;
import java.util.*;

public class SumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       int sum=sumofsq(10);
       System.out.println("Sum of Square: "+sum);
      
       int sum1=squareofsum(10);
       System.out.println("Square of sum: "+sum1);
      
       int result=sum1-sum;
       System.out.println("result: "+result);

	}
	
	public static int sumofsq(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i*i;
		}
		return sum;
	}
	public static int squareofsum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum*sum;
	}

}
