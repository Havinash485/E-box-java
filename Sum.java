package fun;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(5));

	}
	public static int sum(int num)
	{
		if(num==1)
		{
			return 1;
		}
		else
		{
			return num+sum(num-1);
		}
	}

}
