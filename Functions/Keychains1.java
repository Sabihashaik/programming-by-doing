import java.util.*;

class fns{
	
	public void add_keychains() {
		System.out.println("ADD KEYCHAINS");
	}
	
	public void remove_keychains() {
		System.out.println("REMOVE KEYCHAINS");
	}
	
	public void view_order() {
		System.out.println("VIEW KEYCHAINS");
	}
	
	public void checkout() {
		System.out.println("CHECKOUT");
		System.exit(0);
	}
	
}


public class Keychains1 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		fns f1=new fns();
		int ch;

			System.out.println("Ye Olde Keychain Shoppe");
			System.out.println("1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout");
			
			
			do {
				System.out.println("Please enter your choice:");
				ch=inp.nextInt();
			switch(ch) {
			case 1:		f1.add_keychains();break;
			case 2:		f1.remove_keychains();break;
			case 3:		f1.view_order();
						break;
			case 4:		f1.checkout();
						break;
								
			}
		}while(ch<4);
	}
}
