package fun;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=0;
        int b=1,c;
        int sum=0;
        int[] arr=new int[10];
  
        for(int i=2;i<10;i++)
        {
         c=a+b;
         arr[i]=c;
         a=b;
         b=c;
         
        }
         for(int i=0;i<arr.length;i++)
         {
        	 if(arr[i]%2==0)
        	 {
        		 sum=sum+arr[i];
        	 }
         }
         System.out.println("the even valued terms: "+sum);
		
	}

}
