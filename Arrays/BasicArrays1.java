public class BasicArrays1 {
	public static void main(String[] args) {
		int[] A=new int[10];
		
		for(int i=0;i<A.length;i++) {
			A[i]=-113;
		}
		
		for(int i=0;i<A.length;i++) {
			System.out.println("Slot "+i+" contains a "+A[i]);
		}
		
		
	}
}
