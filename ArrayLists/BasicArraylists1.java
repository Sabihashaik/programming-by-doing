import java.util.*;
public class BasicArraylists1 {
	public static void main(String[] args) {
		ArrayList<Integer> ar1=new ArrayList<Integer>(10);

		//Loop to insert
		for(int i=0;i<10;i++) {
			ar1.add(-113);
		}
		
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println("Slot "+i+" contains a "+ar1.get(i));
		}
	}
}
