import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class BasicArrays3 {
	public static void main(String[] args) {
		int A[]=new int[10];
		Random r=new Random();
		int min=10;
		int max=99;
		
		for(int i=0;i<A.length;i++) {
			//A[i]=r.nextInt((max-min)+1)+min;
			A[i]=ThreadLocalRandom.current().nextInt(min,max+1);
		}
		
		for(int i=0;i<A.length;i++) {
				System.out.printf("%d  ", A[i]);	
			}
	}
}
