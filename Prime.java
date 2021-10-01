package string1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,ct=0,i=1,j=1;
		while(n<6)
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
				n++;
			}
			i++;
		}
     System.out.println("the last prime is: "+(i-1));
	}

}
