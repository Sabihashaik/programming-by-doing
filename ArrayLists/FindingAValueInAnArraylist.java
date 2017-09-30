import java.util.*;
public class FindingAValueInAnArraylist {
	public static void main(String[] args) {
		
		Random num=new Random();
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		Scanner inp=new Scanner(System.in);

		//Populating the Array
		for(int i=0;i<10;i++) {
			int n=1+num.nextInt(50);
			ar1.add(n);
		}
		
		System.out.println("ArrayList: "+ar1+" ");
		System.out.println("Value to find :");
		int in=inp.nextInt();
		
		//Searching
		for(int i=0;i<10;i++) {
			if(in==ar1.get(i)) {
				System.out.println(ar1.get(i)+" is in the ArrayList");
			}
		}
	}
}
