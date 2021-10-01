package string1;

public class SumPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2,ct=0,i=1,j=1,sum=0;
		while(n<10)
		{
			j=1;
			ct=0;
			while(j<=i)
			{
				if(i%j==0)
					ct++;
				    j++;
			}
			if(ct==2)
			{
				sum+=i;
				n++;
			}
			i++;
		}
     System.out.println("the sum prime is: "+sum);
	}

}

