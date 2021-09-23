package string1;
import java.util.*;
public class stringtoken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Hello Welocome to Java";
        StringTokenizer st=new StringTokenizer(str," ");
        while(st.hasMoreTokens())
        {
        	System.out.println(st.nextToken());
        }

	}

}
