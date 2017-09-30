import java.util.*;
public class CopyingArraylists {
	public static void main(String[] args) {
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		
		Random num= new Random();
		for(int i=0;i<10;i++) {
			int n= 1+num.nextInt(100);
			ar1.add(n);
		}
		int n=ar1.size()-1;
		ar2.addAll(ar1);	
		ar1.set(n, -7);
		
		System.out.println(ar1);
		System.out.println(ar2);
	}

}
