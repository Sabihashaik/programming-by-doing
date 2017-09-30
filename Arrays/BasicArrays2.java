import java.util.*;
public class BasicArrays2 {
	public static void main(String[] args) {
		int[] A=new int[10];
		Random r=new Random();
		
		for(int i=0;i<A.length;i++) {
			A[i]=1+r.nextInt(100);
		}
		
		for(int i=0;i<A.length;i++) {
			System.out.println("Slot "+i+" contains a "+A[i]);
		}
	}
}
