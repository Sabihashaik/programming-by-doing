import java.util.*;
public class CopyingArrays {
	public static void main(String[] args) {
		int A[]=new int[10];
		int B[]=new int[10];
		Random r=new Random();
		
		for(int i=0;i<A.length;i++) {
			A[i]=1+r.nextInt(100);
		}
		
		for(int i=0;i<B.length;i++) {
			B[i]=A[i];
		}
		
		
		//Changing value of A
		for(int i=0;i<A.length;i++) {
			A[A.length-1]=-7;
		}

		
		//Printing A1
		System.out.print("Array 1: ");
		for(int i=0;i<A.length;i++) {
				System.out.print(A[i]+" ");
		}
		System.out.println();
		
		
		//Printing A2
		System.out.print("Array 2: ");
		for(int i=0;i<B.length;i++) {
			System.out.print(B[i]+" ");
		}
		System.out.println();
	}
}
