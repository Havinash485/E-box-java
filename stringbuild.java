package string1;
import java.util.*;

public class stringbuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("Hello");
		System.out.println(str.append(" World"));
		System.out.println(str.insert(5,"_java"));
		System.out.println(str.replace(5,6," "));

	}

}
