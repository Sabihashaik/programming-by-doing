import java.util.*;
public class BasicArraylists3 {
	public static void main(String[] args) {
		Random num=new Random();
		ArrayList<Integer> ar1=new ArrayList<Integer>(1000);
		
		for(int i=0;i<1000;i++) {
			int n=num.nextInt(1000);
			ar1.add(n);
		}
		System.out.printf("%s ", ar1);
		
	}
}
