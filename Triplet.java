package objectoriented;

public class Triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int k=0,sum=12;
		for(int i=1;i<=sum;i++)
		{
			for(int j=i;j<=sum;j++)
			{
				k=sum-i-j;
				if(i*i+j*j==k*k)
				{
					System.out.printf("%d %d %d",i,j,k);
				}
			}
		}
	}

}
