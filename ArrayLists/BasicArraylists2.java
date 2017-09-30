import java.util.*;
public class BasicArraylists2 {
	public static void main(String[] args) {
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		Random num=new Random();
		for(int i=0;i<10;i++) {
			int n=1+num.nextInt(100);
			ar1.add(n);
		}
		System.out.println( "ArrayList: " + ar1 );
	}
}
