package objectoriented;
import java.util.*;

public class SmallestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
        	int b=sc.nextInt();
        	System.out.println(lcm(b));
        }

	}

	public static long gcd(long n1,long n2)
	{
		if(n2==0)
		{
			return n1;
		}
		return gcd(n2,n1%n2);
	}
	
	public static long lcm(int n)
	{
		long ans=1;
		for(long i=1;i<=n;i++)
		{
			ans=(ans*i)/gcd(ans,i);
		}
		return ans;
	}
}
