package fun;
import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min,max,res;
		Scanner sc=new Scanner(System.in);
		min=sc.nextInt();
		max=sc.nextInt();
		MinMax m1=new MinMax();
		res=m1.minmax(min,max);//actual parameters//function call
		System.out.println("max value is "+max);
		System.out.println("min value is "+min);

	}
	public static int minmax(int num1,int num2)//formal parameters//function definition
	{
		if(num1>num2)
		{
			return num1;
		}
		else
		{
			return num2;
		}
	}

}
